package com.example.JWTProject.config;


import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import java.security.Key;
import java.util.Date;

@Component
public class JwtUtil {

    @Value("${jwt.secret}") // @Values annotataion injects configuration values directly from your property file
                            // into your Java class at runtime.
    private String secret;

    @Value("${jwt.expiration}")
    private long expirationMs;

    private Key getSigningKey() {
        return Keys.hmacShaKeyFor(secret.getBytes());
        // secret.getBytes() Converts your string into a byte array.
        // Keys.hmacShaKeyFor() checks the secret length is valid & converts the byte[] into a Key that can be used for HS256 signing
    }

    // token generation
    public String generateToken(String username) {
        return Jwts.builder() // creates the new JWT builder object
                .setSubject(username) // "sub": "ram123"

                .setIssuedAt(new Date()) // issues the timestamp
                .setExpiration(new Date(System.currentTimeMillis() + expirationMs)) //"exp": 1731891200
                .signWith(getSigningKey(), SignatureAlgorithm.HS256) // secret key
                .compact(); // compacting and builds the final string
    }

    //this methods checks using secret key if the token is validate or not and extreact the sub from the token
    public String extractUsername(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(getSigningKey())  // set the key for signature validation
                .build()
                .parseClaimsJws(token)        // parse and validate the JWT
                .getBody()
                .getSubject();                // extract "sub" claim
    }

    // this method checks if the token is properly signed, not tampered, and not expired then true otherwise false
    public boolean validate(String token) {
        try {
            Jwts.parserBuilder()
                    .setSigningKey(getSigningKey()) // gets secret key
                    .build()
                    .parseClaimsJws(token); // Checks signature using your secret key &
                                            // Checks expiration (if exp claim exists) & Checks token format
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
