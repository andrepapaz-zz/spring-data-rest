package com.domineospring.spring_data_rest.helloworld.repositories;

import org.springframework.data.repository.CrudRepository;

import com.domineospring.spring_data_rest.helloworld.models.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
