package ie.ianduffy.keystream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration
public class Configuration {

    public static void main(String[] args) {
        SpringApplication.run(Configuration.class, args);
    }

}
