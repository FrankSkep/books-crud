package com.frank.apirest.Service;

import com.frank.apirest.Entities.Book;
import com.frank.apirest.Repositories.BookRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    public Book getById(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encontro el libro con ID : " + id));
    }

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public Book update(Long id, Book bookDetails) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encontro el libro con ID : " + id));

        book.setTitulo(bookDetails.getTitulo());
        book.setAutor(bookDetails.getAutor());
        book.setEdicion(bookDetails.getEdicion());
        book.setNumPaginas(bookDetails.getNumPaginas());

        return bookRepository.save(book);
    }

    public ResponseEntity<Book> delete(Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encontró el libro con ID: " + id));

        bookRepository.delete(book);
        return ResponseEntity.ok(book);
    }
}
