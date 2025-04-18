package com.caesarjlee;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ProblemTest3{
    @Test
    public void emptyTelephoneError(){
        Assertions.assertEquals(new Problem3().solve("Caesar", "", "beiking"), "手机号不符合要求");
    }

    @Test
    public void telephoneLengthError(){
        Assertions.assertEquals(new Problem3().solve("Caesar", "19890604", "beiking"), "手机号不符合要求");
    }

    @Test
    public void telephoneHasAlphabetError(){
        Assertions.assertEquals(new Problem3().solve("Caesar", "1989060400a", "beiking"), "手机号不符合要求");
    }

    @Test
    public void addressCaptionError(){
        Assertions.assertEquals(new Problem3().solve("Caesar", "19890604000", "1eiking"), "地址不符合要求");
    }

    @Test
    public void emptyAddressError(){
        Assertions.assertEquals(new Problem3().solve("Caesar", "19890604000", ""), "地址不符合要求");
    }

    @Test
    public void addressLengthError(){
        Assertions.assertEquals(new Problem3().solve("Caesar", "19890604000", "nationalTaiwanUniversity"), "地址不符合要求");
    }

    @Test
    public void addressHasSymbolError(){
        Assertions.assertEquals(new Problem3().solve("Caesar", "19890604000", "b!iking"), "地址不符合要求");
    }

    @Test
    public void wellDone(){
        Assertions.assertEquals(new Problem3().solve("Caesar", "19890604000", "la"), "OK");
    }
}