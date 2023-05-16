package com.SportsLeaderboard.SportsLeaderboard.Service;

import com.SportsLeaderboard.SportsLeaderboard.Models.Game;
import com.SportsLeaderboard.SportsLeaderboard.Models.Player;
import com.SportsLeaderboard.SportsLeaderboard.Models.Standings;
import com.SportsLeaderboard.SportsLeaderboard.Repositories.PlayerRepository;
import com.SportsLeaderboard.SportsLeaderboard.Repositories.StandingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class StandingService {
    @Autowired
    StandingRepository standingRepository;
    @Autowired
    PlayerRepository playerRepository;



    public void addStandings(String userName){
        Standings standings=new Standings();
        standings.setWin(10);
        standings.setLoss(2);
        Integer player=playerRepository.getPlayerByName(userName);
        Player player1=playerRepository.findById(player).get();
        standings.setPlayer(player1);
        standings.setCreateDate(new Date());
        standings.setUpdateDate(new Date());
        standings.setIsActive(Boolean.TRUE);
        standingRepository.save(standings);
    }

    public List<Integer> getStandingByPlayerId(Integer player_id){                         //get Standing By player id
        return standingRepository.getStandingByPlayerId(player_id);

    }

    public void deleteStandingById(Integer id){                     // Delete by id
        Standings standings=standingRepository.getStandingID(id);
        standings.setIsActive(false);
        standingRepository.save(standings);

    }

    public void updateStandings(String userName){
        Standings standings=new Standings();
        standings.setWin(50);
        standings.setLoss(10);
        standings.getId();
        Integer player=playerRepository.getPlayerByName(userName);
        Player player1=playerRepository.findById(player).get();
        standings.setPlayer(player1);
        standings.setCreateDate(new Date());
        standings.setUpdateDate(new Date());
        standings.setIsActive(Boolean.TRUE);
        standingRepository.save(standings);
    }

    public List<Standings> getAllStandings(){                         //get All Standing
        return standingRepository.getAllStandings();

    }


}
