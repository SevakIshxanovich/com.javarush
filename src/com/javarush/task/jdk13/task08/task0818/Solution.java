package com.javarush.task.jdk13.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Налоговая и зарплаты
Создать словарь (Map) и занести в него десять записей по принципу:
«фамилия» - «зарплата».
Удалить из словаря всех людей, у которых зарплата ниже 500.



*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        map.put("Ван Дам", 200);
        map.put("Гибсон", 2000);
        map.put("Ламберт", 300);
        map.put("Лундгрен", 500);
        map.put("Сигал", 530);
        map.put("Ли", 550);
        map.put("Сталлоне", 600);
        map.put("Уиллис", 700);
        map.put("Чан", 725);
        map.put("Шварцнеггер", 850);

        return  map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        map.values().removeIf(integer -> integer < 500);
    }

    public static void main(String[] args) {

    }
}