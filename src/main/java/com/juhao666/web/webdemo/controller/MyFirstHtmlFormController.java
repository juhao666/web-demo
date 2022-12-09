package com.juhao666.web.webdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.MessageFormat;
import java.util.Map;

@Controller
public class MyFirstHtmlFormController {

    public static final String UTF_8 = "UTF-8";

    @GetMapping("/addHtmlForm")
    public String sendForm() {
        return "addHtmlForm";
    }

    //第一种回显的方法
//    @PostMapping("/addHtmlForm")
//    public void processForm(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        request.setCharacterEncoding(UTF_8);
//
//        //text
//        String userID = request.getParameter("userid");
//        String username = request.getParameter("username");
//        String password = request.getParameter("userpass");
//        //radio
//        String sex = request.getParameter("sex");
//        //select
//        String dept = request.getParameter("dept");
//        //checkbox
//        String[] interests = request.getParameterValues("inst");
//        //textarea
//        String note = request.getParameter("note");
//        //hiddenField
//        String hiddenField = request.getParameter("hiddenField");
//
//        String interestStr = "";
//        for (int i = 0; (null != interestStr && i < interests.length); i++) {
//            if (i == interests.length - 1)
//                interestStr += interests[i];
//            else
//                interestStr += interests[i] + ",";
//        }
//
//        String htmlStr = "<table>" +
//                "<tr><td>填写的编号：</td><td>{0}</td></tr>" +
//                "<tr><td>填写的用户名：</td><td>{1}</td></tr>" +
//                "<tr><td>填写的密码：</td><td>{2}</td></tr>" +
//                "<tr><td>选中的性别：</td><td>{3}</td></tr>" +
//                "<tr><td>选中的部门：</td><td>{4}</td></tr>" +
//                "<tr><td>选中的兴趣：</td><td>{5}</td></tr>" +
//                "<tr><td>填写的说明：</td><td>{6}</td></tr>" +
//                "<tr><td>隐藏域的内容：</td><td>{7}</td></tr>" +
//                "</table>";
//        htmlStr = MessageFormat.format(htmlStr, userID, username, password, sex, dept, interestStr, note, hiddenField);
//
//        response.setCharacterEncoding(UTF_8);
//        response.setContentType("text/html;charset=UTF-8");
//        response.getWriter().write(htmlStr);//输出htmlStr里面的内容到客户端浏览器显示
//        //return "showHtmlForm";
//    }


    //第二种回显的方法
    @PostMapping("/addHtmlForm")
    public String processForm(HttpServletRequest request, Map<String, Object> response) throws IOException {
        request.setCharacterEncoding(UTF_8);

        //text
        String userID = request.getParameter("userid");
        String username = request.getParameter("username");
        String password = request.getParameter("userpass");
        //radio
        String sex = request.getParameter("sex");
        //select
        String dept = request.getParameter("dept");
        //checkbox
        String[] interests = request.getParameterValues("inst");
        //textarea
        String note = request.getParameter("note");
        //hiddenField
        String hiddenField = request.getParameter("hiddenField");

        StringBuilder interest = new StringBuilder();
        for (int i = 0; (null  != interests && i < interests.length); i++) {
            if (i == interests.length - 1)
                interest.append(interests[i]);
            else
                interest.append(interests[i]).append(",");
        }
        response.put("userID", userID);
        response.put("username", username);
        response.put("password", password);
        response.put("sex", sex);
        response.put("dept", dept);
        response.put("interestStr", interest.toString());
        response.put("note", note);
        response.put("hiddenField", hiddenField);

        return "showHtmlForm";
    }
}