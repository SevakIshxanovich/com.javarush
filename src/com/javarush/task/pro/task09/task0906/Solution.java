package com.javarush.task.pro.task09.task0906;

/*
Двоичный конвертер

Публичный статический метод toBinary(int) должен переводить целое число,
полученное в качестве входящего параметра, из десятичной системы счисления в
 двоичную и возвращать его строковое представление.

 А публичный статический метод toDecimal(String) наоборот —
 из строкового представления двоичного числа в десятичное число.
Методы работают только с положительными числами и не пустыми строками.

Если входящий параметр меньше или равен 0, метод toBinary(int) возвращает пустую строку.
Если входящий параметр — пустая строка или null, то метод toDecimal(String) возвращает 0.
Твоя задача — реализовать эти методы.

Один из алгоритмов перевода десятичного числа в представление двоичного числа следующий:

*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        String s = "";
        if (decimalNumber <= 0) {
            return "";
        } else {
            while (true) {
                s = (decimalNumber % 2) + s;
                decimalNumber = decimalNumber / 2;
                if (decimalNumber / 2 == 0) {
                    s = (decimalNumber % 2) + s;
                    break;
                }
            }
        }
        return s;
    }

    public static int toDecimal(String binaryNumber) {
        int tenNum = 0;
        if (binaryNumber == null || binaryNumber.equals("")) {
            return tenNum;
        } else {
            char[] ch = binaryNumber.toCharArray();
            for (int i = ch.length - 1, j = 0; i >= 0; i--, j++) {
                String s = ch[i] + "";
                tenNum = (int) (tenNum + (Integer.parseInt(s) * Math.pow(2, j)));
            }
        }
        return tenNum;
    }
}