package com.interoffice.account.infrastructure.configuration;

import com.interoffice.account.domain.Account;
import com.interoffice.account.domain.repository.AccountRepository;
import com.interoffice.account.infrastructure.persistence.AccountRepositoryAdapter;
import com.interoffice.account.infrastructure.persistence.memory.InMemroyAccountRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccountRepositoryConfiguration {


    @Bean
    public AccountRepository accountRepository(
            InMemroyAccountRepository inMemroyAccountRepository) {
        return new AccountRepositoryAdapter(inMemroyAccountRepository);
    }


    @Bean
    public InMemroyAccountRepository inMemroyAccountRepository() {
        return new InMemroyAccountRepository();
    }
}
