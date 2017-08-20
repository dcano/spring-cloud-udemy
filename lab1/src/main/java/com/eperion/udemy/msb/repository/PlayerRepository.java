package com.eperion.udemy.msb.repository;

import com.eperion.udemy.msb.model.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path="players", rel="player")
public interface PlayerRepository extends CrudRepository<Player, Long> {
}
