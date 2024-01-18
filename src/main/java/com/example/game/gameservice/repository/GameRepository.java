package com.example.game.gameservice.repository;

import com.example.game.gameservice.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
