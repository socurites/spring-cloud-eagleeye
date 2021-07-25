package com.socurites.ee.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringEagleeyeDiscoveryApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringEagleeyeDiscoveryApplication.class, args);
  }

}
