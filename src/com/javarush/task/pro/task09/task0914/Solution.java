package com.javarush.task.pro.task09.task0914;

/*
Обновление пути

Реализуй метод changePath(String, String) так, чтобы он заменял версию jdk в пути,
полученном первым параметром метода, на версию, полученную вторым параметром, и возвращал новый путь.
Версия jdk расположена между третьим и четвертым "/".

Пример:
путь — "/usr/java/jdk1.8/bin"
версия jdk — "jdk-13"

Метод changePath(путь, версия jdk) должен вернуть путь — "/usr/java/jdk-13/bin".
Метод main() не принимает участия в тестировании.
*/

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin";
        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        int i = path.indexOf('/');
        int i1 = path.indexOf('/', i + 1);
        int i2 = path.indexOf('/', i1 + 1);
        int i3 = path.indexOf('/', i2 + 1);
        String temp = path.substring(i2 + 1, i3);
        return "\"" + path.replaceFirst(temp, jdk) + "\"";
    }
}
