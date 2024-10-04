package com.TechConnecGrupo3.TechConnec_api.dto;


import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class EventIdDTO {

    private String title;
    private String location;
    private LocalDate eventDate;
    private LocalTime eventTime;
}
