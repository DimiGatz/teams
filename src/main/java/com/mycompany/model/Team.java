package com.mycompany.model;


import javax.persistence.*;

@Entity
@Table(name = "team")
public class Team {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int teamId;

    @Column
    private String name;

    @Column
    private String coach;

    @Column
    private int titlesWon;


    public Team() {
    }

    public Team(int id, String name, String coach, int titles) {
        this.teamId = id;
        this.name = name;
        this.coach = coach;
        this.titlesWon = titles;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getTitles() {
        return titlesWon;
    }

    public void setTitles(int titles) {
        this.titlesWon = titles;
    }


    @Override
    public String toString() {
        return "Team{" +
                "coach='" + coach + '\'' +
                ", teamId=" + teamId +
                ", name='" + name + '\'' +
                ", titles=" + titlesWon +
                '}';
    }
}
