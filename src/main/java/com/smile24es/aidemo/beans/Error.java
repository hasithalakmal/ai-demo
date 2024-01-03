package com.smile24es.aidemo.beans;

import java.io.Serializable;

public class Error implements Serializable {

    private String cod;
    private String message;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
