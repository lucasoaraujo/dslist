package com.lucasaraujo.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lucasaraujo.dslist.dto.GameListDTO;
import com.lucasaraujo.dslist.dto.GameMinDTO;
import com.lucasaraujo.dslist.entities.GameList;
import com.lucasaraujo.dslist.repositories.GameListRepository;

@Component
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
		return dto;
	}

}
