package com.example.au.couchbasedemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.au.couchbasedemo.model.Football;

public interface FootballRepository extends CrudRepository<Football, String>{

}
