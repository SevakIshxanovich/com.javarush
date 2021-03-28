package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/*
Reverse

Считывает с консоли число N (в тестах оно всегда будет положительным).
Потом считывает N чисел с консоли.
Если N чётное — вывести введенные числа в обратном порядке, иначе — вывести в том же порядке.
Каждое число выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] mas = new int[N];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = scanner.nextInt();
        }
        for (int i = 0; i < mas.length; i++) {
            if (N % 2 == 0) {
                System.out.println(mas[mas.length - 1 - i]);
            } else {
                System.out.println(mas[i]);
            }
        }

    }
}