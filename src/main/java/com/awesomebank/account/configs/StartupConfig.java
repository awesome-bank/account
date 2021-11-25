package com.awesomebank.account.configs;

import com.awesomebank.account.entities.Account;
import com.awesomebank.account.repositories.AccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Slf4j
@RequiredArgsConstructor
public class StartupConfig implements ApplicationRunner {
    private final AccountRepository accountRepository;

    @Override
    public void run(ApplicationArguments args) {
        if (accountRepository.findAll().isEmpty()) {
            accountRepository.saveAll(Arrays.asList(
                    Account.builder().name("Vipul Kumar").build(),
                    Account.builder().name("Yama Srikant").build(),
                    Account.builder().name("Avinash Dabhade").build()
            ));
        }
    }
}
