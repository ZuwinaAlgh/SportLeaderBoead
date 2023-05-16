package com.SportsLeaderboard.SportsLeaderboard.Repositories;

import com.SportsLeaderboard.SportsLeaderboard.Models.LeaderBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaderBoardRepository extends JpaRepository<LeaderBoard, Integer> {
}
