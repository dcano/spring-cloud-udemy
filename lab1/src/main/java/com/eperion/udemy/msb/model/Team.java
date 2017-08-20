package com.eperion.udemy.msb.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Team {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String location;
    private String mascot;

    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name = "teamId")
    private Set<Player> players;

    public Team(){}

    public Team(long id, String name, String location, String mascot) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.mascot = mascot;
    }

    public Team(String name, String location, Set<Player> players) {
        this.name = name;
        this.location = location;
        this.players = players;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMascot() {
        return mascot;
    }

    public void setMascot(String mascot) {
        this.mascot = mascot;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }
}
