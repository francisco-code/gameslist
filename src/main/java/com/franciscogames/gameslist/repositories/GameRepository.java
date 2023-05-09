package com.franciscogames.gameslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.franciscogames.gameslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
