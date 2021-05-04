package com.javarush.task.pro.task15.task1506;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/*
Пропускаем не всех
Напиши программу, которая считывает из консоли имя текстового файла,
далее читает символы из этого файла (используй метод readAllLines(Path) класса Files) и выводит на экран все,
за исключением точки, запятой и пробела.


*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
             var inputFile = Paths.get(reader.readLine());
            List<String> inString = Files.readAllLines(inputFile);
            String spl = ",| |\\.";
            for (String b : inString) {
                String[] split = b.split(spl);
               for (String s: split){
                   System.out.print(s);
               }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}