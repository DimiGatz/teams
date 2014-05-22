package com.mycompany.dao;

import com.mycompany.model.Team;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TeamDaoImpl implements TeamDao {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public void addTeam(Team team) {

        sessionFactory.getCurrentSession().save(team);

    }

    @Override
    public void deleteTeam(int teamId) {
        sessionFactory.getCurrentSession().delete(getTeam(teamId));
    }

    @Override
    public void updateTeam(Team team) {
        sessionFactory.getCurrentSession().update(team);
    }

    @Override
    public Team getTeam(int teamId) {
        return (Team) sessionFactory.getCurrentSession().get(Team.class, teamId);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Team> getAllTeams() {
        return sessionFactory.getCurrentSession().createQuery("from Team").list();
    }
}
