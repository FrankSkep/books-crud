package com.frank.apirest.controller;

import com.frank.apirest.entity.Book;
import com.frank.apirest.service.BookService;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping
    public Page<Book> getBooks(@RequestParam(required = false) String title,
                               @RequestParam(required = false) String author,
                               @PageableDefault(size = 10) Pageable pageable) {
        return bookService.getBooksWithOptionalFilter(title, author, pageable);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookDetails(@PathVariable Long id) {
        return ResponseEntity.ok(bookService.getBookDetails(id));
    }

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        return ResponseEntity.ok(bookService.createBook(book));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateBook(@PathVariable Long id, @RequestBody Book bookDetails) {
        return ResponseEntity.ok(bookService.updateBook(id, bookDetails));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable Long id) {
        return ResponseEntity.ok(bookService.deleteBook(id));
    }
}
