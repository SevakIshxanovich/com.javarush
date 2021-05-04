package com.javarush.task.jdk13.task09.task0920;

/*
Обратный отсчет от 5 до 0
В цикле идет обратный отсчет от 5 до 0. Добавь задержку, используя Thread.sleep(100);.
Оберни вызов sleep в try..catch.

*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 5; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //напишите тут ваш код
        }
    }
}