package com.SportsLeaderboard.SportsLeaderboard.Controller;

import com.SportsLeaderboard.SportsLeaderboard.Models.LeaderBoard;
import com.SportsLeaderboard.SportsLeaderboard.Models.Player;
import com.SportsLeaderboard.SportsLeaderboard.Service.LeaderBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "leaderBoard")
public class LeaderBoardController {
    @Autowired
    LeaderBoardService leaderBoardService;


    @RequestMapping(value = "addLeaderBoard", method = RequestMethod.POST)                 //add leaderBoard
    public void addLeaderBoards(String username){
        leaderBoardService.addLeaderBoards(username);

    }

    @RequestMapping(value = "GetAllLeaderBoard")
    public List<LeaderBoard> getAllLeaderBoard(){
        List<LeaderBoard> leaderBoardList=leaderBoardService.getAllLeaderBoard();
        return leaderBoardList;
    }
}
