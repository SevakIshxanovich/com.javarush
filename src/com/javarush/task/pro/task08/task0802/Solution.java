package com.javarush.task.pro.task08.task0802;

/*
Утильный класс: часть 2
Исправь методы класса Solution, используя класс Math:

sqrt(double) — должен возвращать квадратный корень переданного аргумента.

cbrt(double) — должен возвращать кубический корень переданного аргумента.

pow(int, int) — должен возвращать значение первого аргумента, возведенного в степень второго аргумента.




*/

public class Solution {

    public static double sqrt(double a) {
        return Math.sqrt(a);
    }

    public static double cbrt(double a) {
        return Math.cbrt(a);
    }

    public static double pow(int number, int power) {
/*        int result = number;
        if(power == 0) {
            return 1;
        }
        for(int i = 1; i < power; i++) {
            result *= number;
        }
        return power < 0 ? 1d / result : result;
 */
        return Math.pow(number, power);
    }
}