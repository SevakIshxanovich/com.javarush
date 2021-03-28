package com.javarush.task.pro.task05.task0511;

import java.util.Arrays;
import java.util.Scanner;

/*
Создаем двухмерный массив

Двумерный массив — это массив массивов, то есть в каждой его ячейке находится ссылка на некий массив.
Но гораздо проще его представить в виде таблицы, у которой задано количество строк (первое измерение) и
количество столбцов (второе измерение). В этой задаче мы будем создавать такой массив.

Для этого реализуй метод main(String[]), который:
Считывает из консоли число N — количество строк массива. Число должно быть больше 0.
Потом считывает N чисел из консоли (любые числа больше 0).
Затем инициализирует двумерный массив multiArray:
количеством строк N;
строки — массивами, размер которых соответствует числам, введенным в п.2 (в порядке ввода).
Пример:

Введено число 5.
Введены числа 1, 7, 5, 9, 3.

Получаем такой массив:
[]
[][][][][][][]
[][][][][]
[][][][][][][][][]
[][][]

*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        multiArray = new int[scanner.nextInt()][];
        for (int i = 0; i < multiArray.length; i++) {
            multiArray[i] = new int[scanner.nextInt()];
        }
        for (int[] result1 : multiArray) {
            System.out.println(Arrays.toString(result1));
        }
    }
}