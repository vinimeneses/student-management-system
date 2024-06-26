# Student Management System

This is a Student Management System built with Java, Spring Boot, MySQL, and Thymeleaf.

## Features

- List all students
- Create a new student
- Edit student details
- Delete a student
- View individual student details

## Print Screens of the Application
![img.png](img.png)

![img_1.png](img_1.png)

![img_2.png](img_2.png)

## Setup and Installation

1. Clone the repository to your local machine.
2. Navigate to the project directory.
3. Configure the database connection details with MySQL.
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/sms
spring.datasource.username=root
spring.datasource.password=1234

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
````
3. Run the project using your IDE.

## Usage

The application runs on `localhost:8080`. You can interact with the system through the following endpoints:

- `/students` - List all students
- `/students/new` - Create a new student
- `/students/{studentId}/edit` - Edit a student
- `/students/{studentId}/delete` - Delete a student
- `/students/{studentId}/view` - View a student

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

