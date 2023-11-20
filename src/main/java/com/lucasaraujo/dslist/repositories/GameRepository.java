package com.lucasaraujo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasaraujo.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

	
	

}
