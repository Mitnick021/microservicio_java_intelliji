package com.misiontic.account_ms.controllers;

import com.misiontic.account_ms.exeptions.AccountNotFound;
import com.misiontic.account_ms.models.Account;
import com.misiontic.account_ms.repositories.AccountRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {
    private final AccountRepository accountRepository;

    public AccountController(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    @GetMapping("/accounts/{username}")

    Account getAccount(@PathVariable String username){
        return  accountRepository.findById(username)
                .orElseThrow(() -> new AccountNotFound(
                        "No se encontro la cuenta" + "asociada al usuario"
                ));
    }
}
