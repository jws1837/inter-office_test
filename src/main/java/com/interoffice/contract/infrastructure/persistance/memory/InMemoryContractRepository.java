package com.interoffice.contract.infrastructure.persistance.memory;

import com.interoffice.contract.domain.Contract;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Repository;

public class InMemoryContractRepository {
  private AtomicLong atomicLong = new AtomicLong(1);
  private Map<Long, Contract> contractMap = new ConcurrentHashMap<>();

  public Contract save(Contract contract) {
    if (0 == contract.getId()) {
      long id = atomicLong.getAndIncrement();
      contract.setId(id);
    }
    return contractMap.put(contract.getId(), contract);
  }

}
