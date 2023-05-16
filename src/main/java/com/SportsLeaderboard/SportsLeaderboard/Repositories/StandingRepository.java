package com.SportsLeaderboard.SportsLeaderboard.Repositories;

import com.SportsLeaderboard.SportsLeaderboard.Models.Game;
import com.SportsLeaderboard.SportsLeaderboard.Models.Player;
import com.SportsLeaderboard.SportsLeaderboard.Models.Standings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StandingRepository extends JpaRepository<Standings, Integer> {

    @Query(value = "SELECT id FROM Standings WHERE player_id= :player_id")                //get Standing id by player id
    List<Integer> getStandingByPlayerId(@Param("player_id") Integer player_id);


    @Query(value = "SELECT s FROM Standings s WHERE s.id= :id")
    Standings getStandingID(@Param("id") Integer id);


    @Query(value = "SELECT s FROM Standings")
    List<Standings> getAllStandings();

}
