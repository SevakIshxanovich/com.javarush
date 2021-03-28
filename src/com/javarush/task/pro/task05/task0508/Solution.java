package com.javarush.task.pro.task05.task0508;

import java.util.Arrays;
import java.util.Scanner;

/*
Удаляем одинаковые строки
 Считать 10 строк и заполнить ими массив strings.
Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").
Примеры.

Массив после чтения строк:
{"Hello", "Hello", "World", "Java", "Tasks", "World"}

Массив после удаления повторяющихся строк:
{null, null, null, "Java", "Tasks", null}

Java
Java
Hello
Increment
Decrement
Hello
World
Integer
Double
Integer
Android
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        //напишите тут ваш код
        strings = new String[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }
        boolean b = false;
        for (int i = 0; i < strings.length; i++) {
            for (int j = i; j < strings.length - 1; j++) {
                if (strings[i] != null) {
                    if (strings[i].equals(strings[j + 1])) {
                        strings[j + 1] = null;
                        b = true;
                    }
                    if (j == strings.length - 2 && b) {
                        strings[i] = null;
                        b = false;
                    }
                }
            }
        }
        Arrays.stream(strings).forEach(System.out::println);
    }
}