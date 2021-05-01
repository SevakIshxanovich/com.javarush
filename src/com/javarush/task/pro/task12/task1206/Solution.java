package com.javarush.task.pro.task12.task1206;

/*
Анализ строк

Реализуй методы
countDigits(String),
countLetters(String),
countSpaces(String),
которые должны возвращать количество цифр, букв и пробелов в строке.
Метод main не принимает участия в проверке.

*/

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей. Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        char ch[] = string.toCharArray();
        int i = 0;
        for (char ch1: ch)
            if(Character.isDigit(ch1))
                i++;
        return i;
    }

    public static int countLetters(String string) {
        char ch[] = string.toCharArray();
        int i = 0;
        for (char ch1: ch)
            if(Character.isLetter(ch1))
                i++;
        return i;
    }

    public static int countSpaces(String string) {
        char ch[] = string.toCharArray();
        int i = 0;
        for (char ch1: ch)
            if(Character.isSpaceChar(ch1))
                i++;
        return i;
    }
}