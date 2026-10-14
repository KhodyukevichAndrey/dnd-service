package com.dnd_glory.dnd_service.model.race.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RaceDto {

    private String name;
    private String visualName;
}
