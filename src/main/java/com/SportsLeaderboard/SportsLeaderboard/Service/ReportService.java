package com.SportsLeaderboard.SportsLeaderboard.Service;

import com.SportsLeaderboard.SportsLeaderboard.DTO.LeaderBoardReports;
import com.SportsLeaderboard.SportsLeaderboard.Models.LeaderBoard;
import com.SportsLeaderboard.SportsLeaderboard.Models.Player;
import com.SportsLeaderboard.SportsLeaderboard.Models.Standings;
import com.SportsLeaderboard.SportsLeaderboard.Repositories.GameRepository;
import com.SportsLeaderboard.SportsLeaderboard.Repositories.LeaderBoardRepository;
import com.SportsLeaderboard.SportsLeaderboard.Repositories.PlayerRepository;
import com.SportsLeaderboard.SportsLeaderboard.Repositories.StandingRepository;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReportService{

    public static final String pathToReports = "C:\\Users\\user011\\Downloads\\reports";
    @Autowired
    private PlayerRepository playerRepository;
    @Autowired
    private GameRepository gameRepository;
    @Autowired
    private StandingRepository standingRepository;
    @Autowired
    private LeaderBoardRepository leaderBoardRepository;

    public String generateLeaderBoardReports() throws FileNotFoundException, JRException {
        List<Standings> standingsList=standingRepository.getAllStandings();
        List<LeaderBoardReports> leaderBoardReports=new ArrayList<>();
        for (Standings standings: standingsList){
            String userName=standings.getPlayer().getUserName();
            String password=standings.getPlayer().getPassword();
            String teamName=standings.getPlayer().getTeamName();
            String sport=standings.getPlayer().getSport();
            Integer score=standings.getGame().getScore();
            Integer win=standings.getWin();
            Integer loss=standings.getLoss();
            LeaderBoardReports leaderBoardReports1=new LeaderBoardReports(userName,password,teamName,sport,score,win,loss);
            leaderBoardReports.add(leaderBoardReports1);

        }

        File file = new File("C:\\Users\\user011\\Desktop\\SportsLeaderBoard\\SportLeaderBoead\\src\\main\\resources\\LeaderBoardReport.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(leaderBoardReports);
        Map<String, Object> paramters = new HashMap<>();
        paramters.put("CreatedBy", "ZuwinaALghafri");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,paramters , dataSource);
        JasperExportManager.exportReportToPdfFile(jasperPrint, pathToReports+"\\LeaderBoard.pdf");
        return "Report generated : " + pathToReports+"\\LeaderBoard.pdf";
    }



}
