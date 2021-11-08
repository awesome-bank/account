package com.awesomebank.account.services;

import com.awesomebank.account.entities.Account;

import java.util.List;

public interface AccountService {
    List<Account> getAccounts();

    Account getAccountById(Long id);
}
