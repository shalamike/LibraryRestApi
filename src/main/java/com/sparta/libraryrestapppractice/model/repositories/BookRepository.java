package com.sparta.libraryrestapppractice.model.repositories;

import com.sparta.libraryrestapppractice.model.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {


    List<Book> findBooksByAuthor_Id(Integer id);

}
