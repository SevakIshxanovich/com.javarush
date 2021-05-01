package tests;

import tests.crib.Strings.Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test{

    public static void main(String[] args) throws IOException {
            System.out.println("Метод Main успешно запущен");
            m1();
            System.out.println("Метод Main заканчивает свою работу");
        }

        static void m1() {
            try {
                System.out.println("Первый метод передаёт привет!(m1)");
                m2( );
            }
            catch (ArithmeticException err) {
                System.out.println(err.getMessage());
            }
            System.out.println("Первый метод завершил работу!(m1)");

        }

        static void m2() {
            System.out.println("Второй метод передаёт привет!(m2)");
            int x = 10;
            int y = 0;
            double z = x / y;
            System.out.println( z );
            System.out.println("Method Two - m2");
            System.out.println("Второй метод завершил работу!(m2)");

    }
}