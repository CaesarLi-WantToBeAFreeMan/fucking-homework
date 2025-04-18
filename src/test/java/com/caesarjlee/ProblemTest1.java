package com.caesarjlee;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ProblemTest1{
    @Test
    public void test1(){
        Assertions.assertEquals(new Problem1().solve(91, 64), "");
    }

    @Test
    public void test2(){
        Assertions.assertEquals(new Problem1().solve(89, 64), "a=2");
    }

    @Test
    public void test3(){
        Assertions.assertEquals(new Problem1().solve(19, 89), "a=3");
    }

    @Test
    public void test4(){
        Assertions.assertEquals(new Problem1().solve(75, 89), "a=4");
    }
}