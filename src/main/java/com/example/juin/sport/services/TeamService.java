package com.example.juin.sport.services;

import java.util.List;

import com.example.juin.sport.models.Team;

public interface TeamService {
	
	public Team addTeam(Team p);

	public Team editTeam(Team p);

	public Team getTeamById(Long id);

	public void deleteTeamById(Long id);

	public List<Team> getAllTeams();

}