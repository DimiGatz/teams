package com.mycompany.controller;


import com.mycompany.model.Team;
import com.mycompany.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TeamController {


    @Autowired
    private TeamService teamService;


    @RequestMapping("/index")
    public String setupForm(Model map) {

        Team team = new Team();

        map.addAttribute("team", team);
        map.addAttribute("teamList", teamService.getAllTeams());

        return "team";

    }


    @RequestMapping(value = "/team.do", method = RequestMethod.POST)
    public String doActions(@ModelAttribute Team team,
                            BindingResult bindingResult,
                            @RequestParam String action,
                            Model map) {


        Team teamResult = new Team();

        switch (action.toLowerCase()) {

            case "add":
                teamService.addTeam(team);
                teamResult = team;
                break;
            case "edit":
                teamService.updateTeam(team);
                teamResult = team;
                break;
            case "delete":
                teamService.deleteTeam(team.getTeamId());
                teamResult = team;
                break;
            case "search":
                Team searchedTeam = teamService.getTeam(team.getTeamId());
                teamResult = searchedTeam != null ? searchedTeam : new Team();
                break;

        }

        map.addAttribute("team", teamResult);
        map.addAttribute("teamList", teamService.getAllTeams());


        return "team";

    }


}
