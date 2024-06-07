package com.simp.me.service;


import com.simp.me.models.Account;
import com.simp.me.repository.AccountRepository;
import org.openapitools.model.CreateAccountDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

import static com.simp.me.mapper.AccountMapper.ACCOUNT_MAPPER;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Void createAccount(CreateAccountDTO createAccountDTO) {
        Account account = ACCOUNT_MAPPER.mapToModel(createAccountDTO);
        account.setActive(true);

        accountRepository.save(account);

        return null;
    }

    public Account getAccountById(UUID id){
        return accountRepository.getReferenceById(id);
    }
}
