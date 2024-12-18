# <div align="center">Library CRUD</div>

## Description

This project is a web application for managing a collection of books using a CRUD interface. It features a decoupled architecture with an independent backend developed using **Spring Boot** and **PostgreSQL**, and a frontend developed with **SvelteKit**. The backend's REST API is consumed by the frontend, providing an interactive interface to manage book data.

### Purpose

The primary goal of this project was to create a separate application architecture, with a decoupled **backend** and **frontend**, to demonstrate the consumption of a RESTful API from a frontend application.

## Technologies

### Backend

- **Java 21**: Main programming language.
- **Spring Boot**: Framework for creating web applications and RESTful services.
- **PostgreSQL**: Relational database used to store book data.
- **Maven**: Project and dependency management tool.

#### [API Endpoints](backend/README.md)

### Frontend

- **SvelteKit**: Frontend framework for building modern and fast web applications.
- **Bootstrap**: CSS framework for designing the user interface.
- **Node.js**: Runtime environment for the frontend application.

## Requirements

- **Java 21** (for the backend)
- **Maven** (for managing backend dependencies)
- **Node.js** and **npm** (for the frontend)
- **PostgreSQL** (database)

## Installation and Running

### Backend

1. Clone the repository:

   ```sh
   git clone https://github.com/FrankSkep/library-crud
   cd library-crud/backend
   ```

2. Configure the database in `src/main/resources/application.properties`, adding the details of your **PostgreSQL** instance.

3. Build and run the project:

   ```sh
   ./mvnw clean install
   ./mvnw spring-boot:run
   ```

   The backend will be available at `http://localhost:8080`.

### Frontend

1. Clone the repository:

   ```sh
   git clone https://github.com/FrankSkep/library-crud
   cd library-crud/frontend
   ```

2. Install the dependencies:

   ```sh
   npm install
   ```

3. Run the project:

   ```sh
   npm run dev
   ```

   The frontend will be available at `http://localhost:5173`.

## Project Structure

### Backend

- `/src/main/java/`: Backend source code (Controllers, services, repositories).
- `/src/main/resources/`: Configuration files and resources, such as `application.properties`.

### Frontend

- `/src/routes`: Pages and routes of the SvelteKit application.
- `/src/lib`: Reusable components and utilities.