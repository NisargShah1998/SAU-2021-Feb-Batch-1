package com.nisarg.listener;

import java.util.List;

import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.nisarg.domain.OrderEvent;

@EnableKafka
@Service
public class OrderListener {
	
	@org.springframework.kafka.annotation.KafkaListener(id="kafka_group_one",topics="test-topic")
	public void processMessage(@Payload List<OrderEvent> orderEvents,
			@Header(KafkaHeaders.RECEIVED_PARTITION_ID) List<Integer> partitions,
			@Header(KafkaHeaders.OFFSET) List<Long> offset) {
		System.out.println(orderEvents.get(0));
	}

}
