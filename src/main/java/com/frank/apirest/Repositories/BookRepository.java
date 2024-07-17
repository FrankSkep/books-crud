package com.frank.apirest.Repositories;

import com.frank.apirest.Entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    
    
    
}