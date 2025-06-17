package com.telusko.kafkaSBSubscriber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import com.telusko.kafkaSBSubscriber.util.AppConstants;

@SpringBootApplication
public class KafkaSbSubscriberApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaSbSubscriberApplication.class, args);
	}
	
	@KafkaListener(topics = AppConstants.TOPIC_NAME, groupId="group_telusko_customer")
	public void subscribeMsg(String cxData) {
			System.out.print("* Msg Recieved From Kafka server* :: ");
			System.out.println(cxData);
		
	}

}
