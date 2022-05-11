package com.interoffice.account.infrastructure.configuration;

import com.interoffice.account.application.processor.AccountCreateProcessor;
import com.interoffice.account.application.processor.AccountLoginProcessor;
import com.interoffice.account.domain.PasswordEncoder;
import com.interoffice.account.domain.repository.AccountRepository;
import com.interoffice.account.infrastructure.encoder.SHA256PasswordEncoder;
import com.interoffice.account.infrastructure.persistence.AccountRepositoryAdapter;
import com.interoffice.account.infrastructure.persistence.memory.InMemroyAccountRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccountProcessorConfiguration {
  @Bean
  public AccountCreateProcessor accountCreateProcessor(AccountRepository accountRepository,
      PasswordEncoder passwordEncoder) {
    return new AccountCreateProcessor(accountRepository, passwordEncoder);
  }
  @Bean
  public AccountLoginProcessor accountLoginProcessor(
          AccountRepository accountRepository,
          PasswordEncoder passwordEncoder){
    return new AccountLoginProcessor(accountRepository, passwordEncoder);
  }

  @Bean
  public AccountRepository accountRepository() {
    return new AccountRepositoryAdapter(new InMemroyAccountRepository());

  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new SHA256PasswordEncoder();
  }

}
