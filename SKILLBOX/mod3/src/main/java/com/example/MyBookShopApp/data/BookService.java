package com.example.MyBookShopApp.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookService {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public BookService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Book> getBooksData(){

        List<Book> books = jdbcTemplate.query("SELECT * FROM BOOKS", (ResultSet rs, int rownum)->{
            Book book = new Book();
            book.setId(rs.getInt("id"));
            book.setAuthor(rs.getString("author"));
            book.setTitle(rs.getString("title"));
            book.setPriceOld(rs.getString("priceOld"));
            book.setPrice(rs.getString("price"));
            return book;
        });
        return new ArrayList<>(books);
    }
    public List<Author> getAuthorsData(){


        List<Author> authors = jdbcTemplate.query("SELECT * FROM AUTHORS ORDER BY NAME ASC", (ResultSet rs, int rownum)->{
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setName(rs.getString("name"));


            return author;
        });

        return new ArrayList<>(authors);
    }
    public Map<Character, List<Author>> getHashMapAuthorByCharData(List<Author> authors){

        Map<Character, List<Author>> map = new HashMap<>();
        char firstChar;
        for (var author : authors){
            firstChar = author.getName().charAt(0);
            if (map.containsKey(firstChar)) {
                map.get(firstChar).add(author);
            }
            else{
                List<Author> kostil = new ArrayList<>();
                kostil.add(author);
                map.put(firstChar, kostil);
            }
        }


        return map;

    }
//    public HashMap<Character, Author> getHashMapAuthorByCharData(List<Author> authors){
//        HashMap<Character, Author> map = new HashMap<>();
//        for (var author : authors){
//            map.put(author.getName().charAt(0), author);
//        }
//        return map;
//
//    }
}
