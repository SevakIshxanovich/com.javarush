package com.javarush.task.pro.task09.task0908;

import java.util.regex.Pattern;

/*
Двоично-шестнадцатеричный конвертер
*/

public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        int tenNum = 0;
        String s = "";
        if (binaryNumber == null || binaryNumber.isEmpty() || !Pattern.matches("[0-1]+", binaryNumber)) {
            return "";
        } else {
            char[] ch = binaryNumber.toCharArray();
            for (int i = ch.length - 1, j = 0; i >= 0; i--, j++) {
                s = ch[i] + "";
                tenNum = (int) (tenNum + (Integer.parseInt(s) * Math.pow(2, j)));
            }
        }
        s = "";
        String ss = Integer.toString(tenNum);
        while (true) {
            if ((tenNum % 16) > 9) {
                switch (tenNum % 16) {
                    case 10:
                        s = "A" + s;
                        break;
                    case 11:
                        s = "B" + s;
                        break;
                    case 12:
                        s = "C" + s;
                        break;
                    case 13:
                        s = "D" + s;
                        break;
                    case 14:
                        s = "E" + s;
                        break;
                    case 15:
                        s = "F" + s;
                        break;
                }
                tenNum = tenNum / 16;
            }
            if ((tenNum % 16) >= 0 && (tenNum % 16) <= 9) {
                s = (tenNum % 16) + s;
                tenNum = tenNum / 16;
            }
            if ((tenNum / 16) == 0) {
                if ((tenNum % 16) != 0) {
                    s = (tenNum % 16) + s;
                }
                break;
            }
        }
        return s;
    }


    public static String toBinary(String hexNumber) {
        int tenNum = 0;
        if (hexNumber == null || hexNumber.isEmpty()) {
            return "";
        } else {
            char[] ch = hexNumber.toCharArray();
            for (int i = ch.length - 1, j = 0; i >= 0; i--, j++) {
                String s = ch[i] + "";
                if (s.equalsIgnoreCase("a")) {
                    tenNum = (int) (tenNum + (10 * Math.pow(16, j)));
                } else if (s.equalsIgnoreCase("b")) {
                    tenNum = (int) (tenNum + (11 * Math.pow(16, j)));
                } else if (s.equalsIgnoreCase("c")) {
                    tenNum = (int) (tenNum + (12 * Math.pow(16, j)));
                } else if (s.equalsIgnoreCase("d")) {
                    tenNum = (int) (tenNum + (13 * Math.pow(16, j)));
                } else if (s.equalsIgnoreCase("e")) {
                    tenNum = (int) (tenNum + (14 * Math.pow(16, j)));
                } else if (s.equalsIgnoreCase("f")) {
                    tenNum = (int) (tenNum + (15 * Math.pow(16, j)));
                } else {
                    tenNum = (int) (tenNum + (Integer.parseInt(s) * Math.pow(16, j)));
                }
            }
        }
        String s = "";
        if (tenNum <= 0) {
            return "";
        } else {
            while (true) {
                s = (tenNum % 2) + s;
                tenNum = tenNum / 2;
                if (tenNum / 2 == 0) {
                    s = (tenNum % 2) + s;
                    break;
                }
            }
        }
        return s; //Integer.toString(tenNum);
    }
}