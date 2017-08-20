package com.eperion.udemy.msb.repository;

import com.eperion.udemy.msb.model.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

@Repository
@RestResource(path="teams", rel="team")
public interface TeamRepository extends CrudRepository<Team, Long> {
}
