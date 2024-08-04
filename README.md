# <div align="center">Gestión de Libros</div>

## Descripcion

Aplicación web que permite gestionar una colección de libros mediante operaciones CRUD (Crear, Leer, Actualizar y Borrar) sobre los datos almacenados en una base de datos PostgreSQL. El proyecto consta de una API REST desarrollada con Java y Spring Boot, y un frontend construido con SvelteKit para la interaccion con la API y Bootstrap para el estilo de las interfaces.

## Requisitos

### Backend
- Java 21
- Maven
- Spring Boot 3.2.7
- PostgreSQL

### Frontend
- Node.js (versión LTS)
- SvelteKit
- Bootstrap

## Instalación y Ejecución

### Backend

1. Clona el repositorio:
    ```sh
    git clone https://github.com/FrankSkep/Books_CRUD
    cd Books_CRUD/backend
    ```

2. Configura la base de datos PostgreSQL en `application.properties`.

3. Ejecuta el servidor local:
    ```sh
    mvn clean install
    java -jar target\apirest-1.0.jar
    ```

### Frontend

1. Clona el repositorio:
    ```sh
    git clone https://github.com/FrankSkep/Books_CRUD
    cd Books_CRUD/frontend
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

## Tecnologías Utilizadas
- Java
- Spring Boot
- PostgreSQL
- SvelteKit
- Bootstrap
