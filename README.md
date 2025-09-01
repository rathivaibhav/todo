# todo
# 📝 Todo Application

A simple yet powerful **Todo Application** showcasing CRUD functionality with **Spring Boot 3, Thymeleaf, and MySQL**.  
Built with clean layered architecture: **Controller → Service → Repository → Entity** 🚀  

---

## ✨ Features
- ✅ Add new tasks  
- ✅ Toggle completion status  
- ✅ Delete tasks  
- ✅ Responsive UI with **Bootstrap 5**  
- ✅ Persistent storage using **Spring Data JPA + Hibernate**  

---

## 🛠 Tech Stack
| Layer         | Technology |
|---------------|------------|
| **Backend**   | Spring Boot 3, Spring MVC, Spring Data JPA, Hibernate |
| **Frontend**  | Thymeleaf, Bootstrap 5 |
| **Database**  | MySQL |
| **Utilities** | Maven, Lombok |

---

## 📂 Project Structure
```bash
src/main/java/com/app/todoapp
├── controller   # Handles HTTP requests (TaskController)
├── services     # Business logic (TaskService)
├── repository   # Data access layer (TaskRepository)
├── models       # Entity classes (Task.java)
