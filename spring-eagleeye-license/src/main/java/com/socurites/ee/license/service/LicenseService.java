package com.socurites.ee.license.service;

import com.socurites.ee.license.domain.license.License;
import com.socurites.ee.license.domain.license.LicenseRepository;
import com.socurites.ee.license.dto.LicenseResponseDto;
import com.socurites.ee.license.dto.LicenseSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LicenseService {
  private final LicenseRepository licenseRepository;

  @Transactional
  public LicenseResponseDto save(LicenseSaveRequestDto requestDto) {
    License saved = licenseRepository.save(requestDto.toEntity());
    LicenseResponseDto licenseResponseDto = new LicenseResponseDto(saved);

    return licenseResponseDto;
  }

  @Transactional(readOnly = true)
  public LicenseResponseDto getLicense(String organizationId, String licenseId) {
    License license = licenseRepository.findByOrganizationIdAndLicenseId(organizationId, licenseId)
      .orElseThrow(() ->
        new IllegalArgumentException(String.format("No license found for organizationId: %s, licenseId: %s",
          organizationId, licenseId)));

    return new LicenseResponseDto(license);
  }

  @Transactional(readOnly = true)
  public List<LicenseResponseDto> listLicenseByOrganizationId(String organizationId) {
    return licenseRepository.findByOrganizationId(organizationId).stream()
      .map(LicenseResponseDto::new)
      .collect(Collectors.toList());
  }
}
