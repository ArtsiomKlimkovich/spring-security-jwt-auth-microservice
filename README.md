<h1 align="center">Auth Microservice</h1>
<h3 align="center">A Spring Boot application for handling authentication and authorization.</h3>

<h3 align="left">Description:</h3>
<p align="left">
  The **Auth Microservice** handles user authentication and token management using JWT. It provides endpoints for user registration, login, and token refreshing. This service is built using Spring Boot and Spring Security.
</p>

<h3 align="left">Endpoints:</h3>

<h4>Admin Endpoints</h4>
<p>
  <strong>GET /api/v1/admin</strong><br/>
  Returns a greeting message for admin users.<br/>
  <strong>Response:</strong>
  <pre>
  {
    "message": "Hi admin"
  }
  </pre>
</p>

<h4>User Endpoints</h4>
<p>
  <strong>GET /api/v1/user</strong><br/>
  Returns a greeting message for regular users.<br/>
  <strong>Response:</strong>
  <pre>
  {
    "message": "Hi User"
  }
  </pre>
</p>

<h4>Authentication Endpoints</h4>
<p>
  <strong>POST /api/v1/auth/signUp</strong><br/>
  Registers a new user.<br/>
  <strong>Request Body:</strong>
  <pre>
  {
    "firstName": "string",
    "lastName:"string",
    "email": "string",
    "password": "string"
  }
  </pre>
  <strong>Response:</strong>
  <pre>
  {
    "email": "string",
    "password": "string"
  }
  </pre>
</p>

<p>
  <strong>POST /api/v1/auth/signIn</strong><br/>
  Authenticates a user and returns JWT tokens.<br/>
  <strong>Request Body:</strong>
  <pre>
  {
    "username": "string",
    "password": "string"
  }
  </pre>
  <strong>Response:</strong>
  <pre>
  {
    "accessToken": "string",
    "refreshToken": "string"
  }
  </pre>
</p>

<p>
  <strong>POST /api/v1/auth/refresh</strong><br/>
  Refreshes the JWT token using a refresh token.<br/>
  <strong>Request Body:</strong>
  <pre>
  {
    "refreshToken": "string"
  }
  </pre>
  <strong>Response:</strong>
  <pre>
  {
    "accessToken": "string",
    "refreshToken": "string"
  }
  </pre>
</p>

<h3 align="left">How to Run:</h3>
<pre>
1. Clone the Repository:
    git clone <repository-url>

2. Navigate to the Project Directory:
    cd auth-microservice

3. Build and Run the Application:
    ./mvnw spring-boot:run

4. Access the Application:
    - Admin endpoint: http://localhost:8080/api/v1/admin
    - User endpoint: http://localhost:8080/api/v1/user
    - Authentication endpoints: http://localhost:8080/api/v1/auth
</pre>

<h3 align="left">Languages and Tools:</h3>
<p align="left">
  <a href="https://spring.io/" target="_blank" rel="noreferrer">
    <img src="https://www.vectorlogo.zone/logos/springio/springio-icon.svg" alt="spring" width="40" height="40"/>
  </a>
  <a href="https://www.java.com" target="_blank" rel="noreferrer">
    <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/>
  </a>
  <a href="https://www.mysql.com/" target="_blank" rel="noreferrer">
    <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/mysql/mysql-original-wordmark.svg" alt="mysql" width="40" height="40"/>
  </a>
</p>

<h3 align="left">License:</h3>
<p align="left">
  This project is licensed under the MIT License.
</p>
