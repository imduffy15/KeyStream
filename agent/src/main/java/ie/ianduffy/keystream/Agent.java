package ie.ianduffy.keystream;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@EnableAutoConfiguration
public class Agent {

    public static void main(String[] args) {
        SpringApplicationBuilder app = new SpringApplicationBuilder(Agent.class);
        app.headless(false).run(args);
    }


}