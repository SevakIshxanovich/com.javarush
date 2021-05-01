package com.javarush.task.jdk13.task12.task1205;

/*
А мне так нужно
Реализуй метод toCustomString,
чтобы он преобразовывал Number к String по определенному правилу в зависимости от типа:
- если аргумент является объектом Byte, то разделить его на 2 и преобразовать в строку, добавив в конце букву "b";
- если аргумент является объектом Integer, то разделить его на 3 и преобразовать в строку;
- если аргумент является объектом Double, то умножить его на 20 и преобразовать в строку;
- если аргумент не относится ни к одному из вышеперечисленных типов, то вернуть строку "Я такого типа числа не жду!".

Класс Number является родителем классов Byte, Double, Float, Integer, Long и Short.
Для определения типа используй оператор instanceof.



*/

public class Solution {

    private static String UNEXPECTED_TYPE = "Я такого типа числа не жду!";

    public static void main(String[] args) {
        System.out.println(toCustomString((byte) 12));
        System.out.println(toCustomString(12));
        System.out.println(toCustomString(12.));
        System.out.println(toCustomString(12L));
    }

    public static String toCustomString(Number number) {
        //напишите тут ваш код
        if (number instanceof Byte) {
            byte b = (byte) number;
            return (byte)(b/2) + "b";
        }
        else if (number instanceof Integer) {
            int b = (int) number;
            return b/3+"";
        }
        else if (number instanceof Double) {
            double b = (double) number;
            return (double)(b*20) + "";
        }

        return UNEXPECTED_TYPE;
    }
}