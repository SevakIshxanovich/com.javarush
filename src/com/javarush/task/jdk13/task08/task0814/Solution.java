package com.javarush.task.jdk13.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Больше 10? Вы нам не подходите

 Создать множество чисел(Set), занести туда 20 различных чисел.
 Удалить из множества все числа больше 10.
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> ints = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            ints.add(i);
        }
        return ints;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        set.removeIf(i -> i > 10);

    }

    public static void main(String[] args) {
//        Set<Integer> set = createSet();
//removeAllNumbersGreaterThan10(set);
//        for (int i:set ) {
//            System.out.println(i);
//        }

    }
}