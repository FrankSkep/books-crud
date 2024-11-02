package com.frank.apirest.controller;

import com.frank.apirest.entity.Book;
import com.frank.apirest.service.BookService;

import java.util.List;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getBooks() {
        return bookService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookByID(@PathVariable Long id) {
        return ResponseEntity.ok(bookService.getById(id));
    }

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        return ResponseEntity.ok(bookService.save(book));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateBook(@PathVariable Long id, @RequestBody Book bookDetails) {
        return ResponseEntity.ok(bookService.update(id, bookDetails));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable Long id) {
        return ResponseEntity.ok(bookService.delete(id));
    }
}
