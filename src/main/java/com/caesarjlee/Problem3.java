package com.caesarjlee;

public class Problem3{
    public String solve(String name, String tele, String add) {
        if(!tele.matches("\\d{11}"))
            return "手机号不符合要求";
        if(!add.matches("[a-zA-Z][a-zA-Z0-9]{0,9}"))
            return "地址不符合要求";
        return "OK";
    }
}