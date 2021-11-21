package com.misiontic.account_ms.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@ResponseBody
public class InsuffecentBalanceAdvice {
    @ResponseBody
    @ExceptionHandler(InsufficientBalance.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    String InsuffecentBalanceAdvice(AccountNotFound ex) {
        return ex.getMessage();
    }
}
