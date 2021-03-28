package com.javarush.task.pro.task07.task0705;

/*
Бесконечность не предел
В методе main вызови метод div() 2 раза. Первый раз — с такими аргументами,
чтобы вывод в консоли был "Infinity", а второй — "-Infinity".
Код метода div() изменять нельзя.

*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        div(0.0, 1.0);
        div(-0.0, 1.0);
    }

    public static void div(double a, double b) {
        System.out.println(b / a);
    }
}