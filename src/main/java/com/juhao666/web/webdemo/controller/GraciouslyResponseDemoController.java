package com.juhao666.web.webdemo.controller;

import com.juhao666.web.webdemo.annotations.ResponseResult;
import com.juhao666.web.webdemo.entity.Result;
import com.juhao666.web.webdemo.enums.ResultCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@Slf4j
@RestController
@RequestMapping("/grace")
@ResponseResult
public class GraciouslyResponseDemoController {

    @GetMapping("{id}")
    public Object getResult(@PathVariable("id") Integer id) {
        log.info(String.format("id is %s", id));
        if (id == 0)
            return Result.fail(ResultCode.PARAMETER_IS_INVALID);
        HashMap<Object, Object> o = new HashMap<>();
        o.put("id", id);
        o.put("clazz", "GraciouslyResponseDemoController");
        return o;
        //return Result.success(o);
    }
}
