package com.example.game.gameservice.repository;

import com.example.game.gameservice.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
