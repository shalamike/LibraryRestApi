package com.sparta.libraryrestapppractice.service;


import com.sparta.libraryrestapppractice.model.entities.Author;
import com.sparta.libraryrestapppractice.model.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {

    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorController(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }

    @GetMapping(value = "/authors")
    public List<Author> getAllAuthors(){
        return authorRepository.findAll();
    }


    @PostMapping(value = "/author")
    public String setAuthor(Author author){
        authorRepository.save(author);
        return "Author " + author.getFullName() + " has been added";
    }
}
