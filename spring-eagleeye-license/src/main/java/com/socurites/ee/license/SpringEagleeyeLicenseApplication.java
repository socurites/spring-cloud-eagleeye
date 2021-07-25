package com.socurites.ee.license;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@EnableDiscoveryClient
public class SpringEagleeyeLicenseApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringEagleeyeLicenseApplication.class, args);
  }

}
