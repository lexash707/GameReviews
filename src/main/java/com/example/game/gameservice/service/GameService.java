package com.example.game.gameservice.service;

import com.example.game.gameservice.model.Game;
import com.example.game.gameservice.model.Studio;
import com.example.game.gameservice.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<Game> getAllGames(){
        return gameRepository.findAll();
    }

    public ResponseEntity<HttpStatus> addGame(Game newGame, Studio studio){
        if(studio == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        newGame.setStudio(studio);

        if(gameRepository.save(newGame) != null){
            return new ResponseEntity<>(HttpStatus.CREATED);
        }

        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
