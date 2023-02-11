package com.javatechie;

import com.javatechie.dto.PaymentRequest;
import com.javatechie.dto.PaytmRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
@Slf4j
public class ConsumerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerDemoApplication.class, args);

	}

	@KafkaListener(topics = "PAYMENT_TOPIC4", groupId = "myConsumer")
	public void consumer1(PaytmRequest<PaymentRequest> paytmRequest) {
		log.info(String.format("$$$$ => consumer1 Consumed message: %s", paytmRequest.toString()));
	}

	@KafkaListener(topics = "PAYMENT_TOPIC4", groupId = "myConsumer")
	public void consumer2(PaytmRequest<PaymentRequest> paytmRequest) {
		log.info(String.format("$$$$ => consumer2 Consumed message: %s", paytmRequest.toString()));
	}

	@KafkaListener(topics = "PAYMENT_TOPIC4", groupId = "myConsumer")
	public void consumer3(PaytmRequest<PaymentRequest> paytmRequest) {
		log.info(String.format("$$$$ => consumer3 Consumed message: %s", paytmRequest.toString()));
	}

	@KafkaListener(topics = "PAYMENT_TOPIC4", groupId = "myConsumer")
	public void consumer4(PaytmRequest<PaymentRequest> paytmRequest) {
		log.info(String.format("$$$$ => consumer4 Consumed message: %s", paytmRequest.toString()));
	}





}
