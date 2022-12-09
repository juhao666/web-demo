package com.juhao666.web.webdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@Controller
public class MyWebDemoController {

    //get request information, like request headers and client information.
    @GetMapping("/info")
    public void get(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String requestURL = request.getRequestURL().toString();
        response.setCharacterEncoding("UTF-8");
        response.setHeader("content-type", "text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.write("The client information as below:");
        out.write("<hr/>");
        out.write("request URL is :" + requestURL);
        out.write("<br/>");

        //------------------------------------------------------------------------------//
        out.write("<br/>");
        out.write("<br/>");
        //------------------------------------------------------------------------------//

        out.write("The request header information as below::");
        out.write("<hr/>");
        Enumeration<String> headers = request.getHeaderNames();
        while (headers.hasMoreElements()) {
            String name = (String) headers.nextElement();
            String value = request.getHeader(name);
            out.write(name + ":" + value);
            out.write("<br/>");
        }
        //return "I'm juhao666!!!";

    }
}
