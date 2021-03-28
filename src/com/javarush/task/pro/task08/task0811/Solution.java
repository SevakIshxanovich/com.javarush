package com.javarush.task.pro.task08.task0811;

/*
Побитовые операции
*/

public class Solution {

    public static void main(String[] args) {
        int x = 7;
        //   x = x & 25; // 1
        x = x & 5;  // 1
        //   x = x & 3;  // 1
        x = x & 12; // 0
        x = x | 1;  // 1
        System.out.println(x);
    }
}