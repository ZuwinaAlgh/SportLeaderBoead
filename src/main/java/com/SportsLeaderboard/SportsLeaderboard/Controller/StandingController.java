package com.SportsLeaderboard.SportsLeaderboard.Controller;

import com.SportsLeaderboard.SportsLeaderboard.Service.StandingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping(value = "standings")
public class StandingController {
    @Autowired
    StandingService standingService;

    @RequestMapping(value = "addStanding", method = RequestMethod.POST)                 //add Standing
    public void addStanding(String userName){
        standingService.addStandings(userName);

    }

    @RequestMapping(value = "getStandingByPlayerId", method = RequestMethod.GET)
    public List<Integer> getStandingByPlayerId(@RequestParam Integer id) {
       List <Integer> Standings = standingService.getStandingByPlayerId(id);
        return Standings;
    }

    @RequestMapping(value = "deleteStandingsById",method = RequestMethod.GET)             //delete Standing
    public void deleteStandingsById(@RequestParam Integer id) {
        standingService.deleteStandingById(id);
    }

    @RequestMapping(value = "updateStandings")                                  // update Standing
    public void updateStandings(@RequestParam  String userName) throws ParseException {
        standingService.updateStandings(userName);
    }

    @RequestMapping(value = "generateAllStandings")                                  // update Standing
    public void generateAllStandings() {
        standingService.getAllStandings();
    }


}
