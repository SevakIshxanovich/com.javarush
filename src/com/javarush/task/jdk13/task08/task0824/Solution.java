package com.javarush.task.jdk13.task08.task0824;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Вся семья в сборе
У класса Human должны быть поля
имя (String),
пол (boolean),
возраст (int),
дети (ArrayList<Human>).

Создай объекты и заполни их так, чтобы получилось:
два дедушки,
две бабушки,
отец,
мать,
трое детей.

Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).




*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human boy1 = new Human("boy1",5,true);
        Human boy2 = new Human("boy2",6,true);
        Human girl = new Human("girl",7,false);
        Human father = new Human("Father", 35, true, boy1, boy2, girl);
        Human mather = new Human("Mather", 35, false, boy1, boy2, girl);
        Human fatherFather = new Human("FatherFather", 55, true, father);
        Human fatherMather = new Human("FatherMather", 55, false, father);
        Human matherFather = new Human("MatherFather", 65, true, mather);
        Human matherMather = new Human("MatherMather", 65, false, mather);
        System.out.println(fatherFather);
        System.out.println(fatherMather);
        System.out.println(matherFather);
        System.out.println(matherMather);
        System.out.println(father);
        System.out.println(mather);
        System.out.println(boy1);
        System.out.println(boy2);
        System.out.println(girl);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public  Human(String name, int age, boolean sex, Human...children){
            this.name=name;
            this.age=age;
            this.sex = sex;
            this.children = new ArrayList<Human>(Arrays.asList(children));
        }
                public  Human(String name, int age, boolean sex){
            this.name=name;
            this.age=age;
            this.sex = sex;
            this.children = new ArrayList<>();
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}