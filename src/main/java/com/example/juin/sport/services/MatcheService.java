package com.example.juin.sport.services;

import java.util.List;

import com.example.juin.sport.models.Matche;



public interface MatcheService {
	
	public Matche addMatche(Matche p);

	public Matche editMatche(Matche p);

	public Matche getMatcheById(Long id);

	public void deleteMatcheById(Long id);

	public List<Matche> getAllMatche();
}
