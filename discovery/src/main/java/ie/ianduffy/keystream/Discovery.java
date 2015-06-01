package ie.ianduffy.keystream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@EnableDiscoveryClient
@SpringBootApplication
@EnableAutoConfiguration
public class Discovery {

    public static void main(String[] args) {
        SpringApplication.run(Discovery.class, args);
    }

}
