package com.misiontic.account_ms.exeptions;

public class AccountNotFound extends RuntimeException{
    public AccountNotFound(String message){
        super(message);
    }
}
