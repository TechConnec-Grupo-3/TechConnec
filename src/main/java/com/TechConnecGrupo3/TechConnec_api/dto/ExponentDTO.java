package com.TechConnecGrupo3.TechConnec_api.dto;

public class ExponentDTO {

    private Integer exponentId;
    private Integer eventId;
    private String name;
    private String description;

    // Getters and Setters
    public Integer getExponentId() {
        return exponentId;
    }

    public void setExponentId(Integer exponentId) {
        this.exponentId = exponentId;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
