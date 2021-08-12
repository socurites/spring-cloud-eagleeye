package com.socurites.ee.license.domain.license;

import com.socurites.ee.license.domain.BaseEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class License extends BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false, unique = true)
  private String licenseId;

  @Column(nullable = false)
  private String organizationId;

  private String productName;

  private String licenseType;

  @Column(nullable = false)
  private Integer licenseMax;

  @Column(nullable = false)
  private Integer licenseAllocated;

  private String comment;

  @Builder
  public License(String licenseId, String organizationId, String productName, String licenseType, String comment) {
    this.licenseId = licenseId;
    this.organizationId = organizationId;
    this.productName = productName;
    this.licenseType = licenseType;
    this.comment = comment;
  }
}
