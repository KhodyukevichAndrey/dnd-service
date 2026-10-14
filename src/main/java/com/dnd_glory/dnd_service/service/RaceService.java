package com.dnd_glory.dnd_service.service;

import com.dnd_glory.dnd_service.model.race.dto.RaceDto;

import java.util.List;

public interface RaceService {

    List<RaceDto> findAllRaces();
}
