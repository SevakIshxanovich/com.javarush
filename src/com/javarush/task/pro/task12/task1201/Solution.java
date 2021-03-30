package com.javarush.task.pro.task12.task1201;

/*
Автоупаковка

В классе Solution представлены 8 переменных примитивных типов с именами вида типValue.
Для каждой из этих переменных необходимо создать объекты-обертки и присвоить им имена вида типValueBox.
Для создания объектов-оберток используй метод Тип.valueOf(примитив).

Пример переменной объекта-обертки: Integer integerValueBox = ....;

*/

public class Solution {
    static byte byteValue;
    short shortValue;
    int intValue;
    long longValue;

    float floatValue;
    double doubleValue;

    char charValue;
    boolean booleanValue;

        Byte byteValueBox = new Byte(byteValue);
        Short shortValueBox = new Short(shortValue);
        Integer integerValueBox = new Integer(intValue);
        Long longValueBox = new Long(longValue);

        Float floatValueBox = new Float(floatValue);
        Double doubleValueBox = new Double(doubleValue);

        Character characterValueBox = new Character(charValue);
        Boolean booleanValueBox = new Boolean(false);

    public static void main(String[] args) {

    }
}