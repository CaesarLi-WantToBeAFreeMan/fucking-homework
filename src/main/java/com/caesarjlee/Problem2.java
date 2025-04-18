package com.caesarjlee;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem2{
    public String solve(int year, int month){
        if(month < 1 || month > 12)
            return "月份输入不正确";
        ArrayList <Integer> dayOfMonth = new ArrayList<>(Arrays.asList(
                31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        ));
        int day = 0;
        if(month != 2)
            day = dayOfMonth.get(month - 1);
        else{
            day = dayOfMonth.get(1);
            if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                day++;
        }
        return year + "年" + month + "月份的天数是" + day + "天";
    }
}