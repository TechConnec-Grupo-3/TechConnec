package com.TechConnecGrupo3.TechConnec_api.dto;

import com.TechConnecGrupo3.TechConnec_api.model.enums.EventType;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
public class EventListIdDTO {

    private String title;
    private String description;
    private String location;
    private EventType typeEvent;
    private LocalDate eventDate;
    private LocalTime eventTime;
}
