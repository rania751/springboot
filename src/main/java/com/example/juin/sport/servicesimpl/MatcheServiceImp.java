package com.example.juin.sport.servicesimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.juin.sport.models.Matche;
import com.example.juin.sport.repositories.MatcheRepository;
import com.example.juin.sport.services.MatcheService;

@Service
public class MatcheServiceImp implements MatcheService {
	
	@Autowired
	private MatcheRepository matcheRepository;

	@Override
	public Matche addMatche(Matche p) {
		// TODO Auto-generated method stub
		return matcheRepository.save(p);
	}

	@Override
	public Matche editMatche(Matche p) {
		// TODO Auto-generated method stub
		return matcheRepository.save(p);
	}

	@Override
	public Matche getMatcheById(Long id) {
		// TODO Auto-generated method stub
		 Optional<Matche> matche=matcheRepository.findById(id);
		 return matche.isPresent() ? matche.get(): null;
	}

	@Override
	public void deleteMatcheById(Long id) {
		// TODO Auto-generated method stub
		 matcheRepository.deleteById(id);
		
	}

	@Override
	public List<Matche> getAllMatche() {
		// TODO Auto-generated method stub
		return  matcheRepository.findAll();
	}
	

}
