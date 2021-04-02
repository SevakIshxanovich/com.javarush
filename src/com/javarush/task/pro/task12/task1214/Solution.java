package com.javarush.task.pro.task12.task1214;

import java.util.ArrayList;
import java.util.Arrays;

/*
Останется только Java
В методе main удали ненужные языки программирования (все, кроме Java) из списка programmingLanguages.
Не забудь удалить JavaScript.


*/

public class Solution {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        programmingLanguages.removeIf(n -> (!n.equals("Java")));
        programmingLanguages.toString(System.out::println);
    }
}