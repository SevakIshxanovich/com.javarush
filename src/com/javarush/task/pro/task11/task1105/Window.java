package com.javarush.task.pro.task11.task1105;

/*
Оконные работы

В классе Window есть метод changeSize, который должен менять размеры окна на значения, переданные в метод.
Но если ты запустишь программу, то убедишься, что этот метод не работает. Тебе нужно исправить ошибки так, чтобы метод заработал.

*/

public class Window {
    private int height = 2;
    private int width = 3;

    public void changeSize(int height, int width){
        height = height;
        width = width;
        int i = 0;
    }

    public void printSize(){
        System.out.println("Height = " + height);
        System.out.println("Width = " + width);
    }
}