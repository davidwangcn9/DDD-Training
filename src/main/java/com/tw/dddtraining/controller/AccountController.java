package com.tw.dddtraining.controller;

import com.tw.dddtraining.dto.AccountDTO;
import com.tw.dddtraining.service.AccountApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/accounts")
public class AccountController {
    @Autowired
    private AccountApplicationService accountApplicationService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public void register(@RequestBody AccountDTO accountDTO) {
        accountApplicationService.register(accountDTO);
    }
}
