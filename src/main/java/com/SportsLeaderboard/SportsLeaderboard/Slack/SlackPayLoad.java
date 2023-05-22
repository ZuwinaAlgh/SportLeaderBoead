package com.SportsLeaderboard.SportsLeaderboard.Slack;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;



@Setter
@Getter
@Data
public class SlackPayLoad {

    private String text;
    public SlackPayLoad(String text){this.text=text;}
}
