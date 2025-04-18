# Author: Caesar James LEE (CJL)

# Date: April 18, 2025

# PS

* I programmed using `JUnit5`, `Maven` and `JetBrains IntelliJ Idea`

# Project Address

[GitHub]()

---

# Problems

## Problem1

### Method Code

```java
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
```

### Test Code

```java
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
```

### Test Screenshot

![problem1 test screenshot](photos/problem1%20test%20screenshot.png)

## Problem2

### Method Code

```java
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
```

### Test Code

```java
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
```

### Test Screenshot

![problem2 test screenshot](photos/problem2%20test%20screenshot.png)

## Problem3

### Method Code

```java
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
```

### Test Code

```java
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
```

### Test Screenshot

![problem3 test screenshot](photos/problem3%20test%20screenshot.png)

## Problem4

### Method Code

```java
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
```

### Test Code

```java
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
```

### Test Screenshot

![problem4 test screenshot](photos/problem4%20test%20screenshot.png)