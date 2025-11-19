package com.example.JWTProject.config;


import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component // @Component is a Spring annotation that tells the Spring framework:
            // “This is a class that should be managed as a Spring bean.”
public class JwtFilter extends OncePerRequestFilter  { // OncePerRequestFilter is a Spring Security helper class that ensures your filter is executed exactly once per HTTP request.

    @Autowired // @Autowired is an annotation used for “Automatically inject an instance of this bean here.”
    private JwtUtil jwtUtil;

    @Override
    protected void doFilterInternal(
            HttpServletRequest request, // incomming Http request
            HttpServletResponse response, // lets you modify Http response
            FilterChain filterChain // lets you pass control to the next filter in the chain
    ) throws ServletException, IOException {

        String authHeader = request.getHeader("Authorization");

        if (authHeader != null && authHeader.startsWith("Bearer ")) { // JWT tokens are usually sent as Bearer tokens in the header.

            String token = authHeader.substring(7);

            if (jwtUtil.validate(token)) {
                String username = jwtUtil.extractUsername(token);

                //UsernamePasswordAuthenticationToken is a Spring Security object that represents an authenticated user
                UsernamePasswordAuthenticationToken authToken =
                        new UsernamePasswordAuthenticationToken(username, null, null);

                authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

                SecurityContextHolder.getContext().setAuthentication(authToken);
            }
        }

        filterChain.doFilter(request, response);
    }
}


