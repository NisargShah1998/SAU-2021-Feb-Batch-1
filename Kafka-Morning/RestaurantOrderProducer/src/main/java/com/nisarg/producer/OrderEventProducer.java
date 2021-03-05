package com.nisarg.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.nisarg.domain.OrderEvent;

@Service
public class OrderEventProducer {

	@Autowired
	private KafkaTemplate<String, OrderEvent> kafkaTemplate;

	public void sendLibraryEventAsynchronous(OrderEvent orderEvent) throws JsonProcessingException {
		kafkaTemplate.send("test-topic", orderEvent);
	}

}
