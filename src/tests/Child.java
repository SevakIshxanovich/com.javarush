package tests;

import java.util.Objects;

public class Child extends Parent {
    public static String s = child();
    public String ss = child2();

    public static String child() {
        System.out.println("ЭТО static String s Child");
        return "static String s Child";
    }

    public String child2() {
        System.out.println("ЭТО String ss Child");
        return "String ss Child";
    }

    public Child() {
        System.out.println("ЭТО Constructor Child");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Hello I am GC, i working ");
    }
}
