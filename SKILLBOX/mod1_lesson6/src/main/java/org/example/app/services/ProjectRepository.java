package org.example.app.services;

import org.example.web.dto.Book;

import java.util.List;

public interface ProjectRepository<T> {
    List<T> retreiveAll();

    boolean store(T book);

    boolean removeItemByParam(String bookIdToRemove, String param);
}
