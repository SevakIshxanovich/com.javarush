package com.javarush.task.jdk13.task07.task0724;

/*
Семья
Создай класс Human с полями
имя(String),
пол(boolean),
возраст(int),
отец(Human),
мать(Human).
Создай объекты и заполни их так, чтобы получилось:
Два дедушки,
две бабушки,
отец,
мать,
трое детей.
Вывести объекты на экран.
Примечание: Если написать свой метод String toString() в классе Human,
то именно он будет использоваться при выводе объекта на экран.
Пример вывода:

Имя: Аня,
пол: женский,
возраст: 21,
отец: Павел,
мать: Катя

Имя: Катя,
пол: женский,
возраст: 55

Имя: Игорь,
пол: мужской,
возраст: 2,
отец: Михаил,
мать: Аня …

*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human fatherFather = new Human("Дедушка1", true, 61 );
        Human matherFather = new Human("Дедушка2", true, 62 );
        Human fatherMather = new Human("Бабушка1", false, 51 );
        Human matherMather = new Human("Бабушка2", false, 52 );
        Human father = new Human("Отец",true,31,fatherFather,fatherMather);
        Human mather = new Human("Мать",false,21,matherFather, matherMather);
        Human sun1 = new Human("Сын1", true, 1, father,mather);
        Human sun2 = new Human("Сын2", true, 3, father,mather);
        Human doter1 = new Human("Доч1", false, 5, father,mather);
        System.out.println(sun1);
        System.out.println(sun2);
        System.out.println(doter1);
        System.out.println(father);
        System.out.println(mather);
        System.out.println(fatherFather);
        System.out.println(fatherMather);
        System.out.println(matherFather);
        System.out.println(matherMather);
    }

    public static class Human {

        String name="";
        boolean sex = false;
        int age = 0;
        Human father = null;
        Human mother = null;

        Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
         Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}