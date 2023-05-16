package com.SportsLeaderboard.SportsLeaderboard.Service;

import com.SportsLeaderboard.SportsLeaderboard.Models.LeaderBoard;
import com.SportsLeaderboard.SportsLeaderboard.Models.Player;
import com.SportsLeaderboard.SportsLeaderboard.Models.Standings;
import com.SportsLeaderboard.SportsLeaderboard.Repositories.LeaderBoardRepository;
import com.SportsLeaderboard.SportsLeaderboard.Repositories.PlayerRepository;
import com.SportsLeaderboard.SportsLeaderboard.Repositories.StandingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LeaderBoardService{
    @Autowired
    LeaderBoardRepository leaderBoardRepository;
    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    StandingRepository standingRepository;
    public void addLeaderBoards(String userName){
        LeaderBoard leaderBoard = new LeaderBoard();
        leaderBoard.setCreateDate(new Date());
        leaderBoard.setUpdateDate(new Date());
        leaderBoard.setIsActive(Boolean.TRUE);
        Integer player=playerRepository.getPlayerByName(userName);
        Player player1=playerRepository.findById(player).get();
        List<Integer> standings=standingRepository.getStandingByPlayerId(player);
        Standings standings1=standingRepository.findById(player).get();
        leaderBoard.setStandings(standings1);
        leaderBoardRepository.save(leaderBoard);


    }
}
