package com.example.game.gameservice.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@Entity
public class Game {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String name;

    @ManyToOne
    @JoinColumn(name="studio_id")
    private Studio studio;

    @ManyToMany
    @JoinTable( name="genre_game",
                joinColumns = @JoinColumn(name = "genre_id"),
                inverseJoinColumns = @JoinColumn(name = "game_id"))
    private List<Genre> genres;

}
