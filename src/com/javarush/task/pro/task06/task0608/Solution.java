package com.javarush.task.pro.task06.task0608;

/*
Кубический калькулятор
Давай напишем реализацию калькулятора, который будет считать степени чисел.
Для этого создай метод cube(). В качестве аргумента он должен принимать целочисленное значение типа long.
Метод должен возводить полученное значение в третью степень и возвращать его как результат работы метода.
Числа, которыми придется оперировать, могут быть большими. Поэтому метод cube() должен возвращать тип long.

*/

public class Solution {
    public static void main(String[] args) {


    }

    //напишите тут ваш код
    public static long cube(long i) {
        i = i * i * i;
        return i;
    }
}