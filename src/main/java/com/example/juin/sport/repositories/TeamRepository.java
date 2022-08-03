package com.example.juin.sport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.juin.sport.models.Team;

@Repository

public interface TeamRepository extends JpaRepository<Team,Long> {
	

}
