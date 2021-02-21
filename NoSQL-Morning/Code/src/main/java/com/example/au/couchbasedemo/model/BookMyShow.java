package com.example.au.couchbasedemo.model;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import org.springframework.data.couchbase.core.mapping.id.GenerationStrategy;

import com.sun.istack.NotNull;
@Document
public class BookMyShow {

	@Id
	@GeneratedValue(strategy = GenerationStrategy.UNIQUE)
	String id;
	
	@NotNull
	@Field
	String movieName;
	
	@Field
	List<String> cities;
	
	@Field
	String release_date;
	
	@Field
	List<String> genres;

	public BookMyShow(String id, String movieName, List<String> cities, String release_date, List<String> genres) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.cities = cities;
		this.release_date = release_date;
		this.genres = genres;
	}

	public String getId() {
		return id;
	}

	public List<String> getCities() {
		return cities;
	}

	public String getRelease_date() {
		return release_date;
	}
	
	public List<String> getGenres() {
		return genres;
	}

	public void setGenres(List<String> genres) {
		this.genres = genres;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public void setCities(List<String> cities) {
		this.cities = cities;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}
	
}
