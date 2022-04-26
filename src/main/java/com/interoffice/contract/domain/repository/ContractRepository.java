package com.interoffice.contract.domain.repository;

import com.interoffice.contract.domain.Contract;
import java.time.LocalDate;

public interface ContractRepository {
  Contract save(Contract contract);
  Contract findByStartDateAndExpireDate(LocalDate start, LocalDate end);
}
