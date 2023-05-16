package com.SportsLeaderboard.SportsLeaderboard.Controller;

import com.SportsLeaderboard.SportsLeaderboard.Service.ReportService;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RequestMapping(value="report")
@RestController
public class ReportController {

    @Autowired
    ReportService reportService;

    @RequestMapping(value="generateLeaderBoardReports")
    public String generateLeaderBoardReports() throws JRException, FileNotFoundException {
        return reportService.generateLeaderBoardReports();
    }
}
