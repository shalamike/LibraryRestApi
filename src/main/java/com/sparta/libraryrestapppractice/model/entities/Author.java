package com.sparta.libraryrestapppractice.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import org.springframework.hateoas.RepresentationModel;

import java.util.List;

@Entity
@Table(name = "authors")
public class Author extends RepresentationModel<Author> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id", nullable = false)
    private Integer id;

    @Size(max = 40)
    @Column(name = "full_name", length = 40)
    private String fullName;


    @OneToMany(mappedBy = "author",
    fetch = FetchType.LAZY,
    cascade = CascadeType.ALL)
    private List<Book> books;

    public Author() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


}