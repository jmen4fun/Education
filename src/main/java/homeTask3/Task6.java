package homeTask3;

import java.util.Scanner;


public class Task6 {
    public static void main(String[] args) {
        System.out.println ("Давайте решим уравнение ax + b = 0, где x - неизвестное");
        Scanner a = new Scanner(System.in);
        System.out.print("Введите значение переменной а: ");
        double num1 = a.nextDouble();
        System.out.print("Введите значение переменной b: ");
        double num2 = a.nextDouble();
        int c = 0;

        if (num1 != 0 || num2 != 0){
            double x = (c - num2) / num1;
            System.out.print(num1);
            System.out.print(" x + ");
            System.out.print(num2);
            System.out.println(" = 0");
            System.out.print("x = ");
            System.out.println(x);
        } else {
            System.out.print("Значение 'a' не может быть равно 0, подставьте другое значение!");
        }

    }
}
