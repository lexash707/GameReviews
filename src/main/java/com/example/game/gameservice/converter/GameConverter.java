package com.example.game.gameservice.converter;

import com.example.game.gameservice.dto.SimpleViewGame;
import com.example.game.gameservice.model.Game;
import com.example.game.gameservice.model.Genre;

import java.util.ArrayList;
import java.util.List;

public class GameConverter {

    public static List<SimpleViewGame> toSimpleViewGame(List<Game> games) {
        return games.stream().map(game -> SimpleViewGame.builder()
                .game(game.getName())
                .studio(game.getStudio().getName())
                .genres(game.getGenres().stream().map(Genre::getName).toList())
                .build()).toList();
    }
}
