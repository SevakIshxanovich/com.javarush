package tests;

import java.util.Objects;

public class Child extends Parent {
    public static String s = child();
    public String ss = child2();

    public static String child() {
        System.out.println("Child ЭТО STATIC String s Child");
        System.out.println("Child ЭТО Все еще STATIC String s Child");
        System.out.println("Child КОНЕЦ STATIC String s Child");
        return "static String s Child";
    }

    public String child2() {
        System.out.println("Child ЭТО STRING ss Child");
        System.out.println("Child ЭТО Все еще STRING ss Child");
        System.out.println("Child КОНЕЦ STRING ss Child");
        return "String ss Child";
    }

    public Child() {
        System.out.println("Child ЭТО CONSTRUCTOR Child");
        System.out.println("Child ЭТО Все еще CONSTRUCTOR Child");
        System.out.println("Child КОНЕЦ CONSTRUCTOR Child");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Hello I am GC, i working ");
    }
}
