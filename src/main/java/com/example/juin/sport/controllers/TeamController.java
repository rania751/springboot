package com.example.juin.sport.controllers;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.juin.sport.models.Team;
import com.example.juin.sport.services.TeamService;

@CrossOrigin("*")
@RequestMapping("/api/teams")
@RestController
public class TeamController {
	@Autowired
	private TeamService teamService;
	 

	@PostMapping
	public Team addTeam(@RequestBody Team team) {
		return teamService.addTeam(team);
		
	}
	
	
	@GetMapping("/{id}")
	public Team getTeamById(@PathVariable Long id) {
		return teamService.getTeamById(id);
		
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		teamService.deleteTeamById(id);
	}
	
	
	@GetMapping 
	public List<Team> getAllPlayers() {
		return teamService.getAllTeams();
	}
	

	@PutMapping("/{id}")
	public Team update( @RequestBody Team team) {
		return teamService.editTeam(team);
	}
}

