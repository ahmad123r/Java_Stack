package com.codingdojo.danaaltier.events.repositories;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.danaaltier.events.models.Message;

public interface MessageRepo extends CrudRepository<Message, Long> {

}
