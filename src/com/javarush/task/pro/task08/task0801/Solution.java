package com.javarush.task.pro.task08.task0801;

/*
Утильный класс: часть 1
Реализуй методы sin(double), cos(double), tan(double) которые возвращают синус,
косинус и тангенс угла соответственно, полученного как параметр. Угол задан в градусах.
В этом тебе помогут соответствующие методы класса Math, которые принимают параметром угол,
заданный в радианах.


*/

public class Solution {

    public static double sin(double a) {
        //напишите тут ваш код
        return Math.sin(Math.toRadians(a));
    }

    public static double cos(double a) {
        //напишите тут ваш код
        return Math.cos(Math.toRadians(a));
    }

    public static double tan(double a) {
        //напишите тут ваш код
        return Math.tan(Math.toRadians(a));
    }
}