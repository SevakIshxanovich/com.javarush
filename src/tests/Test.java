package tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test{
    public static int[] max(int...a){
        int i[] = new int[2];
        for (int b:a) {
            if (b > 0) {
                i[0]++;
            } else {
                i[1]++;
            }
        }
            return i;

    }
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите каличество чисел которые надо проверить: ");
        int index = Integer.parseInt(reader.readLine());
        int mas[] = new int[index];

        for (int j=0; j<index; j++) {
            System.out.print("Введите " + (j+1) + "-e число: ");
            mas[j] = Integer.parseInt(reader.readLine());
        }

        System.out.println("Введено " + max(mas)[0] + " положительных числа \n" +
                           "Введено " + max(mas)[1] + " отрицателных числа");
    }
}