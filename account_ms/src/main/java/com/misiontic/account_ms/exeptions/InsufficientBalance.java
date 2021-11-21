package com.misiontic.account_ms.exeptions;

public class InsufficientBalance extends RuntimeException{
    public InsufficientBalance(String message){
        super(message);
    }
}
