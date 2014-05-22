package com.mycompany.service;

import com.mycompany.dao.TeamDao;
import com.mycompany.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamDao teamDao;


    @Transactional
    public void addTeam(Team team) {
        teamDao.addTeam(team);
    }

    @Transactional
    public void deleteTeam(int teamId) {
        teamDao.deleteTeam(teamId);
    }

    @Transactional
    public void updateTeam(Team team) {
        teamDao.updateTeam(team);
    }

    @Transactional
    public Team getTeam(int teamId) {
        return teamDao.getTeam(teamId);
    }

    @Transactional
    public List<Team> getAllTeams() {
        return teamDao.getAllTeams();
    }
}
