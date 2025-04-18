package com.caesarjlee;

public class Problem4{
    public String solve(String resource){
        if(resource.startsWith("ab"))
            return "替换前缀后的字符串为:" + resource.replaceFirst("^ab", "ef");
        else if(resource.endsWith("cd"))
            return "替换cd后的字符串为:" + resource.replaceAll("cd", "gh");
        return "大写字母的字符串为:" + resource.toUpperCase();
    }
}