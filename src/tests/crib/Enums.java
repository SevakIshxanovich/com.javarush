package tests.crib;

public enum Enums {

    /*

    Выглядит объявление нового enum типа данных так:
--------------
enum ИмяТипа
{
   ЗНАЧЕНИЕ1,
   ЗНАЧЕНИЕ2,
   ЗНАЧЕНИЕ3
}
----------------------------------------------------
enum Color {
    RED, GREEN, BLUE
}
----
 К Enum можно применять методы:

name()          возвращает имя
    System.out.println(Color.RED.name()); //output: RED
ordinal()       возвращает порядковый номер
    System.out.println(Color.RED.ordinal()); //output: 0
equals()        метод equals() сравнивает значения перечислений по ссылкам. Почему? Потому,
                что значения в перечислениях являются константными (уникальными),
                существует всего один экземпляр цвета RED, один цвета GREEN и один BLUE,
                значит ссылка на этот экземпляр будет всего одна, значит их можно сравнивать с помощью ==.
                Вы можете сами убедиться в этом, написав Color.RED == Color.RED или Color.GREEN == COLOR.BLUE;
    boolean isEqualToItself = Color.RED.equals(Color.RED);
    boolean isEqualToDifferentColor = Color.RED.equals(Color.GREEN);

    System.out.println(isEqualToItself); //output: true
    System.out.println(isEqualToDifferentColor);//output: false

hashCode()      метод hashCode() использует стандартную реализацию из класса Object.
    int hashOfRed = Color.RED.hashCode();
    int hashOfGreen = Color.GREEN.hashCode();

    System.out.println(hashOfRed); //output would be different every time: 366712642
    System.out.println(hashOfGreen); //output would be different every time: 1829164700

toString()      метод toString() возвращает имя значения перечисления. Назвали значение WHITE,
                это же значение и получим при вызове toString() или name();
    String red = Color.RED.toString();
    System.out.println(red); //output: RED
values()        позволяет получить массив всех значений Enum
    Color[] colors = Color.values();
    System.out.println(Arrays.toString(colors)); //output: [RED, GREEN, BLUE]

valueOf()       позволяет получить значения перечисления по его строковому представлению
    System.out.println(Color.valueOf("RED").ordinal()); //output: 0
    Color.valueOf("BLACK"); //output: java.lang.IllegalArgumentException: No enum constant Color.BLACK

finalize()      метод finalize() пустой, а это значит, что не нужно закрывать "ресурсы" перед сборщиком мусора.
                Мы говорим о тех "ресурсах", которые используются в try-with-resources.
                Да и вообще метод finalize() пережиток прошлых лет и в Java 9 данный метод уже помечен
                как @Deprecated (устаревший метод, который уберут в последующих реализациях);

clone()         метод clone() мы можем вызвать только внутри самого перечисления т.к.
                он помечен ключевым словом protected. Но даже если мы попытаемся сделать это,
                то ничего мы не получим, кроме CloneNotSupportedException.
                Нужно это для того чтобы нельзя было создать несколько экземпляров одного и того же перечисления.
                Ведь в реальной жизни у нас нет двух цифр "1", значений скорости света, так и с перечислениями.

enumConstantDirectory()     возвращает Map, где ключ - строковое значение перечисления,
                            а значение - реальное значение перечисления;


2. Enum реализовывает интерфейс Comparable

3. Enum реализовывает интерфейс Serializable
------------------------------------------------------
Код	                    Примечание

enum Day             Новый тип Day

{
   MONDAY,          Понедельник
   TUESDAY,         Вторник
   WEDNESDAY,       Среда
   THURSDAY,        Четверг
   FRIDAY,          Пятница
   SATURDAY,        Суббота
   SUNDAY           Воскресенье
}
----------------------------------------------------------
Присваивать значения переменным этого типа можно таким образом:

        Day day = Day.MONDAY;

Пример:
        Код	                      Примечание

Day day = Day.FRIDAY;           На экран будет выведено:
System.out.println(day);        FRIDAY
--------------------------------------------------------------


     */
}
