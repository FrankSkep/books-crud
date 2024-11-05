# <div align="center">Crud web Spring boot y Sveltekit</div>

## Descripcion

Aplicación web CRUD para gestionar una colección de libros. El proyecto consta de una API REST pequeñá desarrollada con Java, Spring Boot y PostgreSQL, y un frontend desarrollado con SvelteKit.

## Requisitos

### Backend

- Java 21 (Lenguaje de programación)
- Maven (Herramienta de gestión de proyectos)
- Spring Boot (Framework de desarrollo)
- PostgreSQL (Base de datos)

#### [Endpoints API](backend/README.md)

### Frontend

- SvelteKit (Framework de desarrollo)
- Bootstrap (Framework de estilos)
- Node.js (Entorno de ejecución)

## Instalación y Ejecución

### Backend

1. Clona el repositorio:

   ```sh
   git clone https://github.com/FrankSkep/books-crud
   cd books-crud/backend
   ```

2. Configura la base de datos PostgreSQL en `application.properties`.

3. Construye el proyecto y ejecuta el servidor local:
   ```sh
   ./mvnw clean install
   ./mvnw spring-boot:run
   ```

### Frontend

1. Clona el repositorio:

   ```sh
   git clone https://github.com/FrankSkep/books-crud
   cd books-crud/frontend
   ```

2. Instala las dependencias:

   ```sh
   npm install
   ```

3. Ejecuta el proyecto:

   ```sh
   npm run dev
   ```

4. Ejecuta la aplicacion en `http://localhost:5173`.

## Estructura del Proyecto

### Backend

- `/src/main/java/`: Código fuente del backend.
- `/src/main/resources/`: Archivos de configuración y recursos.

### Frontend

- `/src/routes`: Páginas y rutas de la aplicación SvelteKit.
- `/src/lib`: Componentes y utilidades.
