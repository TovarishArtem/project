package org.example.app.services;

import org.apache.log4j.Logger;
import org.example.web.dto.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository implements ProjectRepository<Book> {

    private final Logger logger = Logger.getLogger(BookRepository.class);
    private final List<Book> repo = new ArrayList<>();

    @Override
    public List<Book> retreiveAll() {
        return new ArrayList<>(repo);
    }

    @Override
    public boolean store(Book book) {
        if (!book.getAuthor().isEmpty() || book.getSize()!= null || (!book.getTitle().isEmpty())){
            System.out.println(book.getAuthor()  );
            book.setId(book.hashCode());
            logger.info("store new book: " + book);
            repo.add(book);
        }

        return false;


    }

    @Override
    public boolean removeItemByParam(String bookIdToRemove, String param) {


        if (param.equals("Size")){
            for (Book book : retreiveAll()) {
                if (book.getSize() == Integer.parseInt(bookIdToRemove)) {
                    logger.info("remove book completed: " + book);
                    return repo.remove(book);
                }
            }
        }
        if (param.equals("Title")){
            for (Book book : retreiveAll()) {
                if (book.getTitle().equals(bookIdToRemove)) {
                    logger.info("remove book completed: " + book);
                    return repo.remove(book);
                }
            }
        }
        if (param.equals("Author")){
            for (Book book : retreiveAll()) {
                if (book.getAuthor().equals(bookIdToRemove)) {
                    logger.info("remove book completed: " + book);
                    return repo.remove(book);
                }
            }
        }if (param.equals("id")){
            for (Book book : retreiveAll()) {
                if (book.getId() == Integer.parseInt(bookIdToRemove)) {
                    logger.info("remove book completed: " + book);
                    return repo.remove(book);
                }
            }
        }


        return false;
    }
}
