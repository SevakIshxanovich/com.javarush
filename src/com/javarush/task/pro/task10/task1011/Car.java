package com.javarush.task.pro.task10.task1011;

import java.util.Objects;

/*
Создаем свой hashCode

Напиши свою реализацию hashCode, используя переменные model и year.
Если эти поля у двух объектов одинаковые, то должен возвращаться одинаковый hashCode.
Если правильно реализовать метод hashCode, вывод должен быть таким:

true
true
true
true
false
false

*/

public class Car extends var {
    private String model;
    private int year;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && model.equals(car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    //напишите тут ваш код

    public static void main(String[] args) {
        var lamborghini = new Car("Lamborghini", 2020);
        var lamborghini1 = new Car("Lamborghini", 2020);
        var ferrari = new Car("Ferrari", 2020);
        var ferrari1 = new Car("Ferrari", 2020);
        var bugatti = new Car("Bugatti", 2020);
        var bugatti1 = new Car("Bugatti", 2020);
        System.out.println(ferrari.hashCode() == ferrari.hashCode());
        System.out.println(lamborghini.hashCode() == lamborghini1.hashCode());
        System.out.println(ferrari.hashCode() == ferrari1.hashCode());
        System.out.println(bugatti.hashCode() == bugatti1.hashCode());
        System.out.println(bugatti.hashCode() == lamborghini.hashCode());
        System.out.println(lamborghini.hashCode() == ferrari.hashCode());
    }
}