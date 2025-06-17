package com.telusko.kafkaSBPublisher.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.telusko.kafkaSBPublisher.model.Customer;
import com.telusko.kafkaSBPublisher.util.AppConstants;

@Configuration
public class KafkaConfig {
	@Bean
	public ProducerFactory<String, Customer> producerFactory(){
		Map<String, Object> configs = new HashMap<>();
		configs.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, AppConstants.HOST_URL);
		configs.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		configs.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
		return new DefaultKafkaProducerFactory<String, Customer>(configs);
	}
	
	@Bean
	public KafkaTemplate<String, Customer> kafkaTemplate(){
		return new KafkaTemplate<String, Customer> (producerFactory());
	}
}
