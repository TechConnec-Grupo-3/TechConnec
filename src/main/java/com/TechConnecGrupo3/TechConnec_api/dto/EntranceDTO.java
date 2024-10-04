package com.TechConnecGrupo3.TechConnec_api.dto;

public class EntranceDTO {

    private Integer entranceId;
    private Integer userId;
    private Integer eventId;
    private Integer paymentId;
    private String code;

    // Getters and Setters
    public Integer getEntranceId() {
        return entranceId;
    }

    public void setEntranceId(Integer entranceId) {
        this.entranceId = entranceId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
