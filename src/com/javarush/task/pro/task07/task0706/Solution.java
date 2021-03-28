package com.javarush.task.pro.task07.task0706;

/*
Странное деление

В методе main вызови метод div() с таким аргументам, чтобы вывод в консоли был "NaN".
Код метода div() изменять нельзя.

*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        div(0.0, 0.0);
    }

    public static void div(double a, double b) {
        System.out.println(b / a);
    }
}