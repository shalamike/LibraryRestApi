package com.sparta.libraryrestapppractice.model.repositories;

import com.sparta.libraryrestapppractice.model.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

    Optional<Author> findAuthorByFullName(String fullName);

    Boolean existsAuthorByFullName(String fullName);

}