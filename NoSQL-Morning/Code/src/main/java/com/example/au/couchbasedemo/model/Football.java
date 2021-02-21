package com.example.au.couchbasedemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

import com.sun.istack.NotNull;

@Document
public class Football {
	@Id
	String id;
	
	@NotNull
	@Field
	String playerName;
	
	@Field
	int totalGoals;

	public Football(String id, String playerName, int totalGoals) {
		super();
		this.id = id;
		this.playerName = playerName;
		this.totalGoals = totalGoals;
	}

	public String getId() {
		return id;
	}

	public String getPlayerName() {
		return playerName;
	}

	public int getTotalGoals() {
		return totalGoals;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public void setTotalGoals(int totalGoals) {
		this.totalGoals = totalGoals;
	}
	
}
