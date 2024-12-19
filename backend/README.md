# Book Crud RESTful API

## Endpoints

### Obtener todos los libros

- **URL:** `/api/books`
- **Método:** `GET`
- **Parámetros de consulta opcionales:**
    - `title`: Filtrar por título
    - `author`: Filtrar por autor
    - `page`: Número de página (por defecto 0)
    - `size`: Tamaño de página (por defecto 10)
- **Respuesta exitosa:** `200 OK`
- **Ejemplo de respuesta:**
    ```json
    {
      "content": [
        {
          "id": 1,
          "title": "El Quijote",
          "author": "Miguel de Cervantes",
          "edition": "Primera",
          "numberOfPages": 500
        }
      ],
      "pageable": {
        "pageNumber": 0,
        "pageSize": 10
      },
      "totalElements": 1,
      "totalPages": 1
    }
    ```

### Obtener detalles de un libro

- **URL:** `/api/books/{id}`
- **Método:** `GET`
- **Respuesta exitosa:** `200 OK`
- **Ejemplo de respuesta:**
    ```json
    {
      "id": 1,
      "title": "El Quijote",
      "author": "Miguel de Cervantes",
      "edition": "Primera",
      "numberOfPages": 500
    }
    ```

### Crear un nuevo libro

- **URL:** `/api/books`
- **Método:** `POST`
- **Cuerpo de la solicitud:**
    ```json
    {
      "title": "El Quijote",
      "author": "Miguel de Cervantes",
      "edition": "Primera",
      "numberOfPages": 500
    }
    ```
- **Respuesta exitosa:** `200 OK`
- **Ejemplo de respuesta:**
    ```json
    {
      "id": 1,
      "title": "El Quijote",
      "author": "Miguel de Cervantes",
      "edition": "Primera",
      "numberOfPages": 500
    }
    ```

### Actualizar un libro

- **URL:** `/api/books/{id}`
- **Método:** `PUT`
- **Cuerpo de la solicitud:**
    ```json
    {
      "title": "El Quijote",
      "author": "Miguel de Cervantes",
      "edition": "Segunda",
      "numberOfPages": 550
    }
    ```
- **Respuesta exitosa:** `200 OK`
- **Ejemplo de respuesta:**
    ```json
    {
      "id": 1,
      "title": "El Quijote",
      "author": "Miguel de Cervantes",
      "edition": "Segunda",
      "numberOfPages": 550
    }
    ```

### Eliminar un libro

- **URL:** `/api/books/{id}`
- **Método:** `DELETE`
- **Respuesta exitosa:** `200 OK`
- **Ejemplo de respuesta:**
    ```json
    {
      "id": 1,
      "title": "El Quijote",
      "author": "Miguel de Cervantes",
      "edition": "Primera",
      "numberOfPages": 500
    }
    ```

### Obtener el total de libros

- **URL:** `/api/books/total`
- **Método:** `GET`
- **Respuesta exitosa:** `200 OK`
- **Ejemplo de respuesta:**
    ```json
    100
    ```

## Manejo de Errores

La API maneja los siguientes errores:

- **404 Not Found:** Cuando un libro no es encontrado.
- **400 Bad Request:** Cuando hay errores de validación.