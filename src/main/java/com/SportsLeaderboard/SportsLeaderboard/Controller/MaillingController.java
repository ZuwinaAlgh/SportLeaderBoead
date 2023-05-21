package com.SportsLeaderboard.SportsLeaderboard.Controller;

import com.SportsLeaderboard.SportsLeaderboard.Models.EmailDetails;
import com.SportsLeaderboard.SportsLeaderboard.Service.MaillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="email")
public class MaillingController {

    @Autowired
    MaillingService maillingService;


    @PostMapping(value = "sendSimpleMail")                                                   //send Simple Mail
    public String sendSimpleMail(@RequestBody EmailDetails emailDetails){
        String mail=maillingService.sendSimpleMail(emailDetails);
        return  mail;
    }
}
