package com.dnd_glory.dnd_service.model.race.mapper;

import com.dnd_glory.dnd_service.model.race.Race;
import com.dnd_glory.dnd_service.model.race.dto.RaceDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RaceMapper {

    List<RaceDto> raceToDto(List<Race> races);

    RaceDto singleRaceToDto(Race race);
}
