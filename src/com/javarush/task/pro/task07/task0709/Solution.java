package com.javarush.task.pro.task07.task0709;

/*
Очень правильные типы
 Расставь операторы приведения типов
 в выражениях таким образом, чтобы код
компилировался.
Изменять типы переменных a, b, c и d нельзя.
*/

public class Solution {
    long a = 109 + 15;
    int b = (int) (a * 2);
    short c = (short) (a / b);
    byte d = (byte) (a + b - c);
}