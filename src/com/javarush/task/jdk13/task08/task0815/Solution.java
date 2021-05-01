package com.javarush.task.jdk13.task08.task0815;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Одинаковые имя и фамилия
Создать словарь (Map) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.

*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Арнольд", "Шварцнеггер");
        map.put("Брюс", "Уиллис");
        map.put("Жан-Клод", "Ван Дам");
        map.put("Мэл", "Гибсон");
        map.put("Дже́ки", "Чан");
        map.put("Дольф", "Лундгрен");
        map.put("Кристофер", "Ламберт");
        map.put("Сильвестр", "Сталлоне");
        map.put("Стивен", "Ли");
        map.put("Джет", "Ли");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int i = 0;

        for(Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(name))
                i++;
        }
        return i;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int i = 0;
        for(Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().equals(lastName))
                i++;
        }
        return i;
    }

    public static void main(String[] args) {

        Map<String, String> map = createMap();

        System.out.println(getCountTheSameFirstName(createMap(), "Ли"));
    }
}