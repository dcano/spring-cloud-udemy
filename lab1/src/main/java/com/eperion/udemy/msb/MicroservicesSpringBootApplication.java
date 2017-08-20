package com.eperion.udemy.msb;

import com.eperion.udemy.msb.model.Player;
import com.eperion.udemy.msb.model.Team;
import com.eperion.udemy.msb.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class MicroservicesSpringBootApplication {

	@Autowired
	private TeamRepository teamRepository;

	public MicroservicesSpringBootApplication(){}

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesSpringBootApplication.class, args);
	}

	@PostConstruct
	public void init() {
		List<Team> list = new ArrayList<>();
		Set<Player> set = new HashSet<>();
		set.add(new Player("Big Easy", "Showman"));
		set.add(new Player("Buckets", "Guard"));
		set.add(new Player("Dizzy", "Guard"));
		list.add(new Team("Harlem", "Globetrotters", set));
		list.add(new Team("Washington","Generals",null));
		System.out.println("Initialization completed");
		teamRepository.save(list);
	}

}
