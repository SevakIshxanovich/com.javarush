package tests;

public class Parent {
    public static String s = parents();
    public String ss = parents2();

    public static String parents() {
        System.out.println("ЭТО static String s Parents");
        return "static String s Parents";
    }

    public String parents2() {
        System.out.println("ЭТО String ss Parents");
        return "String ss Parents";
    }

    public Parent() {
        System.out.println("ЭТО Constructor Parents");
    }
}
