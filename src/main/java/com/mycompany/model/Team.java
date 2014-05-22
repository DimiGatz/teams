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

    public Team(String coach, String name, int titlesWon) {
        this.coach = coach;
        this.name = name;
        this.titlesWon = titlesWon;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public int getTitlesWon() {
        return titlesWon;
    }

    public void setTitlesWon(int titlesWon) {
        this.titlesWon = titlesWon;
    }

    @Override
    public String toString() {
        return "Team{" +
                "coach='" + coach + '\'' +
                ", teamId=" + teamId +
                ", name='" + name + '\'' +
                ", titlesWon=" + titlesWon +
                '}';
    }
}
