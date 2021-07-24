package com.socurites.ee.license.domain.license;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface LicenseRepository extends CrudRepository<License, Long> {
  List<License> findByOrganizationId(String organizationId);

  Optional<License> findByOrganizationIdAndLicenseId(String organizationId,
                                             String licenseId);
}
