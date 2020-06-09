package com.tw.dddtraining.domain.repository;

import com.tw.dddtraining.domain.model.Account;
import org.springframework.stereotype.Component;

@Component
public interface IAccountRepository {
    void save(Account account);
}
