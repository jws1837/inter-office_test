package com.interoffice;

import com.interoffice.account.domain.PasswordEncoder;
import com.interoffice.account.infrastructure.configuration.AccountFacadeConfiguration;
import com.interoffice.account.infrastructure.configuration.AccountProcessorConfiguration;
import com.interoffice.account.infrastructure.configuration.AccountRepositoryConfiguration;
import com.interoffice.account.infrastructure.configuration.PasswordEncoderConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {

    ApplicationContext ac = new AnnotationConfigApplicationContext(
//      AccountRepositoryConfiguration.class);
//      AccountFacadeConfiguration.class);
//      AccountProcessorConfiguration.class);
            PasswordEncoderConfiguration.class);

    @Test
    void findBean() {
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            Object bean = ac.getBean(beanDefinitionName);
            System.out.println("name = " + beanDefinitionName + " ::: object = " + bean);
        }
    }

}
