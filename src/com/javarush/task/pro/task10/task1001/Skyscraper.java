package com.javarush.task.pro.task10.task1001;

/*
Создадим небоскреб

 Попробуем сконструировать свой первый небоскреб и объявить о результате выполнения в консоли.
 Для этого тебе нужно вызвать конструктор класса Skyscraper в методе main и в теле конструктора
 вывести в консоль текст "Небоскреб построен.".
*/

public class Skyscraper {

    public Skyscraper() {
        System.out.println("Небоскреб построен.");
    }

    public static void main(String[] args) {
        Skyscraper sk = new Skyscraper();
    }
}