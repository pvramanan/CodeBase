package com.pvr.spring5sample.repositry;

import org.springframework.data.repository.CrudRepository;

import com.pvr.spring5sample.models.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
