package com.example.au.couchbasedemo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.au.couchbasedemo.model.BookMyShow;
import com.example.au.couchbasedemo.repository.BookMyShowRepository;

@RestController
public class BookMyShowController{
	@Autowired
	BookMyShowRepository bookMyShowRepository;
	
	//Get All Movies
	@GetMapping("/bookmyshow")
	public List<BookMyShow> getAllMovies(){
		return (List<BookMyShow>) bookMyShowRepository.findAll();
	}
	
	//Add a new Movie
	@PostMapping("/bookmyshow")
	public BookMyShow AddMovie(@RequestBody BookMyShow movie){
		return bookMyShowRepository.save(movie);
	}
	
	//Get Movie By Id
	@GetMapping("/bookmyshow/{id}")
    public Optional<BookMyShow> getMovieById(@PathVariable String id) {
        if (bookMyShowRepository.existsById(id)) {
            return bookMyShowRepository.findById(id);
        } else
            return Optional.empty();
    }
	
	//Delete a movie by Id
	@DeleteMapping("/bookmyshow/{id}")
	public void deleteMovieById(@PathVariable String id) {
		bookMyShowRepository.deleteById(id);
	}
	
	//Get Movie by Movie name
	@GetMapping("/bookmyshow/movie/{movieName}")
	public BookMyShow getMovieByName(@PathVariable String movieName) {
		return bookMyShowRepository.findByMovieName(movieName);
	}
	
	//Get All Movies by City Name
	@GetMapping("/bookmyshow/city/{cityName}")
	public List<BookMyShow> getMoviesByCityName(@PathVariable String cityName){
        List<BookMyShow> moviesByCityName = new ArrayList<>();
        
        List<BookMyShow> allMovies = (List<BookMyShow>) bookMyShowRepository.findAll();
        for(BookMyShow movie : allMovies) {
        	List<String> cities = movie.getCities();
        	if(cities.contains(cityName)) {
        		moviesByCityName.add(movie);
        	}
        } 
        return moviesByCityName;
    }
	
	
}
