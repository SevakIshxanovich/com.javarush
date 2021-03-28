package com.javarush.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/*
StringTokenizer

Используя StringTokenizer раздели query на части по разделителю delimiter.
Пример:
getTokens("com.javarush.task.pro.task09.task0915", ".a")
возвращает массив строк
{"com", "j", "v", "rush", "t", "sk", "pro", "t", "sk09", "t", "sk0915"}
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "com.javarush.task.pro.task09.task0915";
        String[] tokens = getTokens(packagePath, ".a");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer st = new StringTokenizer(query, delimiter);
        String[] str = new String[st.countTokens()];
        if (st.hasMoreTokens()) {
            for (int i = 0; i < str.length; i++) {
                str[i] = st.nextToken();
            }
        }
        return str;
    }
}