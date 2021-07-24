package com.socurites.ee.license.dto;

import com.socurites.ee.license.domain.license.License;
import lombok.Getter;

import java.time.LocalDateTime;


@Getter
public class LicenseResponseDto {
  private String licenseId;
  private String organizationId;
  private String productName;
  private String licenseType;
  private String comment;
  private LocalDateTime createdDate;
  private LocalDateTime modifiedDate;

  public LicenseResponseDto(License entity) {
    this.licenseId = entity.getLicenseId();
    this.organizationId = entity.getOrganizationId();
    this.productName = entity.getProductName();
    this.licenseType = entity.getLicenseType();
    this.comment = entity.getComment();
    this.createdDate = entity.getCreatedDate();
    this.modifiedDate = entity.getModifiedDate();
  }
}
