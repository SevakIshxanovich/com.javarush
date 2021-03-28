package com.javarush.task.pro.task10.task1003;

/*
Построим новый бизнес-комплекс JavaRush Business Center

Давай построим бизнес-центр, который состоит из двух зданий,
один из которых только начинаем строить, а второй — на этапе планирования,
поэтому о нем мало что известно.
Тебе нужно будет создать два конструктора: один с параметрами, второй — без.
Они оба должны инициализировать поля floorsCount и developer.
*/

public class Skyscraper extends var {
    private int floorsCount;
    private String developer;

    public Skyscraper(int floorsCount, String developer) {
        this.floorsCount = floorsCount;
        this.developer = developer;
    }

    public Skyscraper() {
        this.floorsCount = 5;
        this.developer = "JavaRushDevelopment";
    }

    public static void main(String[] args) {
        var skyscraper = new Skyscraper();
        var skyscraperUnknown = new Skyscraper(50, "Неизвестно");
    }
}
