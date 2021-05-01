package com.javarush.task.jdk13.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Три массива
1.Введи с клавиатуры 20 чисел, сохрани их в список numbers и рассортируй по трём другим спискам:
- число нацело делится на 3 (x%3==0) - попадает в список divBy3,
- нацело делится на 2 (x%2==0) - попадает в divBy2,
- и все остальные - попадают в others,
- нацело делится на 3 и на 2 одновременно, например 6 - попадает и в divBy3 и в divBy2.
Статические переменные списков уже созданны и инициализированы.
2. Метод printList() должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList() выведи экран: сначала список divBy3, потом divBy2, потом others.
*/

public class Solution {

    public static ArrayList<Integer> numbers = new ArrayList<>();
    public static ArrayList<Integer> divBy3 = new ArrayList<>();
    public static ArrayList<Integer> divBy2 = new ArrayList<>();
    public static ArrayList<Integer> others = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            numbers.add(Integer.parseInt(bufferedReader.readLine()));
        }
        for (int i: numbers){
            if (i%3==0) {
                divBy3.add(i);
            }
            if (i%2==0) {
                divBy2.add(i);
            }
            if (i%3!=0 && i%2!=0) {
                others.add(i);
            }
        }
        printList(divBy3);
        printList(divBy2);
        printList(others);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (int i:list) {
            System.out.println(i);
        }
    }
}