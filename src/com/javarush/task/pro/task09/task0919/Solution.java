package com.javarush.task.pro.task09.task0919;

/*
Разворот строки

Используя StringBuilder в методе reverseString(String), разверни строку, полученную как параметр.


*/

public class Solution {
    public static void main(String[] args) {
        String string = "Ходит кот задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        //напишите тут ваш код
        StringBuilder str = new StringBuilder(string);
        str = str.reverse();

        return str.toString();
    }
}