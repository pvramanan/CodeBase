package com.pvr.spring5sample.repositry;

import org.springframework.data.repository.CrudRepository;

import com.pvr.spring5sample.models.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
