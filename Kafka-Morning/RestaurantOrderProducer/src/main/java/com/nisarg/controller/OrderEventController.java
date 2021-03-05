package com.nisarg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.nisarg.domain.OrderEvent;
import com.nisarg.producer.OrderEventProducer;


@RestController
public class OrderEventController {
	
	@Autowired
	private OrderEventProducer orderEventProducer;
	
	@PostMapping("/orderEvent")
	public ResponseEntity<OrderEvent> postLibraryEvent(@RequestBody OrderEvent orderEvent)
			throws JsonProcessingException {

		orderEventProducer.sendLibraryEventAsynchronous(orderEvent);

		return ResponseEntity.status(HttpStatus.CREATED).body(orderEvent);
	}
	

}
