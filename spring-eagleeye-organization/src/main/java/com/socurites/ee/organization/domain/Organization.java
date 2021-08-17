package com.socurites.ee.organization.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Organization extends BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  String organizationId;

  @Column(nullable = false)
  String name;

  @Column(nullable = false)
  String contactName;

  @Column(nullable = false)
  String contactEmail;

  @Column(nullable = false)
  String contactPhone;
}
