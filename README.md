📝 Todo App Backend API (Spring Boot)

Welcome to the Todo Application Backend API built with Spring Boot 💻 — a powerful, production-ready RESTful API designed for managing your daily tasks efficiently.
This backend service provides all essential CRUD operations (Create, Read, Update, Delete) for managing todos 🧠, with structured layers and clean code architecture following best practices in Spring Boot.


⚙️ Tech Stack

☕ Java 17+

🌱 Spring Boot 3.x

🗃️ MySQL Database

🧩 Spring Data JPA

🔄 RESTful APIs

🧰 Lombok

🧪 Postman for API Testing



🚀 Key Features

✨ Full CRUD Operations for Todo Management
✨ REST API with proper Response Entities
✨ Layered Architecture: Controller → Service → Repository → Entity
✨ Exception Handling & Validation
✨ MySQL Database Integration
✨ Easy Integration with React + Tailwind Frontend




🧑‍💻 Developer Information

👤 Developer: Amit Yadav
💼 Role: Java Full Stack Developer
📍 Location: Azamgarh, Uttar Pradesh, India
📧 Contact: ay3106222@gmail.com
🗓️ Project Created: October 2025




🧱 API Endpoints
Method	Endpoint	Description
POST	/api/todos	➕ Create a new todo
GET	/api/todos	📋 Get all todos
GET	/api/todos/{id}	🔍 Get todo by ID
PUT	/api/todos/{id}	✏️ Update todo
DELETE	/api/todos/{id}	❌ Delete todo




🗄️ Database Configuration

Update your application.properties file 👇

spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
server.port=8080



🧩 Project Structure
📦 todo-backend
 ┣ 📂 src/main/java/com/example/todo
 ┃ ┣ 📂 controller
 ┃ ┣ 📂 service
 ┃ ┣ 📂 repository
 ┃ ┣ 📂 entity
 ┃ ┗ 📂 exception
 ┣ 📂 src/main/resources
 ┃ ┗ 📜 application.properties
 ┗ 📜 pom.xml


 🧪 Testing the API

Install Postman 🧰

Run the project using your IDE or command:

mvn spring-boot:run


Use the following endpoints to test:

POST → http://localhost:8080/api/todos

GET → http://localhost:8080/api/todos

PUT → http://localhost:8080/api/todos/{id}

DELETE → http://localhost:8080/api/todos/{id}

📦 How to Run Locally
# Clone the repository
git clone https://github.com/Amt610/TodoApp_Backend_Api.git

# Navigate to project folder
cd todo-backend

# Build the project
mvn clean install

# Run the app
mvn spring-boot:run

🧠 Future Enhancements

🚀 Add user authentication & JWT
📅 Add due dates and reminders
📱 Integrate with React + Tailwind frontend
☁️ Deploy on Render / AWS
