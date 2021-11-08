package com.awesomebank.account.services.impl;

import com.awesomebank.account.entities.Account;
import com.awesomebank.account.exceptions.AccountNotFoundException;
import com.awesomebank.account.repositories.AccountRepository;
import com.awesomebank.account.services.AccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    public List<Account> getAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Account getAccountById(Long id) {
        return accountRepository.findById(id).orElseThrow(() -> new AccountNotFoundException(String.format("Could not find account with id: %s", id)));
    }
}
