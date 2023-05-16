package com.SportsLeaderboard.SportsLeaderboard.Controller;

import com.SportsLeaderboard.SportsLeaderboard.Repositories.PlayerRepository;
import com.SportsLeaderboard.SportsLeaderboard.Service.GameService;
import com.SportsLeaderboard.SportsLeaderboard.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequestMapping(value = "game")
public class GameController {
    @Autowired
    GameService gameService;

    @RequestMapping(value = "addGame", method = RequestMethod.POST)                 //add game
    public void addPlayers(String userName){
        gameService.addGame(userName);

    }

    @RequestMapping(value = "deleteGameById",method = RequestMethod.GET)             //delete game
    public void deleteGameById(@RequestParam Integer id) {
        gameService.deleteGameById(id);
    }

    @RequestMapping(value = "updateGame")
    public void updateGame(@RequestParam  String userName) throws ParseException {
        gameService.updateGame(userName);
    }
}
