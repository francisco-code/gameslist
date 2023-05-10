package com.franciscogames.gameslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.franciscogames.gameslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
