package com.pvr.spring5sample.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 * 
 * @author Prasannav
 * 
 * @since 20-10-2019
 *
 */

@Entity
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private final String firstName;

	private final String lastName;

	// @ManyToMany
	@Cascade(CascadeType.ALL)
	@ManyToMany(mappedBy = "authors")
	private final Set<Book> books = new HashSet<>();

	public Author(String firstName, String lastName, Set<Book> bookSet) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		if (bookSet != null) {
			this.books.addAll(bookSet);
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<Book> getBooks() {
		return books;
	}
}
