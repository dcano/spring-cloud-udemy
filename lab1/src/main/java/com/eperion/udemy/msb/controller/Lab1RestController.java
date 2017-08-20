package com.eperion.udemy.msb.controller;

import com.eperion.udemy.msb.model.Team;
import com.eperion.udemy.msb.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class Lab1RestController {

    private TeamRepository teamRepository;

    @Autowired
    public Lab1RestController(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @RequestMapping("/teams")
    public Iterable<Team> teamList() {
        //List<Team> list = new ArrayList<>();
        //Team team = new Team();
        //team.setId(0l);
        //team.setLocation("Harlem");
        //team.setName("Globetrotters");
        //list.add(team);
        //team = new Team();
        //team.setId(1l);
        //team.setLocation("Washington");
        ////team.setName("Generals");
        //list.add(team);
        //return list;
        return teamRepository.findAll();
    }

    @RequestMapping("/team/{id}")
    public Team getTeam(@PathVariable Long id) {
        return teamRepository.findOne(id);
    }



}
