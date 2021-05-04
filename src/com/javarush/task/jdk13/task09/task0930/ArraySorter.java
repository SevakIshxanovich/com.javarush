package com.javarush.task.jdk13.task09.task0930;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraySorter {

    public void sort(String[] array) {
        //напишите тут ваш код
        ArrayList<Integer> ints = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        for (String s : array) {
            if (isNumber(s)) {
                ints.add(Integer.parseInt(s));
            } else {
                strings.add(s);
            }
        }

        for (int i = 0; i < strings.size(); i++) {
            for (int j = 0; j < strings.size(); j++) {
                if (!isGreaterThan(strings.get(i),strings.get(j))){
                    String s = strings.get(i);
                    strings.set(i,strings.get(j));
                    strings.set(j, s);
                }
            }
        }

        Collections.sort(ints);
        Collections.reverse(ints);
        int intIndex =0;
        int stringIndex=0;

        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])){
                array[i] = ints.get(intIndex) + "";
                intIndex++;
            }else{
                array[i]= strings.get(stringIndex);
                stringIndex++;
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public boolean isNumber(String text) {
        if (text.length() == 0) {
            return false;
        }

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];
            if ((i != 0 && character == '-') // Строка содержит '-'
                    || (!Character.isDigit(character) && character != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && character == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}