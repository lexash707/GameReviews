package com.example.game.gameservice.service;

import com.example.game.gameservice.model.Game;
import com.example.game.gameservice.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<Game> getAllGames(){
        return gameRepository.findAll();
    }

    public void searchAndFilter(){
        //TODO
    }
}
