package com.javarush.task.jdk13.task08.task0817;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Удалить людей, имеющих одинаковые имена  

Создать словарь (Map) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
 
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Арнольд", "Шварцнеггер");
        map.put("Брюс", "Уиллис");
        map.put("Жан-Клод", "Ван Дам");
        map.put("Мэл", "Гибсон");
        map.put("Дже́ки", "Ли");
        map.put("Дольф", "Лундгрен");
        map.put("Кристофер", "Ламберт");
        map.put("Сильвестр", "Сталлоне");
        map.put("Стивен", "Ли");
        map.put("Джет", "Ли");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String,String>temp = new HashMap<>(map);
        for (Map.Entry<String,String> entry1: temp.entrySet()){
            for (Map.Entry<String,String> entry2: temp.entrySet()){
                if (entry1.getValue().equals(entry2.getValue())){
                    if (!entry1.getKey().equals(entry2.getKey())){
                        removeItemFromMapByValue(map,entry2.getValue());
                    }
                }
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

        Map<String,String> map = createMap();
        for (Map.Entry<String,String> m:map.entrySet()) {
            System.out.print(m.getValue()+", ");
        }
        System.out.println();
        removeTheFirstNameDuplicates(map);
        for (Map.Entry<String,String> m:map.entrySet()) {
            System.out.print(m.getValue()+", ");
        }

    }
}