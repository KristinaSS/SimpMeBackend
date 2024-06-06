package com.simp.me.controller;

import com.simp.me.service.AccountService;
import org.openapitools.api.AccountApi;
import org.openapitools.model.CreateAccountDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController implements AccountApi {

    @Autowired
    private AccountService accountService;

    @Override
    public ResponseEntity<Void> createAccount(CreateAccountDTO createAccountDTO) {
        return ResponseEntity.ok(accountService.createAccount(createAccountDTO));
    }
}
