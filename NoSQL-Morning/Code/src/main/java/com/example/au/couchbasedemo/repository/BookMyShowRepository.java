package com.example.au.couchbasedemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.au.couchbasedemo.model.BookMyShow;

public interface BookMyShowRepository extends CrudRepository<BookMyShow, String>{

	BookMyShow findByMovieName(String movieName);
	
}
