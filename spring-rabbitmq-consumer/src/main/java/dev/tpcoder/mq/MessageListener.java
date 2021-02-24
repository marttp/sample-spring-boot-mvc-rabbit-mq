package dev.tpcoder.mq;

import dev.tpcoder.mq.config.MQConfig;
import dev.tpcoder.mq.model.CustomMessage;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

  @RabbitListener(queues = MQConfig.QUEUE)
  public void listener(CustomMessage message) {
    System.out.println(message);
  }

}