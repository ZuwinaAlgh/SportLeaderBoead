package com.SportsLeaderboard.SportsLeaderboard.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class LeaderBoardReports {

    String userName;
    String password;
    String teamName;
    String sport;
    Integer score;
    Integer win;
    Integer loss;


    public LeaderBoardReports(String userName, String password, String teamName, String sport, Integer score, Integer win, Integer loss) {
        this.userName = userName;
        this.password = password;
        this.teamName = teamName;
        this.sport = sport;
        this.score = score;
        this.win = win;
        this.loss = loss;
    }
}
