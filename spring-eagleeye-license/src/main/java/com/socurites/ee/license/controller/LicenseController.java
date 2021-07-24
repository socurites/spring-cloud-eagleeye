package com.socurites.ee.license.controller;

import com.socurites.ee.license.config.AppConfig;
import com.socurites.ee.license.domain.license.License;
import com.socurites.ee.license.dto.LicenseResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value="/organizations/{organizationId}/licenses/")
public class LicenseController {
  private final AppConfig appConfig;

  @GetMapping("/{licenseId}")
  public ResponseEntity<LicenseResponseDto> getLicense(@PathVariable String organizationId,
                                                       @PathVariable String licenseId) {
    License license = License.builder()
      .licenseId(licenseId)
      .organizationId(organizationId)
      .productName("Teleco")
      .licenseType("Seat")
      .comment(appConfig.getExampleProperty())
      .build();

    return ResponseEntity
      .status(HttpStatus.OK)
      .body(new LicenseResponseDto(license));
  }
}
