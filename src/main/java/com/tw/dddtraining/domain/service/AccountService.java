package com.tw.dddtraining.domain.service;

import com.tw.dddtraining.domain.model.Account;
import com.tw.dddtraining.domain.repository.IAccountRepository;
import com.tw.dddtraining.service.exception.EmailAlreadyRegisteredException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    private IAccountRepository accountRepository;

    public void register(String email, String password) {
        Account account = accountRepository.findByEmail(email);
        if (account != null) {
            throw new EmailAlreadyRegisteredException();
        }
        account = new Account(email, password);
        accountRepository.save(account);
    }
}
