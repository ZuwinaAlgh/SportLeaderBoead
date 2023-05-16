package com.SportsLeaderboard.SportsLeaderboard.Controller;


import com.SportsLeaderboard.SportsLeaderboard.Slack.SlackClient;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value="Security")
@RestController
public class SecurityController {

    SlackClient slackClient;

    @GetMapping(value = "usertest")
    @PreAuthorize("hasRole('USER')")
    public String test(){
        return "Welcome to the System";
    }

}
