package com.example.juin.sport.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="players")
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="player_id")
	private Long id;
	private String name;
	private int nbr;
	private String position;
	
	
	@ManyToOne
	@JoinColumn(name="TEAM_ID", nullable=true)
	@OnDelete(action= OnDeleteAction.CASCADE)
	private Team team;
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	public Player(Long id, String name, int nbr, String position) {
		super();
		this.id = id;
		this.name = name;
		this.nbr = nbr;
		this.position = position;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNbr() {
		return nbr;
	}
	public void setNbr(int nbr) {
		this.nbr = nbr;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", nbr=" + nbr + ", position=" + position + "]";
	}
	
	
	
	

}
