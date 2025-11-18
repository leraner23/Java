## JSON Web Token (JWT)

**JWT (JSON Web Token)** is a digital ID card/token used in web applications to verify **who the user is**.  
It is commonly used for **authentication** and is signed with a secret key to ensure security.

### 🔑 Structure of JWT

A JWT consists of **three parts** separated by dots:
**header.payload.signature**

#### 1. Header
The header contains metadata about the token, including the **hashing algorithm** and **token type**.

```json
{
  "alg": "HS256",
  "typ": "JWT"
}
```

##### 2. Payload
The payload contains basic user details or claims.
```json
{
  "sub": "1234567890",
  "name": "Learner",
  "admin": true,
  "iat": 1516239022
}
```
##### 3. Signature
Signature ==> header + payload + secretKey (prevents from tampering the token)

HMACSHA256(
  base64UrlEncode(header) + "." +
  base64UrlEncode(payload),
  secretKey
)



## How does JWT Works:
<img width="893" height="561" alt="image" src="https://github.com/user-attachments/assets/f93b5bb7-5d9f-475e-9dfb-bff8d19db641" />

# JWT Project

This is a **simple Spring Boot project** that demonstrates how **JWT tokens are generated, verified, and used for authentication**.

---

## ⚙️ Project Setup

### 1. Dependencies
Make sure to include the following **Maven dependencies** in your `pom.xml`:

```xml
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
</dependency>
```

### 2. Application Properties
jwt.secret=jsh72H3lz8xAAmk29jpq9Dsb3vH2lT8Bv8isRzFJHx0q4Wdsjksm==  # Replace with your own secret

jwt.expiration=3600000                                             # Token expiration in milliseconds (1 hour)

### 3. Outputs:
<img width="1302" height="681" alt="Screenshot 2025-11-18 231948" src="https://github.com/user-attachments/assets/32fefba3-a854-4218-b440-5aa63465dbce" />
<img width="1203" height="811" alt="Screenshot 2025-11-18 232002" src="https://github.com/user-attachments/assets/a2a406ed-2ed1-4b88-ac39-759ec91a94a2" />


    
		</dependency>
