package com.javarush.task.pro.task05.task0502;

/*
Четные и нечетные ячейки массива
В методе main(String[]) тебе нужно заполнить массив strings значениями. Если индекс массива чётный — присвоить значение "Чётный" (ноль — цифра чётная), иначе присвоить "Нечётный".
Вывод текста в консоль в тестировании не участвует.

*/

public class Solution {
    public static final String ODD = "Нечётный";
    public static final String EVEN = "Чётный";
    public static String[] strings = new String[20];

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < strings.length; i++) {
            if (i % 2 == 0) {
                strings[i] = EVEN;
            } else {
                strings[i] = ODD;
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print("index = " + i);
            System.out.println(" value = " + strings[i]);
        }
    }
}