package com.example.game.gameservice.controller;

import com.example.game.gameservice.converter.GameConverter;
import com.example.game.gameservice.dto.SimpleViewGame;
import com.example.game.gameservice.model.Game;
import com.example.game.gameservice.model.Studio;
import com.example.game.gameservice.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/allGames")
    private List<SimpleViewGame> allGames(){
        return GameConverter.toSimpleViewGame(gameService.getAllGames());
    }

    @PostMapping("/addGame/{studio}")
    public ResponseEntity<HttpStatus> addGame(@RequestBody Game newGame, @PathVariable Studio studio){
        return gameService.addGame(newGame, studio);
    }

}
