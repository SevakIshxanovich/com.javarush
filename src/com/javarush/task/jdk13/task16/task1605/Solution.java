package com.javarush.task.jdk13.task16.task1605;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
Пробрасываем исключения
Есть четыре не статических метода method1(), method2(), method3(), method4().
Используя ключевое слово throws, сделай так, чтобы method1() и method2() пробрасывали любые проверяемые исключения,
а method3() и method4() — не проверяемые.


*/

public class Solution {

    public void method1() throws Exception{

    }
    public void method2() throws Exception{

    }
    public void method3() throws  RuntimeException{

    }
    public void method4() throws RuntimeException{

    }
}