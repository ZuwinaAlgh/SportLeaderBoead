package com.SportsLeaderboard.SportsLeaderboard.Service;

import com.SportsLeaderboard.SportsLeaderboard.Models.LeaderBoard;
import com.SportsLeaderboard.SportsLeaderboard.Slack.SlackClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class LeaderBoardSlack {

    @Autowired
    LeaderBoardService leaderBoardService;

    @Autowired
    SlackClient slackClient;

    @Scheduled(cron= "0 * * * * * ")
    @RequestMapping(value = "getAllLeaderBoard",method = RequestMethod.GET)
    public List<LeaderBoard> getAllleaderBoeard(){
        List<LeaderBoard> leaderBoardList= leaderBoardService.getAllLeaderBoard();
        for(LeaderBoard leaderBoard: leaderBoardList) {
            slackClient.sendMessage(leaderBoard.getId().toString());
            slackClient.sendMessage(leaderBoard.getCreateDate().toString());
            slackClient.sendMessage(leaderBoard.getUpdateDate().toString());
            slackClient.sendMessage(leaderBoard.getIsActive().toString());
            slackClient.sendMessage(leaderBoard.getStandings().getPlayer().getUserName().toString());
            slackClient.sendMessage(leaderBoard.getStandings().getPlayer().getSport().toString());
            slackClient.sendMessage(leaderBoard.getStandings().getPlayer().getTeamName().toString());
            slackClient.sendMessage(leaderBoard.getStandings().getWin().toString());
            slackClient.sendMessage(leaderBoard.getStandings().getLoss().toString());
        }

        return leaderBoardList;
    }
}
