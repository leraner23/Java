JWT Token: (JSON Web Token) is a digital ID card/ token that is used in web application for verifying the who the user is.
It is used for Authentication with special key.
Strucutre of JWT Token: header.payload.signature
Header ==> contains hashing algorithm and token type
Example: {
  "alg": "HS256",
  "typ": "JWT"
}

payload ==> Basic details (user data)
{
  "sub": "1234567890",
  "name": "Learner",
  "admin": true,
  "iat": 1516239022
}

Signature ==> header + payload + secretKey  
(prevents from tampering the token) 


How does JWT token works:
<img width="893" height="561" alt="image" src="https://github.com/user-attachments/assets/f93b5bb7-5d9f-475e-9dfb-bff8d19db641" />

JWT Project: It is the simple springboot project that shows how the JWT token is generated, verifeid and how it is authenticated.
Note: 
1) Need to have this dependencies => 
<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-api</artifactId>
			<version>0.11.5</version>
		</dependency>
		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-impl</artifactId>
			<version>0.11.5</version>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-jackson</artifactId>
			<version>0.11.5</version>
			<scope>runtime</scope>

2) Need to give jwt secretKey and jwt expiration in properties
jwt.secret=jwt.secret=jsh72H3lz8xAAmk29jpq9Dsb3vH2lT8Bv8isRzFJHx0q4Wdsjksm== // your own
jwt.expiration=3600000

3) this projects outputs:
  <img width="1302" height="681" alt="Screenshot 2025-11-18 231948" src="https://github.com/user-attachments/assets/32fefba3-a854-4218-b440-5aa63465dbce" />


<img width="1203" height="811" alt="Screenshot 2025-11-18 232002" src="https://github.com/user-attachments/assets/a2a406ed-2ed1-4b88-ac39-759ec91a94a2" />


    
		</dependency>
