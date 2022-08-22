package dio.expertosTech.tutorialmicrosservico2kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class TutorialMicrosservico2KafkaApplication {

	public static void main(String[] args) {

		SpringApplication.run(TutorialMicrosservico2KafkaApplication.class, args);
	}

}
