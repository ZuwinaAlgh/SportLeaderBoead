package com.SportsLeaderboard.SportsLeaderboard.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
public class Game extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    Integer score;
    @ManyToOne
    @JoinColumn(name = "player_id", referencedColumnName = "id")
    Player player;
}
