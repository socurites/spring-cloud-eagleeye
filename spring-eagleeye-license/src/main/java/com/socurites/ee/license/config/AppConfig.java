package com.socurites.ee.license.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
public class AppConfig {
  private final String exampleProperty;

  public AppConfig(@Value("${example.property}") String exampleProperty) {
    this.exampleProperty = exampleProperty;
  }
}
