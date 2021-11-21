package com.misiontic.account_ms.models;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Transaction {
    //Creacion de las variables del data to pesist

    @Id

    private String id;
    private String usernameOrigin;
    private String usernameDestinity;
    private Integer value;
    private String note;
    private Date date;

    //Creacion del contructor
    public Transaction(String id, String usernameOrigin, String usernameDestinity, Integer value, String note, Date date) {
        this.id = id;
        this.usernameOrigin = usernameOrigin;
        this.usernameDestinity = usernameDestinity;
        this.value = value;
        this.note = note;
        this.date = date;
    }

    // Creacion de getter y setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsernameOrigin() {
        return usernameOrigin;
    }

    public void setUsernameOrigin(String usernameOrigin) {
        this.usernameOrigin = usernameOrigin;
    }

    public String getUsernameDestinity() {
        return usernameDestinity;
    }

    public void setUsernameDestinity(String usernameDestinity) {
        this.usernameDestinity = usernameDestinity;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
