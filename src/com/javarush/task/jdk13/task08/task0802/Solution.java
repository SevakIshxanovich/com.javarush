package com.javarush.task.jdk13.task08.task0802;

import java.util.HashMap;
import java.util.Map;

/*
Map из 10 пар

Создать коллекцию Map (реализация HashMap), занести туда 10 пар строк:

арбуз - ягода, банан - трава, вишня - ягода, груша - фрукт,
дыня - овощ, ежевика - куст, жень-шень - корень, земляника - ягода,
ирис - цветок, картофель - клубень.

Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка): картофель - клубень

*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();

        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");

        for (Map.Entry<String, String> getMap : map.entrySet()){
            System.out.println(getMap.getKey()+" - "+getMap.getValue());
        }
    }
}