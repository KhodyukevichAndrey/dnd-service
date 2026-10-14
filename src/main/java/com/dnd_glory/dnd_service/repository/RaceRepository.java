package com.dnd_glory.dnd_service.repository;

import com.dnd_glory.dnd_service.model.race.Race;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RaceRepository extends JpaRepository<Race, Integer> {
}
