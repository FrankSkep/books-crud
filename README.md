# <div align="center">Library CRUD</div>

## Descripción

Aplicación web CRUD para gestionar una colección de libros. Se implementa con un backend independiente, desarrollado con **Java y Spring Boot**, y un frontend desarrollado con **SvelteKit y Bootstrap**.

### Propósito

El objetivo principal de este proyecto fue crear una arquitectura de aplicación separada, con un **backend** y un **frontend** desacoplados, para probar el consumo de una API RESTful desde una aplicación frontend.

## Características

### Backend

- **CRUD de Libros**: Crear, leer, actualizar y eliminar libros.
- **Paginación**: Soporte para paginación en la lista de libros.
- **Filtrado**: Filtrado de libros por título y autor.
- **Validación**: Validación de datos de entrada.
- **Manejo de Excepciones**: Gestión de errores y excepciones.

### Frontend

- **Listado de Libros**: Visualización de la lista de libros con paginación y filtrado.
- **Formulario de Libros**: Formularios para agregar y editar libros.
- **Notificaciones**: Notificaciones de éxito y error.
- **Navegación**: Navegación entre las diferentes vistas de la aplicación.

## Tecnologías

### Backend

- **Java**
- **Spring Boot**
- **PostgreSQL**

#### [Endpoints](backend/README.md)

### Frontend

- **SvelteKit**
- **Bootstrap**
- **Node.js**

## Requisitos

- **JDK 21**
- **Node.js** y **npm**
- **PostgreSQL**

## Instalación y Ejecución

### Backend

1. Clona el repositorio:

   ```sh
   git clone https://github.com/FrankSkep/library-crud
   cd library-crud/backend
   ```

2. Configura la base de datos en `.env.template`, renombra a `.env` y agrega los detalles de tu instancia de **PostgreSQL**.

3. Construye y ejecuta el proyecto:

   ```sh
   mvn clean install
   mvn spring-boot:run
   ```

   El backend estará disponible en `http://localhost:8000`.

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