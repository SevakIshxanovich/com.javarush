package com.javarush.task.jdk13.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
Удалить всех людей, родившихся летом

В словарь (Map<String, Date>) занести десять записей по принципу:
«фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.




*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Ван Дам", dateFormat.parse("AUGUST 1 2012"));
        map.put("Гибсон", dateFormat.parse("JULY 1 2012"));
        map.put("Ламберт", dateFormat.parse("JUNE 1 2012"));
        map.put("Ли", dateFormat.parse("SEPTEMBER 1 2012"));
        map.put("Лундгрен", dateFormat.parse("AUGUST 1 2012"));
        map.put("Сигал", dateFormat.parse("JULY 1 2012"));
        map.put("Уиллис", dateFormat.parse("MAY 1 2012"));
        map.put("Чан", dateFormat.parse("SEPTEMBER 1 2012"));
        map.put("Шварцнеггер", dateFormat.parse("AUGUST 1 2012"));

        return map;
    }

    //   JUNE   JULY   AUGUST
    public static void removeAllSummerPeople(Map<String, Date> map) {

        map.values().removeIf(date -> date.getMonth() == 5 || date.getMonth() == 6 || date.getMonth() == 7);
    }

    public static void main(String[] args) throws ParseException {

//        Map<String,Date> map = createMap();
//        for(Map.Entry<String ,Date> mp : map.entrySet()){
//            System.out.println(mp.getValue());
//        }

//        removeAllSummerPeople(map);
//        System.out.println();

//        for(Map.Entry<String ,Date> mp : map.entrySet()){
//            System.out.println(mp.getValue());
//        }

    }
}