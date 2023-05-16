package com.SportsLeaderboard.SportsLeaderboard.Service;

import com.SportsLeaderboard.SportsLeaderboard.Models.Game;
import com.SportsLeaderboard.SportsLeaderboard.Models.Player;
import com.SportsLeaderboard.SportsLeaderboard.Repositories.GameRepository;
import com.SportsLeaderboard.SportsLeaderboard.Repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class GameService {
    @Autowired
    GameRepository gameRepository;
    @Autowired
    PlayerRepository playerRepository;

    public void addGame(String userName){
        Game game=new Game();
        game.setScore(8);
        Integer player=playerRepository.getPlayerByName(userName);
        Player player1=playerRepository.findById(player).get();
        game.setPlayer(player1);
        game.setCreateDate(new Date());
        game.setUpdateDate(new Date());
        game.setIsActive(Boolean.TRUE);
        gameRepository.save(game);
    }


    public void deleteGameById(Integer id){                              // Delete by id
        Game game=gameRepository.getGameID(id);
        game.setIsActive(false);
        gameRepository.save(game);

    }

    public void updateGame (String userName){                //Update Game
        Game game=new Game();
        game.setScore(5);
        game.setId(2);
        Integer player=playerRepository.getPlayerByName(userName);
        Player player1=playerRepository.findById(player).get();
        game.setPlayer(player1);
        game.setCreateDate(new Date());
        game.setUpdateDate(new Date());
        game.setIsActive(Boolean.TRUE);
        gameRepository.save(game);



    }




}
