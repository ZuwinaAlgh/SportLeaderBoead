package com.SportsLeaderboard.SportsLeaderboard.Service;

import com.SportsLeaderboard.SportsLeaderboard.Models.Player;
import com.SportsLeaderboard.SportsLeaderboard.Repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class PlayerService {
    @Autowired
    PlayerRepository playerRepository;


    public void RegisterPlayer(){
        Player player=new Player();
        player.setUserName("Zuiwna");
        player.setPassword("Zu951");
        player.setTeamName("Office Heroes");
        player.setSport("Basketball");
        player.setCreateDate(new Date());
        player.setUpdateDate(new Date());
        player.setIsActive(Boolean.TRUE);
    playerRepository.save(player);
    }

    public Integer getPlayerByNames(String username){                         //get player by name
       return playerRepository.getPlayerByName(username);

    }

    public List<Player> getAllPlayers(){                              //get all player

        return playerRepository.getAllPlayer();
    }

    public void deleteSchoolById(String password){                     // Delete by id
        Player player=playerRepository.getPlayerID(password);
        player.setIsActive(false);
        playerRepository.save(player);

    }

    public void updatePlayer (){                //Update Player

        Player player=new Player();
        player.setId(1);
        player.setUserName("IslamAhmed");
        player.setPassword("Islam001");
        player.setTeamName("All for one");
        player.setSport("football");
        player.setCreateDate(new Date());
        player.setUpdateDate(new Date());
        player.setIsActive(Boolean.TRUE);
        playerRepository.save(player);

    }


    public Player getPlayerById(Integer id){                         //get player by id
      Player player=playerRepository.getPlayerId(id);
      return player;

    }
}
