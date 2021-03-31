package com.javarush.task.pro.task12.task1205;

/*              
Метод деления     

Реализуй метод divide(double a, double b) так, чтобы в консоли выводился результат деления числа a на число b.
Должно выводиться следующее значение:
-----
Double.POSITIVE_INFINITY, если верен любой из следующих пунктов:

a положительное и b равно 0;//
a равно Double.POSITIVE_INFINITY  и b >= 0 и b не равно Double.POSITIVE_INFINITY//
a равно Double.NEGATIVE_INFINITY и b < 0 и b не равно Double.NEGATIVE_INFINITY;//
-----
Double.NEGATIVE_INFINITY, если верен любой из следующих пунктов:

a отрицательное и b равно 0;//
a равно Double.NEGATIVE_INFINITY и b >= 0 и b не равно Double.POSITIVE_INFINITY;//
a равно Double.POSITIVE_INFINITY и b < 0 и b не равно Double.NEGATIVE_INFINITY;//
------
Double.NaN, если верен любой из следующих пунктов:

a равно 0 и b равно 0;//
хотя бы один из операндов равен Double.NaN;//
a равно Double.POSITIVE_INFINITY и b равно Double.POSITIVE_INFINITY;
a равно Double.POSITIVE_INFINITY и b равно Double.NEGATIVE_INFINITY;
a равно Double.NEGATIVE_INFINITY и b равно Double.POSITIVE_INFINITY;
a равно Double.NEGATIVE_INFINITY и b равно Double.NEGATIVE_INFINITY;

-----
Иначе выводить результат деления a на b.

 
*/

public class Solution {

    public static void main(String[] args) {
        divide(1, 0);
        divide(-1, 0);
        divide(0, 0);
        divide(100, 20);
        divide(200, 20);
    }

    public static void divide(double a, double b) {
        /*
        Double dA = a;
        Double dB = b;
        Double positiveInfinity = Double.POSITIVE_INFINITY;
        Double negativeInfinity = Double.NEGATIVE_INFINITY;
        if (a > 0 && b==0 ||
                dA.equals(positiveInfinity) && b>=0 && !dB.equals(positiveInfinity) ||
                    dA.equals(negativeInfinity) && b<0  && dB.equals(negativeInfinity)) {
                        System.out.println(Double.POSITIVE_INFINITY);
        }
        else if (a < 0 && b==0 ||
                    dA.equals(negativeInfinity) && b>=0 && !dB.equals(positiveInfinity) ||
                        dA.equals(positiveInfinity) && b<0 && !dB.equals(negativeInfinity)) {
                            System.out.println(Double.NEGATIVE_INFINITY);
        }
        else if (a == 0 && b==0 ||
                    dA.equals(Double.NaN) || dB.equals(Double.NaN) ||
                        dA.equals(positiveInfinity) && dB.equals(positiveInfinity) ||
                            dA.equals(positiveInfinity) && dB.equals(negativeInfinity) ||
                                dA.equals(negativeInfinity) && dB.equals(positiveInfinity) ||
                                    dA.equals(negativeInfinity) && dB.equals(negativeInfinity)) {
                                        System.out.println(Double.NaN);
        }
        else{
            System.out.println(a/b);
        }
*/
        System.out.println(a/b);
    }
}