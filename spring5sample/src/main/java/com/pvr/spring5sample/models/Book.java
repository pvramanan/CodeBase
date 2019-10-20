package com.pvr.spring5sample.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private final String title;

	private final String isbn;

	private final String publisher;

	@ManyToMany
	private final Set<Author> authorSet = new HashSet<>();

	public Book(String title, String isbn, String publisher, Set<Author> authorSet) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.publisher = publisher;
		if (authorSet != null) {
			this.authorSet.addAll(authorSet);
		}
	}

	public String getTitle() {
		return title;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getPublisher() {
		return publisher;
	}

	public Set<Author> getAuthorSet() {
		return authorSet;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
