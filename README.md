# <div align="center">Library CRUD</div>

## Descripción

Este proyecto es una aplicación web CRUD para gestionar una colección de libros. Se implementa con un backend independiente, desarrollado con **Spring Boot** y **PostgreSQL**, y un frontend desarrollado con **SvelteKit**. La API REST del backend es consumida por el frontend, proporcionando una interfaz interactiva para gestionar los datos de los libros.

### Propósito

El objetivo principal de este proyecto fue crear una arquitectura de aplicación separada, con un **backend** y un **frontend** desacoplados, para demostrar el consumo de una API RESTful desde una aplicación frontend.

## Tecnologías

### Backend

- **Java 21**: Lenguaje de programación principal.
- **Spring Boot**: Framework para crear aplicaciones web y servicios RESTful.
- **PostgreSQL**: Base de datos relacional utilizada para almacenar los datos de los libros.
- **Maven**: Herramienta de gestión de proyectos y dependencias.

#### [Endpoints API](backend/README.md)

### Frontend

- **SvelteKit**: Framework frontend para crear aplicaciones web modernas y rápidas.
- **Bootstrap**: Framework de estilos para el diseño de la interfaz de usuario.
- **Node.js**: Entorno de ejecución para la aplicación frontend.

## Requisitos

- **Java 21** (para el backend)
- **Maven** (para gestionar dependencias del backend)
- **Node.js** y **npm** (para el frontend)
- **PostgreSQL** (base de datos)

## Instalación y Ejecución

### Backend

1. Clona el repositorio:

   ```sh
   git clone https://github.com/FrankSkep/library-crud
   cd library-crud/backend
   ```

2. Configura la base de datos en `src/main/resources/application.properties`, agregando los detalles de tu instancia de **PostgreSQL**.

3. Construye y ejecuta el proyecto:

   ```sh
   ./mvnw clean install
   ./mvnw spring-boot:run
   ```

   El backend estará disponible en `http://localhost:8080`.

### Frontend

1. Clona el repositorio:

   ```sh
   git clone https://github.com/FrankSkep/library-crud
   cd library-crud/frontend
   ```

2. Instala las dependencias:

   ```sh
   npm install
   ```

3. Ejecuta el proyecto:

   ```sh
   npm run dev
   ```

   El frontend estará disponible en `http://localhost:5173`.

## Estructura del Proyecto

### Backend

- `/src/main/java/`: Código fuente del backend (Controladores, servicios, repositorios).
- `/src/main/resources/`: Archivos de configuración y recursos, como `application.properties`.

### Frontend

- `/src/routes`: Páginas y rutas de la aplicación SvelteKit.
- `/src/lib`: Componentes reutilizables y utilidades.