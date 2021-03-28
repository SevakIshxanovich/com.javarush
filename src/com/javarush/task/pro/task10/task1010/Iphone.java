package com.javarush.task.pro.task10.task1010;

import java.util.Objects;

/*
Два айфона

В методе main создаются два айфона с одинаковыми параметрами.
В консоли выводится результат их сравнения. Разберись, почему сейчас результат отрицательный и сделай так,
чтобы он был положительным. Для этого тебе нужно переопределить метод equals(Iphone),
который будет учитывать все параметры.
У двух равных объектов значения полей должны быть одинаковыми. Метод main не участвует в проверке.

*/

public class Iphone extends var {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    //напишите тут ваш код

    public static void main(String[] args) {
        var iphone1 = new Iphone("X", "Black", 999);
        var iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Iphone iphone = (Iphone) o;
        return price == iphone.price && model.equals(iphone.model) && color.equals(iphone.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, price);
    }
}