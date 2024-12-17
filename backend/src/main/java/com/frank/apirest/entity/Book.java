package com.frank.apirest.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "The title is required")
    @Size(max = 100, message = "The title cannot have more than 100 characters")
    @Column(nullable = false, unique = true)
    private String title;

    @NotBlank(message = "The author is required")
    @Size(max = 100, message = "The author cannot have more than 100 characters")
    @Column(nullable = false)
    private String author;

    @NotBlank(message = "The edition is required")
    @Size(max = 50, message = "The edition cannot have more than 50 characters")
    @Column(nullable = false)
    private String edition;

    @Min(value = 1, message = "The number of pages must be greater than 0")
    @Column(name = "number_of_pages", nullable = false)
    private int numberOfPages;
}
