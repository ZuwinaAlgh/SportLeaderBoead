package com.SportsLeaderboard.SportsLeaderboard.Controller;

import com.SportsLeaderboard.SportsLeaderboard.Models.Player;
import com.SportsLeaderboard.SportsLeaderboard.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping(value = "player")
public class PlayerController {
    @Autowired
    PlayerService playerService;

    @RequestMapping(value = "getPlayerByName", method = RequestMethod.GET)
    public Integer getPlayerById(@RequestParam String username) {
        Integer player = playerService.getPlayerByNames(username);
        return player;
    }
@RequestMapping(value = "RegisterPlayer", method = RequestMethod.POST)                 //Register Player
   public void registerPlayers(){
    playerService.RegisterPlayer();

   }

    @RequestMapping(value = "deletePlayerById",method = RequestMethod.GET)             //delete Player
    public void deletePlayerById(@RequestParam String password) {
        playerService.deleteSchoolById(password);
    }


    @RequestMapping(value = "updatePlayer")
    public void updatePlayer() throws ParseException {
        playerService.updatePlayer();
    }

    @RequestMapping(value = "GetAllPlayer")
    public List<Player> generateAllPlayer(){
        List<Player> playerList=playerService.getAllPlayers();
        return playerList;
    }


}
