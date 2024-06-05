package com.simp.me.controller;

import org.openapitools.api.AccountApi;
import org.openapitools.model.AccountDTO;
import org.openapitools.model.CreateAccountDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController implements AccountApi {

    @Override
    public ResponseEntity<Void> createAccount(CreateAccountDTO createAccountDTO) {
        return null;
    }
}
