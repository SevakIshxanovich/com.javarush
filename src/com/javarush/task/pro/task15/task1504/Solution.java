package com.javarush.task.pro.task15.task1504;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/*
Перепутанные байты
Напиши программу, которая считывает с консоли путь к файлу1 и путь к файлу2.
Далее все байты из файла1 записывает в файл2, но при этом меняет их местами по такому принципу:
первый со вторым, третий с четвертым, и т.д.
Если последний байт в файле1 нечетный, то пишем его в файл2 как есть.
Для чтения и записи файлов используй методы newInputStream и newOutputStream класса Files.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        String inFile = "";
        String outFile = "";
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            inFile = bufferedReader.readLine();
            outFile = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (InputStream inputFile = Files.newInputStream(Path.of(inFile));
             OutputStream outputFile = Files.newOutputStream(Path.of(outFile))) {
            while (inputFile.available()>0){
                byte[] a = inputFile.readAllBytes();
                int length = 0;
                if (a.length%2==0){
                    length=a.length;
                }else{
                    length=a.length-1;
                }

                for (int i = 0; i <length-1; i++) {
                    outputFile.write(a[i+1]);
                    outputFile.write(a[i]);
                    i++;
                }
                if(length<a.length){
                    outputFile.write(a[length]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}