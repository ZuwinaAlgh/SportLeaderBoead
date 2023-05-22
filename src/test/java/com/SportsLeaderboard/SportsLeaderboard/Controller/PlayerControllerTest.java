package com.SportsLeaderboard.SportsLeaderboard.Controller;

import com.SportsLeaderboard.SportsLeaderboard.Models.Player;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PlayerControllerTest {

    @Autowired
    PlayerController playerController;

    @Test
    void getPlayerByIdWhenId2() {
        Player playerTest;
        playerTest=playerController.GetPlayerById(2);
        String userName=playerTest.getUserName();
        assertEquals("Mohammed",userName);

    }


    @Test
    void updatePlayerWhenId1() {
        Player playertest;
        playertest=playerController.GetPlayerById(1);
        String sport=playertest.getSport();
        assertEquals("football",sport);
    }

    @Test
    void generateAllPlayer() {
        Player playerTest2;
        playerTest2=playerController.GetPlayerById(1);
        String password=playerTest2.getPassword();
        assertEquals("Isalm21",password);



    }
}