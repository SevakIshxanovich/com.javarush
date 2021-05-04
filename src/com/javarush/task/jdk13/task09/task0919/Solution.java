package com.javarush.task.jdk13.task09.task0919;

/*
Деление на ноль

Создай метод public static void divideByZero,
в котором подели любое целое число на ноль и выведи на экран результат деления.
Оберни вызов метода divideByZero в try..catch.
Выведи стек-трейс исключения, используя метод exception.printStackTrace().

*/

public class Solution {

    public  static void divideByZero(){
        System.out.println(1/0);
    }
    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}