package com.interoffice.company.infrastructure;

import com.interoffice.company.domain.Company;
import com.interoffice.company.domain.repository.CompanyRepository;
import com.interoffice.company.infrastructure.memory.InMemoryCompanyRepository;

public class CompanyRepositoryAdapter implements CompanyRepository {
  private InMemoryCompanyRepository inMemoryCompanyRepository;

  public CompanyRepositoryAdapter(
      InMemoryCompanyRepository inMemoryCompanyRepository) {
    this.inMemoryCompanyRepository = inMemoryCompanyRepository;
  }

  @Override
  public Company save(Company company) {
    return inMemoryCompanyRepository.save(company);
  }

  @Override
  public Company findByBusinessRegistrationNumber(String businessRegistrationNumber) {
    return inMemoryCompanyRepository.findByBusinessRegistrationNumber(businessRegistrationNumber);
  }
}
