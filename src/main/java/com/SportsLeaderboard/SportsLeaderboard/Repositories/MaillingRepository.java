package com.SportsLeaderboard.SportsLeaderboard.Repositories;

import com.SportsLeaderboard.SportsLeaderboard.Models.EmailDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface MaillingRepository {
    String sendSimpleMail(EmailDetails emailDetails);
}
