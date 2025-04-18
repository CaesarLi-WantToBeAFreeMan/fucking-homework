package com.caesarjlee;

public class Problem1{
    public String solve(int x, int y){
        int a = 2;
        if(x >= 90 || y >= 90)
            return "";
        if(!(x >= 80 && y >= 60))
            if(x <= 70 || y <= 70)
                a = 3;
            else
                a = 4;
        return "a=" + a;
    }
}