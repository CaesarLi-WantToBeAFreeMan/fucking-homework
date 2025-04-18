package com.caesarjlee;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ProblemTest4{
    @Test
    public void prefixIsab(){
        Assertions.assertEquals(new Problem4().solve("absomething"), "替换前缀后的字符串为:efsomething");
    }

    @Test
    public void prefixIsNotabAndSuffixIscd(){
        Assertions.assertEquals(new Problem4().solve("somecdthingcd"), "替换cd后的字符串为:someghthinggh");
    }

    @Test
    public void wellDone(){
        Assertions.assertEquals(new Problem4().solve("someelse"), "大写字母的字符串为:SOMEELSE");
    }
}