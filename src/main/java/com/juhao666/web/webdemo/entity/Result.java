package com.juhao666.web.webdemo.entity;


import com.juhao666.web.webdemo.enums.ResultCode;
import lombok.Data;
import org.springframework.lang.NonNull;

import java.io.Serializable;

@Data
public class Result implements Serializable {
//    private Integer code;
//    private String mes
    private Object data;

    private ResultCode resultCode;

    public Result(ResultCode resultCode, Object data) {
//        this.code = resultCode.code();
//        this.message = resultCode.messag();
        this.resultCode = resultCode;
        this.data = data;
    }

    public Result() {

    }

    public static Result success(){
        Result result = new Result();
        result.setResultCode(ResultCode.SUCCESS);
        return result;
    }

    public static Result success(Object data){
        Result result = new Result();
        result.setResultCode(ResultCode.SUCCESS);
        result.setData(data);
        return result;
    }

    public static Result fail(ResultCode resultCode){
        Result result = new Result();
        result.setResultCode(resultCode);
        return result;
    }

    public static Result fail(ResultCode resultCode, Object data){
        Result result = new Result();
        result.setResultCode(resultCode);
        result.setData(data);
        return result;
    }
}

