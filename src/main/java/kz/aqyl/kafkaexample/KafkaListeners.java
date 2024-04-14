package kz.aqyl.kafkaexample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

  @KafkaListener(
          topics = "aqyl",
          groupId = "groupId"
  )
  void Listener(String data){
    System.out.println("Listener recieved: the " + data + ", congrats!");
  }
}
