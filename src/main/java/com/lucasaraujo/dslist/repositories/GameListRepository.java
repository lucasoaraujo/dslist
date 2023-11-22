package com.lucasaraujo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasaraujo.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

	
	

}
