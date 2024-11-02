## Endpoints de la API

| Método | Endpoint   | Descripción                                               | Parámetros de Ruta    | Cuerpo de la Petición                          | Respuesta                                  |
| ------ | ---------- | --------------------------------------------------------- | --------------------- | ---------------------------------------------- | ------------------------------------------ |
| GET    | /book      | Retorna todos los libros almacenados.                     | Ninguno               | Ninguno                                        | Lista con todos los libros.                |
| GET    | /book/{id} | Retorna un libro específico por su ID.                    | `{id}` - ID del libro | Ninguno                                        | Detalles del libro con el ID especificado. |
| POST   | /book      | Registra un libro nuevo en la base de datos.              | Ninguno               | Objeto JSON con detalles del libro a crear.    | Detalles del libro creado.                 |
| PUT    | /book/{id} | Actualiza la información de un libro existente por su ID. | `{id}` - ID del libro | Objeto JSON con los nuevos detalles del libro. | Detalles del libro actualizado.            |
| DELETE | /book/{id} | Elimina un libro existente por su ID.                     | `{id}` - ID del libro | Ninguno                                        | Detalles del libro eliminado.              |
