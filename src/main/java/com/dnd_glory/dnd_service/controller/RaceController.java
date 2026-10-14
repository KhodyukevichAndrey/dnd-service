package com.dnd_glory.dnd_service.controller;

import com.dnd_glory.dnd_service.model.race.dto.RaceDto;
import com.dnd_glory.dnd_service.service.RaceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("races")
@RequiredArgsConstructor
public class RaceController {

    private final RaceService raceService;

    @GetMapping("/all")
    List<RaceDto> getAllRaces() {
        return raceService.findAllRaces();
    }
}
