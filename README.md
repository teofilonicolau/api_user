# API User

This project is part of the Full Stack 2 Bootcamp. It is a Spring Boot application designed to manage users, courses, students, and other entities, demonstrating a complete CRUD operation setup.
![image](https://github.com/user-attachments/assets/e6c4b4dc-48b1-4c7c-9304-bd7ed043f0e4)


## Technologies Used

- Java 17
- Spring Boot 3.4.1
- Spring Data JPA
- Spring Boot DevTools
- Spring Boot Starter Validation
- Spring Boot Starter Web
- Spring Boot Starter Test(Has not been implemented yet)
- H2 Database
- Lombok
- Maven Compiler Plugin
- Spring Boot Maven Plugin
- Swagger UI (Springdoc OpenAPI)

## Getting Started
![image](https://github.com/user-attachments/assets/f5b85eb9-ce9f-40e9-99d3-93c0362b2d42)
![image](https://github.com/user-attachments/assets/7251b945-6362-4ea2-923c-138c7ab26cdc)
![image](https://github.com/user-attachments/assets/5c832dbc-0a13-40a7-bba7-9be7619de8c2)
![image](https://github.com/user-attachments/assets/f4c5b70d-a4a8-462a-8c9e-c75dcc8f1920)
![image](https://github.com/user-attachments/assets/726996c6-db0f-4e1c-93a7-69876c67780e)






### Prerequisites

- Java 17
- Maven

### Installation

1. **Clone the repository**:
   ```sh
      git clone https://github.com/teofilonicolau/api_user.git
   ```
2. **Navigate to the project directory**:

  ```sh
      cd api_user

 ```
3. **Build the project using Maven**:
    ```sh
      mvn clean install
   ```
4. **Run the application**:
   ```sh
      mvn spring-boot:run

   ```
  ## API Endpoints
  ### User Endpoints 
   - **Create User with Profile**:
   - **Method**: POST
   - **URL**: /api/usuarios
   - **Body**:
   ```sh
       {
           "nome": "Erik",
           "profile": {
               "bio": "Dev"
           }
      }


   ```
### Student Endpoints
  - **Create Student**

  - **Method: POST**

 - **URL: /students**
   **Body**:
   ```sh
      {
        "name": "Estudante 1"
      }
   ```
## Course Endpoints
   
  - **Create Course**

  - **Method**: POST

 -  **URL**: /courses

  - **Body**: 
     ```sh
      {
        "title": "Novo Curso"
      }

    ```

   - **Enroll Student in Course**  

 - Method: POST

 - URL: /students/{studentId}/enroll/{courseId}

 ## Produto Endpoints

### List All Products

- **Method**: GET
- **URL**: `/produtos`

### Get Product by ID

- **Method**: GET
- **URL**: `/produtos/{id}`

### Create Product

- **Method**: POST
- **URL**: `/produtos`
- **Body**:
     ```sh
      {
        "nome": "Produto 1",
        "preco": 29.99
      }

    ```



## Product Endpoints

### Delete Product by ID
- **Method**: DELETE
- **URL**: `/produtos/{id}`

## Author Endpoints

### List All Authors
- **Method**: GET
- **URL**: `/authors`

### Get Author by ID
- **Method**: GET
- **URL**: `/authors/{id}`

### Create Author
- **Method**: POST
- **URL**: `/authors`
- **Body**:

  ```json
   {
       "name": "Autor 1"
  }
  ```




### Delete Author by ID
 - **Method**: DELETE
 - **URL**: /authors/{id}



## Book Endpoints

### List All Books
- **Method**: GET
- **URL**: /books

### Get Book by ID
- **Method**: GET
- **URL**: /books/{id}

### Create Book
- **Method**: POST
- **URL**: /books
- **Body**:
```json
  {
      "title": "Livro 1",
      "author": {
          "id": 1
      }
  }
 ```
### Delete Book by ID
 - **Method**: DELETE
 - **UR**L: /books/{id}

### Profile Endpoints

### List All Profiles
- **Method**: GET
- **URL**: `/profiles`

### Get Profile by ID
- **Method**: GET
- **URL**: `/profiles/{id}`

### Create Profile
- **Method**: POST
- **URL**: `/profiles`
- **Body**:
```json
    {
      "bio": "Esta é a biografia."
   }
 ```
### Delete Profile by ID
- **Method**: DELETE
- **URL**: /profiles/{id}

 ## Swagger UI
 -**The API documentation can be accessed through Swagger UI at**:
  - http://localhost:8080/swagger-ui/index.html
  


  
     
  
   
   
   
       



   
 
