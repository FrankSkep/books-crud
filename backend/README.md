## Endpoints de la API

### GET /book
- Retorna todos los libros almacenados.
- Respuesta: Lista con todos los libros.

### GET /book/{id}
- Retorna un libro específico por su ID.
- Parámetros de Ruta: `{id}` - ID del libro.
- Respuesta: Detalles del libro con el ID especificado.

### POST /book
- Registra un libro nuevo en la base de datos.
- Cuerpo de la Petición: Objeto JSON con detalles del libro a crear.
- Respuesta: Detalles del libro creado.

### PUT /book/{id}
- Actualiza la información de un libro existente por su ID.
- Parámetros de Ruta: `{id}` - ID del libro a actualizar.
- Cuerpo de la Petición: Objeto JSON con los nuevos detalles del libro.
- Respuesta: Detalles del libro actualizado.

### DELETE /book/{id}
- Elimina un libro existente por su ID.
- Parámetros de Ruta: `{id}` - ID del libro a eliminar.
- Respuesta: Detalles del libro eliminado.
