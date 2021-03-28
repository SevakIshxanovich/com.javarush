package com.javarush.task.pro.task05.task0503;

import java.util.Arrays;

/*
Работаем с элементами массива
Реализуй метод main(String[]), который меняет знак элемента массива array на противоположный,
если значение этого элемента чётное.
*/

public class Solution {

    public static int[] array = new int[]{1, 2, 3, -4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = array[i] - array[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}