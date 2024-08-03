# API REST Spring Boot

## Descripción
API REST desarrollada con Java y Spring Boot, permite gestionar una colección de libros, proporcionando operaciones CRUD (Crear, Leer, Actualizar y Borrar) sobre los libros almacenados en una base de datos PostgreSQL.

## Requisitos
- Java 21
- Spring Boot 3.2.7
- PostgreSQL

## Endpoints

* **GET /book**
  
  * Retorna todos los libros almacenados.
  * **Método HTTP:** GET
  * **Respuesta:** Retorna una lista con todos los libros, sino hay libros, retorna un error 404.

* **GET /book/{id}**
  
  * Retorna un libro específico por su ID.
  * **Parámetros de Ruta:** `{id}` - ID del libro.
  * **Método HTTP:** GET
  * **Respuesta:** Retorna los detalles del libro con el ID especificado, si no se encuentra, retorna un error 404.

* **POST /book**
  
  * Crea uno o varios libros nuevos en la base de datos.
  * **Método HTTP:** POST
  * **Cuerpo de la Petición:** Un arreglo de objetos JSON con detalles de los libros a crear.
  * **Respuesta:** Retorna los detalles de los libros creados. Si hay algún error durante la creación de los libros, retorna un mensaje de error.

* **PUT /book/{id}**
  
  * Actualiza la información de un libro existente por su ID.
  * **Parámetros de Ruta:** `{id}` - ID del libro a actualizar.
  * **Método HTTP:** PUT
  * **Cuerpo de la Petición:** Objeto JSON con los nuevos detalles del libro.
  * **Respuesta:** Retorna los detalles del libro actualizado, si no encuentra el libro, retorna un error 404.
 
* **DELETE /book/{id}**
  
  * Elimina un libro existente por su ID.
  * **Parámetros de Ruta:** `{id}` - ID del libro a eliminar.
  * **Método HTTP:** DELETE
  * **Respuesta:** Retorna un mensaje confirmando la eliminación del libro, si no se encuentra el libro, retorna un error 404.
