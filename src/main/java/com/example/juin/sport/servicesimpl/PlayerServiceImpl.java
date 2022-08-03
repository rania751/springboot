package com.example.juin.sport.servicesimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.juin.sport.models.Player;
import com.example.juin.sport.repositories.PlayerRepository;
import com.example.juin.sport.services.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	private PlayerRepository playerRepository;

	@Override
	public Player addPlayer(Player p) {
		// TODO Auto-generated method stub

		return playerRepository.save(p);
	}

	@Override
	public Player editPlayer(Player p) {
		// TODO Auto-generated method stub
		return playerRepository.save(p);
	}
	
	
	
	@Override
	public Player getPlayerById(Long id) {
		// TODO Auto-generated method stub
		Optional<Player> player= playerRepository.findById(id);
		return player.isPresent() ? player.get() : null;
	}
	
	
	

	@Override
	public void deletePlayerById(Long id) {

		playerRepository.deleteById(id);

	}

	@Override
	public List<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		return playerRepository.findAll();
	}

}
