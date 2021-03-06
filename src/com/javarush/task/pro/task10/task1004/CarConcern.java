package com.javarush.task.pro.task10.task1004;

/*
Жажда скорости

 Почувствуй себя автоконструктором и найди решение, как сделать так,
 чтобы завод снова заработал. Для этого тебе нужно добавить инициализацию полей в к
 онструкторах соответствующими параметрами. Если параметр отсутствует,
 то нужно инициализировать поле значением по умолчанию.
 Для поля year это текущий год (4321), для поля color — Оранжевый.*/

public class CarConcern {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public CarConcern(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;

    }

    public CarConcern(String model, int year) {
        //напишите тут ваш код
        this.model = model;
        this.year = year;
        this.color = "Оранжевый";
    }

    public CarConcern(String model) {
        this.model = model;
        this.year = 4321;
        this.color = "Оранжевый";
    }

    @Override
    public String toString() {
        return this.manufacturer + ", " + this.model + ", " + this.year + ", " + this.color;
    }
}