package homeTask3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        double a, b, c;
        double d;

        System.out.println("Введите a, b, c: ");
        Scanner num = new Scanner(System.in);
        a = num.nextDouble();
        b = num.nextDouble();
        c = num.nextDouble();
        d = b * b - 4 * a * c;
        if (d > 0){
            double x1, x2;
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        }else if (d == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        }
        else {
            System.out.println("Уравнение не имеет действительных корней!");
        }
    }
}
