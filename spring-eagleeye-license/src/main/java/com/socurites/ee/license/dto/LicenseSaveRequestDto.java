package com.socurites.ee.license.dto;

import com.socurites.ee.license.domain.license.License;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
public class LicenseSaveRequestDto {
  private String licenseId;
  private String organizationId;
  private String productName;
  private String licenseType;
  private String comment;

  public License toEntity() {
    return License.builder()
      .licenseId(UUID.randomUUID().toString().replace("-", ""))
      .organizationId(organizationId)
      .productName(productName)
      .licenseType(licenseType)
      .comment(comment)
      .build();
  }
}
