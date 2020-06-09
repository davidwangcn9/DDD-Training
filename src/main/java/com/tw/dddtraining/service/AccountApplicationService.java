package com.tw.dddtraining.service;

import com.tw.dddtraining.domain.model.Account;
import com.tw.dddtraining.domain.repository.IAccountRepository;
import com.tw.dddtraining.domain.service.AccountService;
import com.tw.dddtraining.dto.AccountDTO;
import com.tw.dddtraining.service.exception.EmailAlreadyRegisteredException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountApplicationService {
    @Autowired
    private AccountService accountService;

    public void register(AccountDTO accountDTO){
        accountService.register(accountDTO.getEmail(), accountDTO.getPassword());
    }
}
