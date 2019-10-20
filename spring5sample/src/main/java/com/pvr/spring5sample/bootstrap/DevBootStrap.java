package com.pvr.spring5sample.bootstrap;

import java.util.HashSet;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.pvr.spring5sample.models.Author;
import com.pvr.spring5sample.models.Book;
import com.pvr.spring5sample.repositry.AuthorRepository;
import com.pvr.spring5sample.repositry.BookRepository;

/**
 * 
 * @author Prasannav
 *
 * @since 20-10-2019
 */
@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent> {

	private BookRepository bookRepo;
	private AuthorRepository authorRepo;

	public DevBootStrap(BookRepository bookRepository, AuthorRepository authorRepository) {
		bookRepo = bookRepository;
		authorRepo = authorRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {

		initData();
	}

	private void initData() {
		Author author1 = new Author("John", "Thomson", new HashSet<>());
		Book book1 = new Book("spring learning", "123456", "Spring guru", new HashSet<>());
		
		
		Author author2 = new Author("John2", "Thomson2", new HashSet<>());
		Book book2 = new Book("spring learning2", "12345", "Spring guru2", new HashSet<>());
		
		book1.getAuthorSet().add(author2);
		author1.getBooks().add(book2);

		
		bookRepo.save(book1);
		authorRepo.save(author1);
		
		
		author2.getBooks().add(book2);
		
		
		
		
		/*
		 * bookRepo.save(book2); authorRepo.save(author2);
		 */
		
		
	}

}
