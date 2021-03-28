package com.javarush.task.pro.task10.task1002;


/*
Построим новый жилой комплекс JavaRush Towers

Давай построим жилой комплекс из трех высоток.
Для этого мы будем использовать три разных способа вывода информации:

Объявляет о результате постройки.
Объявляет о результате и указывает количество этажей.
Объявляет о результате и указывает застройщика.

Пример вывода:
Небоскреб построен
Небоскреб построен. Количество этажей - 50
Небоскреб построен. Застройщик - JavaRushDevelopment

Для решения задания тебе нужно объявить три разных конструктора и в них выводить текст.
Метод main не участвует в тестировании.



*/

public class Skyscraper extends var {
    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";

    //напишите тут ваш код

    public Skyscraper() {
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }

    public Skyscraper(int i) {
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + i);
    }

    public Skyscraper(String s) {
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + s);
    }

    public static void main(String[] args) {
        var skyscraper = new Skyscraper();
        var skyscraperTower = new Skyscraper(50);
        var skyscraperSkyline = new Skyscraper("JavaRushDevelopment");
    }
}