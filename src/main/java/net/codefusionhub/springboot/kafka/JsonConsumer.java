package net.codefusionhub.springboot.kafka;

import net.codefusionhub.springboot.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class JsonConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonProducer.class);


    @KafkaListener(topics = "${spring.kafka.topic-json.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(User user){
        LOGGER.info(String.format("Message received %s", user.toString()));
    }

}
