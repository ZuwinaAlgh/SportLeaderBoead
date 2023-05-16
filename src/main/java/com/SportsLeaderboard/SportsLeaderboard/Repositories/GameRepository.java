package com.SportsLeaderboard.SportsLeaderboard.Repositories;

import com.SportsLeaderboard.SportsLeaderboard.Models.Game;
import com.SportsLeaderboard.SportsLeaderboard.Models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {


    @Query(value = "SELECT s FROM Game s WHERE s.id= :id")
    Game getGameID(@Param("id") Integer id);
}
