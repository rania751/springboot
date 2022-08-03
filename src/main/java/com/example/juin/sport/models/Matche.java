package com.example.juin.sport.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Matches")
public class Matche {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="match_id")
	private long id;
	private int scoreOne;
	private int scoreTwo;
	private int teamOne;
	private int teamTwo;
	public Matche(long id, int scoreOne, int scoreTwo, int teamOne, int teamTwo) {
		super();
		this.id = id;
		this.scoreOne = scoreOne;
		this.scoreTwo = scoreTwo;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
	}
	public Matche() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getScoreOne() {
		return scoreOne;
	}
	public void setScoreOne(int scoreOne) {
		this.scoreOne = scoreOne;
	}
	public int getScoreTwo() {
		return scoreTwo;
	}
	public void setScoreTwo(int scoreTwo) {
		this.scoreTwo = scoreTwo;
	}
	public int getTeamOne() {
		return teamOne;
	}
	public void setTeamOne(int teamOne) {
		this.teamOne = teamOne;
	}
	public int getTemTwo() {
		return teamTwo;
	}
	public void setTemTwo(int temTwo) {
		this.teamTwo = temTwo;
	}
	@Override
	public String toString() {
		return "Matche [id=" + id + ", scoreOne=" + scoreOne + ", scoreTwo=" + scoreTwo + ", teamOne=" + teamOne
				+ ", temTwo=" + teamTwo + "]";
	}
	
	

}
