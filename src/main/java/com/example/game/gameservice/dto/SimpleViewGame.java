package com.example.game.gameservice.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
public class SimpleViewGame {
    private String game;
    private String studio;
    private List<String> genres;
}
