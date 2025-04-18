package com.caesarjlee;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ProblemTest2{
    @Test
    public void centurialYearFebruary(){
        Assertions.assertEquals(new Problem2().solve(2000, 2), "2000年2月份的天数是29天");
    }

    @Test
    public void dividableBy4AndNotDividableBy100February(){
        Assertions.assertEquals(new Problem2().solve(2020, 2), "2020年2月份的天数是29天");
    }

    @Test
    public void dividableBy4AndDividableBy100February(){
        Assertions.assertEquals(new Problem2().solve(1900, 2), "1900年2月份的天数是28天");
    }

    @Test
    public void notDividableBy4February(){
        Assertions.assertEquals(new Problem2().solve(2025, 2), "2025年2月份的天数是28天");
    }

    @Test
    public void notFebruary(){
        Assertions.assertEquals(new Problem2().solve(1989, 6), "1989年6月份的天数是30天");
    }
}