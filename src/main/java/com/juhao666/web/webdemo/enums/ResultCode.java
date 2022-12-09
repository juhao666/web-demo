package com.juhao666.web.webdemo.enums;

public enum ResultCode {

    SUCCESS(1,"success"),
    PARAMETER_IS_INVALID(1001,"parameter is invalid");

    private Integer code;
    private String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer code(){
        return this.code;
    }
    public String messag(){
        return this.message;
    }

}
