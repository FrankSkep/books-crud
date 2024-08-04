package com.frank.apirest.Controllers;

import com.frank.apirest.Entities.Book;
import com.frank.apirest.Service.BookService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/book") // URL Principal
public class BookController {

    @Autowired
    private BookService bookService;

    // GET ALL
    @GetMapping
    public List<Book> getBooks() {
        return bookService.getAllBooks();
    }

    // GET (Obtener un libro por su ID)
    @GetMapping("/{id}")
    public Book getBookByID(@PathVariable Long id) {
        return bookService.getBookByID(id);
    }

    // POST (Crear un nuevo libro)
    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    // PUT (Actualizar datos de un libro)
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book bookDetails) {
        return bookService.updateBook(id, bookDetails);
    }

    // DELETE (Eliminar un libro por su ID)
    @DeleteMapping("/{id}")
    public ResponseEntity<Book> deleteBook(@PathVariable Long id) {
        return bookService.deleteBook(id);
    }
}
