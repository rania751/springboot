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

import com.example.juin.sport.models.Matche;
import com.example.juin.sport.services.MatcheService;
@CrossOrigin("*")
@RequestMapping("/api/matches")
@RestController
public class MatchController {
	@Autowired
	private MatcheService matcheService;
	@PostMapping
	public Matche addMatche(@RequestBody Matche matche) {

		return matcheService.addMatche(matche);
	}

	@GetMapping 
	public List<Matche> getAllMatches() {
		return matcheService.getAllMatche();
	}
	

	@GetMapping("/{id}")
	public Matche getMatche(@PathVariable Long id) {
		return matcheService.getMatcheById(id);
	}

	@PutMapping("/{id}")
	public Matche update( @RequestBody Matche matche) {
		return matcheService.editMatche(matche);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		matcheService.deleteMatcheById(id);
	}

}
