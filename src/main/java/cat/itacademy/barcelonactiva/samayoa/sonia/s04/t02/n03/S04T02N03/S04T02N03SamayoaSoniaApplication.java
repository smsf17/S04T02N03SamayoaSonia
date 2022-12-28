package cat.itacademy.barcelonactiva.samayoa.sonia.s04.t02.n03.S04T02N03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class S04T02N03SamayoaSoniaApplication {

	public static void main(String[] args) {
		SpringApplication.run(S04T02N03SamayoaSoniaApplication.class, args);
	}

}
