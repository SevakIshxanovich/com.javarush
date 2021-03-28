package com.javarush.task.pro.task10.task1020;

// Попробуем собрать компьютер. У нас есть классы: системный блок, монитор, клавиатура, мышь.
// В классе компьютер в конструкторе создай объекты классов-составляющих компьютера.

public class Computer {
    public Computer() {
        Keyboard keyboard = new Keyboard();
        Monitor monitor = new Monitor();
        Mouse mouse = new Mouse();
        SystemUnit systemUnit = new SystemUnit();
    }
}