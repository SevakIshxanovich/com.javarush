package com.javarush.task.pro.task05.task0506;

import java.util.Scanner;

/*
Минимальное из N чисел
Ввести с клавиатуры число N.
Считать N целых чисел и заполнить ими массив.
Найти минимальное число среди элементов массива и вывести в консоль.



*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] mas = new int[N];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = scanner.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < mas.length; i++) {
            if (min > mas[i]) {
                min = mas[i];
            }
        }
        System.out.println(min);
    }
}