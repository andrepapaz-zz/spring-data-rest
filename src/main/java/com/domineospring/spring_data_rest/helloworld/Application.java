package com.domineospring.spring_data_rest.helloworld;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.domineospring.spring_data_rest.helloworld.models.Author;
import com.domineospring.spring_data_rest.helloworld.models.Book;
import com.domineospring.spring_data_rest.helloworld.repositories.AuthorRepository;
import com.domineospring.spring_data_rest.helloworld.repositories.BookRepository;

@SpringBootApplication
public class Application {
	
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
	
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private AuthorRepository authorRepository;

	@PostConstruct
	@Transactional
	public void onLoad(){
		
		Author alberto = new Author();
		alberto.setName("Alberto");
		authorRepository.save(alberto);
		
		
		Book book = new Book();
		book.setTitle("Spring MVC");
		book.setDescription("Domine o principal framework web Java");
		book.setNumOfPages(237);
		
		book.add(alberto);
		
		bookRepository.save(book);
		
	}
	
}
