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

import com.example.au.couchbasedemo.model.Football;
import com.example.au.couchbasedemo.repository.FootballRepository;

@RestController
public class FootballController {
	@Autowired
	FootballRepository footballRepository;
	
	// Get All Football Players
	@GetMapping("/football")
	public List<Football> getAllPlayers(){
		return (List<Football>) footballRepository.findAll();
	}
	
	// Add a Football Player
	@PostMapping("/football")
	public Football addPlayer(@RequestBody Football player) {
		return footballRepository.save(player);
	}
	
	// Get Player by Player Id
	@GetMapping("/football/{id}")
	public Optional<Football> getPlayerById(@PathVariable String id) {
		if(footballRepository.existsById(id)) {
			return footballRepository.findById(id);
		}else {
			return Optional.empty();
		}
	}
	
	// Get all players who scored more then given goals
	@GetMapping("/football/goals/{goals}")
	public List<Football> getPlayerByGoals(@PathVariable int goals){
		List<Football> players = new ArrayList<>();
		List<Football> allPlayers = (List<Football>) footballRepository.findAll();
		for(Football player : allPlayers) {
			if(player.getTotalGoals()>=goals) {
				players.add(player);
			}
		}
		return players;
	}
}
