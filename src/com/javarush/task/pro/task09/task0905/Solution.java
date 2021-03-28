package com.javarush.task.pro.task09.task0905;

/*
Восьмеричный конвертер

Публичный статический метод toOctal(int) должен переводить целое число,
полученное в качестве входящего параметра, из десятичной системы счисления в восьмеричную.
А публичный статический метод toDecimal(int) наоборот — из восьмеричной в десятичную.
Методы работают только с положительными числами. Если входящий параметр меньше или равен 0,
методы возвращают 0.
Твоя задача — реализовать эти методы.

Метод main() не принимает участие в тестировании.

Подсказка: чтобы возвести число в степень, можно использовать метод Math.pow(число, степень).
восьмеричное следующий:
i равно 0
while(десятичное число не равно 0) {
восьмеричное число = восьмеричное число + (остаток от деления десятичного числа на 8) * на 10 в степени i
десятичное число = десятичное число / 8
i увеличиваем на 1
}


*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        int i = 0;
        int eighth = 0;
        while (decimalNumber != 0) {
            eighth = (int) (eighth + (decimalNumber % 8) * Math.pow(10, i));
            decimalNumber = decimalNumber / 8;
            i++;
        }

 /*
        String s = "";
        if(decimalNumber<=0){
            return  0;
        }else {
            while (true) {
                s = (decimalNumber%8)+s ;
                decimalNumber = decimalNumber/8;
                if(decimalNumber/8==0){
                    s = "0"+ (decimalNumber%8)+s;
                    break;
                }
            }
        }
        int eighthNum=Integer.parseInt(s);


  */
        return eighth;//eighthNum;
    }

    public static int toDecimal(int octalNumber) {
        //напишите тут ваш код
        int tenNum = 0;
        if (octalNumber <= 0) {
            return 0;
        } else {
            for (int i = 1, j = 0; octalNumber / i > 0; i = i * 10) {
                tenNum = (int) (tenNum + ((octalNumber / i % 10) * Math.pow(8, j)));
                j++;
            }
        }
        return tenNum;

    }
}