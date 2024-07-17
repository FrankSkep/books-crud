package com.frank.apirest.Controllers;

import com.frank.apirest.Entities.Book;

import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.frank.apirest.Repositories.BookRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/book") // URL Inicial
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    // GET ALL
    @GetMapping
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    // GET (Obtener un libro por su ID)
    @GetMapping("/{id}")
    public Book getBookByID(@PathVariable Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encontro el libro con ID : " + id));
    }

    // POST (Crear un nuevo libro)
    @PostMapping
    public List<Book> createBook(@RequestBody List<Book> bookDetails) {

        for (Book book : bookDetails) {
            bookRepository.save(book);
        }
        return bookDetails;
    }

    // PUT (Actualizar datos de un libro)
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book bookDetails) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encontro el libro con ID : " + id));

        // Actualizar los datos
        book.setTitulo(bookDetails.getTitulo());
        book.setAutor(bookDetails.getAutor());
        book.setEdicion(bookDetails.getEdicion());
        book.setNumPaginas(bookDetails.getNumPaginas());

        return bookRepository.save(book);
    }

    // DELETE (Eliminar un libro por su ID)
    @DeleteMapping("/{id}")
    public ResponseEntity<HashMap<String, Object>> deleteBook(@PathVariable Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encontró el libro con ID: " + id));

        bookRepository.delete(book);

        // Crear un mapa para contener el mensaje y los datos del libro eliminado
        HashMap<String, Object> response = new HashMap<>();
        String mensaje = "El libro con ID: " + id + " se eliminó correctamente.";
        response.put(mensaje, book);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
