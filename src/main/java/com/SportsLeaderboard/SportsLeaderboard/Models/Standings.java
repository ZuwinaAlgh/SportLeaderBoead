package com.SportsLeaderboard.SportsLeaderboard.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
public class Standings extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    Integer win;
    Integer loss;
     @ManyToOne
     @JoinColumn(name = "player_id", referencedColumnName = "id")
     Player player;
    @ManyToOne
    @JoinColumn(name = "game_id", referencedColumnName = "id")
     Game game;
}
