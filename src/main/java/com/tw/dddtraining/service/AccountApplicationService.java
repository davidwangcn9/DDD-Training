package com.tw.dddtraining.service;

import com.tw.dddtraining.domain.model.Account;
import com.tw.dddtraining.domain.repository.IAccountRepository;
import com.tw.dddtraining.dto.AccountDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountApplicationService {
    @Autowired
    private IAccountRepository accountRepository;

    public void register(AccountDTO accountDTO){
        Account account = new Account(accountDTO.getEmail(), accountDTO.getPassword());
        accountRepository.save(account);
    }
}
