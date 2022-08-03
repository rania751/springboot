package com.example.juin.sport.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Teams")
public class Team {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="team_id")
	private long id;
	private String name;
	private int pts;
	public Team(long id, String name, int pts) {
		super();
		this.id = id;
		this.name = name;
		this.pts = pts;
	}
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPts() {
		return pts;
	}
	public void setPts(int pts) {
		this.pts = pts;
	}
	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", pts=" + pts + "]";
	}
	

}
