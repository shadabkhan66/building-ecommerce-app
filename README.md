
# 🛒 E-commerce REST API

A full-stack **E-commerce backend application** built with **Spring Boot** that provides RESTful APIs for user authentication, product management, cart, and order handling.

This project is designed with a layered architecture (Controller → Service → Repository) and supports **JWT authentication**, **role-based access**, and **relational databases** (MySQL/PostgreSQL).

---

## 🚀 Tech Stack

* **Spring Boot** – core framework
* **Spring Web** – for REST API development
* **Spring Data JPA + Hibernate** – ORM for database operations
* **MySQL / PostgreSQL** – production database
* **H2** – in-memory DB for development/testing
* **Spring Security (JWT Auth)** – authentication & authorization (Phase 3)
* **Maven/Gradle** – build tool

---

## 📂 Project Structure

```
src/main/java/com/ecommerce
    ├── controller       # REST controllers (API endpoints)
    ├── service          # Business logic
    ├── service/impl     # Service implementations
    ├── repository       # JPA repositories
    ├── model/entity     # Database entities
    ├── dto              # Data Transfer Objects
    ├── config           # Security, CORS configs
```

---

## 🔑 API Endpoints

### Authentication

* `POST /api/auth/register` → Register new user
* `POST /api/auth/login` → Login & get JWT token

### User Management

* `GET /api/users/{id}` → Get user details
* `PUT /api/users/{id}` → Update user profile

### Products & Categories

* `GET /api/products` → List all products

* `GET /api/products/{id}` → Get product details

* `POST /api/products` → Add product (**Admin only**)

* `PUT /api/products/{id}` → Update product (**Admin only**)

* `DELETE /api/products/{id}` → Delete product (**Admin only**)

* `GET /api/categories` → List all categories

* `POST /api/categories` → Add category (**Admin only**)

### Cart

* `GET /api/cart` → View current user’s cart
* `POST /api/cart/add` → Add product to cart
* `PUT /api/cart/update` → Update quantity
* `DELETE /api/cart/remove/{productId}` → Remove product from cart

### Orders

* `POST /api/orders` → Place order from cart
* `GET /api/orders` → List user’s orders
* `GET /api/orders/{id}` → Get order details

### Admin (Advanced Phase)

* `GET /api/admin/orders` → List all orders
* `GET /api/admin/users` → List all users

---

## 📊 Sample JSON Response

**Product Example**

```json
{
  "id": 101,
  "name": "Wireless Mouse",
  "description": "Ergonomic mouse with 2.4GHz connectivity",
  "price": 799.00,
  "stock": 25,
  "category": {
    "id": 5,
    "name": "Electronics"
  }
}
```

---

## 🔄 Request Flow

1. Frontend (React) calls `/api/...` endpoint
2. Controller receives request → forwards to Service
3. Service handles business logic → interacts with Repository
4. Repository uses JPA/Hibernate to query Database
5. Response is mapped into DTO → returned as JSON

---

## 📅 Iteration Plan

* **Phase 1**: Authentication + Product Listing
* **Phase 2**: Cart + Orders
* **Phase 3**: Admin Endpoints + JWT Security
* **Phase 4**: Connect React frontend

---

## 🛠 Setup & Run

### Prerequisites

* JDK 17+
* Maven
* MySQL/PostgreSQL/MongoDB (or H2 for dev)(different DB for for different profile)

### Steps

```bash
# Clone repo
git clone https://github.com/your-username/ecommerce-api.git
cd ecommerce-api

# Build & run
mvn spring-boot:run
```

The API will be available at:
👉 `http://localhost:8080/api`

---

## 📌 Next Steps

* [ ] Implement JWT authentication (Spring Security)
* [ ] Add role-based authorization
* [ ] Dockerize the app
* [ ] Deploy to cloud (AWS/GCP/Heroku)

---

## 👨‍💻 Author

**Shadab Khan**
🔗 [GitHub Profile](https://github.com/shadabkhan66)

---


