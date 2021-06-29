package com.codingdojo.danaaltier.events.repositories;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.danaaltier.events.models.Event;

public interface EventRepo extends CrudRepository<Event, Long> {

}
