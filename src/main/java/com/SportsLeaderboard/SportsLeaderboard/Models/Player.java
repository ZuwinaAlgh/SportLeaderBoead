package com.SportsLeaderboard.SportsLeaderboard.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class Player extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    // to genarate primary key
    Integer id;
    String userName;
    String password;
    String teamName;
    String sport;

}
