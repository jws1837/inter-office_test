package com.interoffice.dao;

import com.interoffice.domain.Account;
import org.springframework.stereotype.Repository;

/**
 *데이터 접근하는 인터페이스입니다. 
 *
 */
@Repository
public interface AccountDao {
  Account getAccount();

}
