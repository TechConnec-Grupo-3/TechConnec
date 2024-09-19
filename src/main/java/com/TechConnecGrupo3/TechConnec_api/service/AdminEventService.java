package com.TechConnecGrupo3.TechConnec_api.service;

import com.TechConnecGrupo3.TechConnec_api.model.entity.Event;

import java.util.List;

public interface AdminEventService {

    List<Event> findAll();
}