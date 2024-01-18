package com.example.game.gameservice.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@Entity
public class Studio {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String name;

    @OneToMany(mappedBy = "studio")
    private List<Game> games;
}
