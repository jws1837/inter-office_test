package com.interoffice.contract.domain.repository;

import com.interoffice.contract.domain.Contract;
import java.sql.Timestamp;

public interface ContractRepository {
  Contract save(Contract contract);
  Contract findByStartDateAndExpireDate(Timestamp start, Timestamp end);
}
