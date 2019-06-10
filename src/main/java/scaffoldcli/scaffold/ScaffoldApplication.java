package scaffoldcli.scaffold;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScaffoldApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(ScaffoldApplication.class);

	public static void main(String[] args) {
	    // LOG.info("STARTING THE APPLICATION");
		SpringApplication.run(ScaffoldApplication.class, args);
		// LOG.info("APPLICATION FINISHED");
	}

	@Override
	public void run(String... args) {
		LOG.info("EXECUTING THE run function");
	}

}
