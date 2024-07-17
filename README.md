# API REST Spring Framework

## Descripción
Esta API REST permite gestionar una colección de libros, proporcionando operaciones CRUD (Crear, Leer, Actualizar y Borrar) sobre los libros almacenados en una base de datos PostgreSQL.

## Requisitos
- Java 21
- Spring Boot 3.2.7
- PostgreSQL

### BookController

El `BookController` maneja las operaciones CRUD (Crear, Leer, Actualizar, Eliminar) para los libros en la base de datos.

#### Endpoints

* **GET /book**
  
  * Retorna todos los libros almacenados.
  * **Método HTTP:** GET
  * **Respuesta Exitosa:** Retorna una lista de todos los libros.
  * **Respuesta de Error:** Si no se encuentran libros, retorna un mensaje de error.

* **GET /book/{id}**
  
  * Retorna un libro específico por su ID.
  * **Parámetros de Ruta:** `{id}` - ID del libro.
  * **Método HTTP:** GET
  * **Respuesta Exitosa:** Retorna los detalles del libro con el ID especificado.
  * **Respuesta de Error:** Si no se encuentra el libro con el ID dado, retorna un mensaje de error.

* **POST /book**
  
  * Crea uno o varios libros nuevos en la base de datos.
  * **Método HTTP:** POST
  * **Cuerpo de la Petición:** Un arreglo de objetos JSON con detalles de los libros a crear.
  * **Respuesta Exitosa:** Retorna los detalles de los libros creados.
  * **Respuesta de Error:** Si hay algún error durante la creación de los libros, retorna un mensaje de error.

* **PUT /book/{id}**
  
  * Actualiza la información de un libro existente por su ID.
  * **Parámetros de Ruta:** `{id}` - ID del libro a actualizar.
  * **Método HTTP:** PUT
  * **Cuerpo de la Petición:** Objeto JSON con los nuevos detalles del libro.
  * **Respuesta Exitosa:** Retorna los detalles del libro actualizado.
  * **Respuesta de Error:** Si no se encuentra el libro con el ID dado, retorna un mensaje de error.

* **DELETE /book/{id}**
  
  * Elimina un libro existente por su ID.
  * **Parámetros de Ruta:** `{id}` - ID del libro a eliminar.
  * **Método HTTP:** DELETE
  * **Respuesta Exitosa:** Retorna un mensaje confirmando la eliminación del libro.
  * **Respuesta de Error:** Si no se encuentra el libro con el ID dado, retorna un mensaje de error.