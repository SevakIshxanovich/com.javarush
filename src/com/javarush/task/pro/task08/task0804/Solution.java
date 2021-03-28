package com.javarush.task.pro.task08.task0804;

/*
Randomizer

 В этой задаче тебе предстоит реализовать метод generateNumber(),
 который будет возвращать случайное число от 0 до 99.
В методе generateNumber() используй метод Math.random().
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(generateNumber());
    }

    public static int generateNumber() {

        //напишите тут ваш код
        return (int) (Math.random() * 100);
    }
}