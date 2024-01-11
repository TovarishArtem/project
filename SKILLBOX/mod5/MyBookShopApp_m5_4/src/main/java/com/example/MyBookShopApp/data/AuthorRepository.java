package com.example.MyBookShopApp.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
    @Query("from Author")
    List<Author> customFindAllAuthors();


}
