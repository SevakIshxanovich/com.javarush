package com.javarush.task.pro.task15.task1507;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

/*
Пропускаем не всех

Напиши программу, которая считывает из консоли имя текстового файла,
далее читает строки из этого файла (используй метод readAllLines(Path) класса Files)
и выводит их на экран через одну, начиная с первой.

*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            var fileInformation = Path.of(reader.readLine());
            List<String> information = Files.readAllLines(fileInformation);
            for (int i = 0, informationSize = information.size(); i < informationSize; i++) {
                System.out.println(information.get(i));
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}