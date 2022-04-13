package com.interoffice.company.infrastructure.memory;

import com.interoffice.company.domain.Company;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class InMemoryCompanyRepository {
  private AtomicLong atomicLong = new AtomicLong(1);
  private Map<Long, Company> companyMap = new ConcurrentHashMap<>();

  public Company save(Company company) {
    if (0 == company.getId()) {
      long id = atomicLong.getAndIncrement();
      company.setId(id);
    }
    return companyMap.put(company.getId(), company);
  }

  public Company findByBusinessRegistrationNumber(String businessRegistrationNumber) {
    return companyMap
        .values()
        .stream()
        .filter(it -> it.getBusinessRegistrationNumber().equals(businessRegistrationNumber))
        .findFirst()
        .orElse(null);
  }
}
