package com.javarush.task.pro.task08.task0809;

/**
 * Counter
 * <p>
 * В классе Solution реализуй метод printNumbers(),
 * который выводит числа от 1 до 10 включительно с паузой между выводом каждого числа — 1,3 миллисекунды.
 * В этом тебе поможет метод sleep(long, int) класса Thread.
 */
public class Solution {

    public static void main(String[] args) throws InterruptedException {
        printNumbers();
    }

    public static void printNumbers() throws InterruptedException {
        //напишите тут ваш код
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
            if (i < 10) {
                Thread.sleep(1, 300000);
            }
        }
    }
}