package com.dnd_glory.dnd_service.service.impl;

import com.dnd_glory.dnd_service.model.race.Race;
import com.dnd_glory.dnd_service.model.race.dto.RaceDto;
import com.dnd_glory.dnd_service.model.race.mapper.RaceMapper;
import com.dnd_glory.dnd_service.repository.RaceRepository;
import com.dnd_glory.dnd_service.service.RaceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RaceServiceImpl implements RaceService {

    private final RaceRepository raceRepository;
    private final RaceMapper raceMapper;

    @Override
    public List<RaceDto> findAllRaces() {
        List<Race> races = raceRepository.findAll();

        return raceMapper.raceToDto(races);
    }
}
