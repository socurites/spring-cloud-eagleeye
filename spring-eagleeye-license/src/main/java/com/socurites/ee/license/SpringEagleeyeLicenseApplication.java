package com.socurites.ee.license;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringEagleeyeLicenseApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringEagleeyeLicenseApplication.class, args);
  }

}
