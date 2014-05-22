package com.mycompany.dao;

import com.mycompany.model.Team;

import java.util.List;

public interface TeamDao {


    public void addTeam(Team team);

    public void deleteTeam(int teamId);

    public void updateTeam(Team team);

    public Team getTeam(int teamId);

    public List<Team> getAllTeams();


}
