package net.ahmadiqbal.springboot.kafka;

import net.ahmadiqbal.springboot.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "myGroup")
    public void consume(User user){
        LOGGER.info("Json message received -> {}", user);
    }
}
