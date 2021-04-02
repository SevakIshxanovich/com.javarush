package com.javarush.task.pro.task10.task1017;

/*
Создание материков
Как известно, на планете Земля есть 6 материков. Создай для каждого материка собственный класс.
В каждом классе должно быть поле, которое хранит площадь соответствующего материка.
Площадь материка нужно указывать при его создании, и она должна быть неизменяемой.
Ты можешь использовать любые числа для задания площади материков.

*/

public class Earth {
    public static void main(String[] args) {
        Africa africa = new Africa(30_370_000);
        Antarctica antarctica = new Antarctica(14_200_000);
        Australia australia = new Australia(8_600_000);
        Eurasia europa = new Eurasia(55_000_000);
        NorthAmerica northAmerica = new NorthAmerica(24_709_000);
        SouthAmerica southAmerica = new SouthAmerica(17_840_000);
    }
}