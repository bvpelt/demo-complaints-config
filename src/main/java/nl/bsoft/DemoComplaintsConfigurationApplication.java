package nl.bsoft;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DemoComplaintsConfigurationApplication {

    private final Logger log = LoggerFactory.getLogger(DemoComplaintsConfigurationApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoComplaintsConfigurationApplication.class, args);
    }
}
