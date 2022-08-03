package com.example.juin.sport.servicesimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.juin.sport.models.Team;
import com.example.juin.sport.repositories.TeamRepository;
import com.example.juin.sport.services.TeamService;

@Service
public class TeamServiceImp implements TeamService{
	@Autowired
	private TeamRepository teamRepository;

	@Override
	public Team addTeam(Team p) {
		// TODO Auto-generated method stub
		return teamRepository.save(p);
	}

	@Override
	public Team editTeam(Team p) {
		// TODO Auto-generated method stub
		return teamRepository.save(p);
	} 
	

	@Override
	public Team getTeamById(Long id) {
		// TODO Auto-generated method stub
		Optional <Team> team= teamRepository.findById(id);
		return team.isPresent() ? team.get() :null;
	}

	@Override
	public void deleteTeamById(Long id) {
		// TODO Auto-generated method stub
		 teamRepository.deleteById(id);
		
	}

	@Override
	public List<Team> getAllTeams() {
		// TODO Auto-generated method stub
		return  teamRepository.findAll();
	}
	

}
