package com.javarush.task.jdk13.task09.task0923;


import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:

Первая строка содержит только гласные буквы из введённой строки.
Вторая — только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.Пример вывода:а а ы а а у М м м л р м .
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        String a = "";
        String b = "";
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))){
                a = a + s.charAt(i)+" ";
            }else{
                if (s.charAt(i) != ' ')
                b = b + s.charAt(i)+" ";
            }
        }
            System.out.print(a);
        System.out.println();
            System.out.print(b);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}