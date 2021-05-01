package com.javarush.task.jdk13.task07.task0716;

import java.util.ArrayList;
import java.util.Locale;

/*
Р или Л
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву "р"
2.2. удваивать все слова содержащие букву "л".
2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
2.4. с другими словами ничего не делать. Пример: роза лира лоза Выходные данные: лира лоза лоза


*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        ArrayList<String> strings1 = new ArrayList<>(strings);
        for (String s: strings1){
            int indexR = s.indexOf('р');
            int indexL = s.indexOf('л');
            if(indexL>-1 && indexR>-1){
                continue;
            }
            if (indexR>-1) {
                strings.remove(s);
            }
            if (indexL>-1) {
                strings.add(strings.indexOf(s), s);
            }
        }
        return strings;
    }
}