package com.TechConnecGrupo3.TechConnec_api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class EventDTO {

    private Integer eventId;
    @NotBlank(message = "organizerId obligatorio")
    private Integer organizerId;
    @NotBlank(message = "categoryId obligatorio")
    private Integer categoryId;
    @NotBlank(message = "categoryId obligatorio")
    private Integer exponentId;
    @NotBlank(message = "El titulo no puede estar vacio")
    @Size(max = 100, message = "Titulo maximo de 100 caracteres")
    private String title;
    @NotBlank(message = "La descripcion no puede estar vacio")
    @Size(max = 500, message = "Descripcion maximo de 500 caracteres")
    private String description;
    @NotBlank(message = "La ubicacion no puede estar vacia")
    @Size(max = 100, message = "Ubicacion maximo de 100 caracteres")
    private String location;
    @NotBlank(message = "El campo compartir no puede estar vacio")
    @Size(max = 100, message = "Compartir maximo de 100 caracteres")
    private String share;
    @NotBlank(message = "El registro no puede estar vacio")
    private String registration;
    @NotBlank(message = "El tipo de evento no puede estar vacio")
    private String typeEvent;
    @NotBlank(message = "La fecha no puede estar vacia")
    private LocalDate eventDate;
    @NotBlank(message = "La duracion no puede estar vacia")
    private LocalTime eventTime;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Getters and Setters
    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public Integer getOrganizerId() {
        return organizerId;
    }

    public void setOrganizerId(Integer organizerId) {
        this.organizerId = organizerId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getExponentId() {
        return exponentId;
    }

    public void setExponentId(Integer exponentId) {
        this.exponentId = exponentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getTypeEvent() {
        return typeEvent;
    }

    public void setTypeEvent(String typeEvent) {
        this.typeEvent = typeEvent;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public LocalTime getEventTime() {
        return eventTime;
    }

    public void setEventTime(LocalTime eventTime) {
        this.eventTime = eventTime;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
