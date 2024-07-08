package org.pradosoftwares.user_data_analysis.consumers;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author Vinicius Gabriel <vinicius.prado@nexuscloud.com.br>
 * @version 1.0
 * @since 07/07/24
 */

@Component
public class UserDataConsumer {

    @KafkaListener(topics = "user-data", groupId = "user-data-analysis")
    public void consume(String message) {
        System.out.println("Consuming message: " + message);
    }
}
