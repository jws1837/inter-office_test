package com.interoffice.company.domain.repository;

import com.interoffice.company.domain.Company;

public interface CompanyRepository {
  Company save(Company company);
  Company findByBusinessRegistrationNumber(String businessRegistrationNumber);
}
