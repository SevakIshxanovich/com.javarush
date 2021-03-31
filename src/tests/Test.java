package tests;


import java.lang.management.GarbageCollectorMXBean;
import java.util.*;
import java.io.*;

public class Test {

    public static void main(String[] args) {



        Child child = new Child();
        child = null;
        System.gc();

    }
}

/*

 */