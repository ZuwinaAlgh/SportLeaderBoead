package com.SportsLeaderboard.SportsLeaderboard.Controller;

import com.SportsLeaderboard.SportsLeaderboard.Slack.SlackClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    SlackClient slackClient;

    @GetMapping(value="slackMessage")
    public void message(@RequestParam String text) {
        slackClient.sendMessage(text);
    }
}
