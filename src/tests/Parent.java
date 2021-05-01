package tests;

public class Parent {
    public static String s = parents();
    public String ss = parents2();

    public static String parents() {
        System.out.println("Parents ЭТО STATIC String s Parents");
        System.out.println("Parents ЭТО Все еще STATIC String s Parents");
        System.out.println("Parents КОНЕЦ STATIC String s Parents");
        return "static String s Parents";
    }

    public String parents2() {
        System.out.println("Parents ЭТО STRING ss Parents");
        System.out.println("Parents ЭТО Все еще STRING ss Parents");
        System.out.println("Parents КОНЕЦ STRING ss Parents");
        return "String ss Parents";
    }

    public Parent() {
        System.out.println("Parents ЭТО CONSTRUCTOR Parents");
        System.out.println("Parents ЭТО Все еще CONSTRUCTOR Parents");
        System.out.println("Parents КОНЕЦ CONSTRUCTOR Parents");
    }
}
