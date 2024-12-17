package com.frank.apirest.service;

import com.frank.apirest.entity.Book;
import com.frank.apirest.exception.BookNotFoundException;
import com.frank.apirest.repository.BookRepository;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookDetails(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new BookNotFoundException("Book with ID : " + id + " not found"));
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Book updateBook(Long id, Book bookDetails) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new BookNotFoundException("Book with ID : " + id + " not found"));

        book.setTitle(bookDetails.getTitle());
        book.setAuthor(bookDetails.getAuthor());
        book.setEdition(bookDetails.getEdition());
        book.setPagesNumber(bookDetails.getPagesNumber());

        return bookRepository.save(book);
    }

    public ResponseEntity<Book> deleteBook(Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new BookNotFoundException("Book with ID : " + id + " not found"));

        bookRepository.delete(book);
        return ResponseEntity.ok(book);
    }
}
