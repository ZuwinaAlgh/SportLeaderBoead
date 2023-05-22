package com.SportsLeaderboard.SportsLeaderboard.Repositories;

import com.SportsLeaderboard.SportsLeaderboard.Models.LeaderBoard;
import com.SportsLeaderboard.SportsLeaderboard.Models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LeaderBoardRepository extends JpaRepository<LeaderBoard, Integer> {

    @Query(value = "SELECT s FROM LeaderBoard s")
    List<LeaderBoard> getAllLeaderBoard();
}
