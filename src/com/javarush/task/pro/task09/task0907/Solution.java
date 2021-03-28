package com.javarush.task.pro.task09.task0907;

/*
Шестнадцатеричный конвертер

*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 16;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "f1";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        String s = "";
        if (decimalNumber <= 0) {
            return "";
        } else {
            while (true) {
                if ((decimalNumber % 16) > 9) {
                    switch (decimalNumber % 16) {
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
                    decimalNumber = decimalNumber / 16;
                }
                if ((decimalNumber % 16) >= 0 && (decimalNumber % 16) <= 9) {
                    s = (decimalNumber % 16) + s;
                    decimalNumber = decimalNumber / 16;
                }
                if ((decimalNumber / 16) == 0) {
                    if ((decimalNumber % 16) != 0) {
                        s = (decimalNumber % 16) + s;
                    }
                    break;
                }
            }
        }
        return s;
    }

    public static int toDecimal(String hexNumber) {
        int tenNum = 0;
        if (hexNumber == null || hexNumber.equals("")) {
            return tenNum;
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
        return tenNum;
    }
}