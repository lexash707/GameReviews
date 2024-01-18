package com.example.game.gameservice.controller;
import com.example.game.gameservice.converter.GameConverter;
import com.example.game.gameservice.dto.SimpleViewGame;
import com.example.game.gameservice.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/allGames")
    private List<SimpleViewGame> allGames(){
        return GameConverter.toSimpleViewGame(gameService.getAllGames());
    }

}
