package com.telusko.kafkaSBSubscriber.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import com.telusko.kafkaSBSubscriber.model.Customer;
import com.telusko.kafkaSBSubscriber.util.AppConstants;

@Configuration
public class KafkaConfig {
	@Bean
	public ConsumerFactory<String, Customer> consumerFactory(){
		Map<String, Object> configs = new HashMap<>();
		configs.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, AppConstants.HOST_URL);
		configs.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		configs.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
		return new DefaultKafkaConsumerFactory<String, Customer>(configs);
	}
	
	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, Customer> kafkaListenerFactory(){
		ConcurrentKafkaListenerContainerFactory<String, Customer> factory = new ConcurrentKafkaListenerContainerFactory<String, Customer>();
		factory.setConsumerFactory(consumerFactory());
		return factory;
	}
}
