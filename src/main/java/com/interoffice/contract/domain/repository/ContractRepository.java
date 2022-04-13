package com.interoffice.contract.domain.repository;

import com.interoffice.contract.domain.Contract;
import org.springframework.stereotype.Repository;

public interface ContractRepository {
  Contract save(Contract contract);
}
