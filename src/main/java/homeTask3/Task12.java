package homeTask3;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        System.out.print("Enter: ");
        double a = Double.parseDouble(new Scanner(System.in).nextLine());
        if (a >= -5 && a <= 3){
            System.out.println("Number belongs to the interval");
        }else {
            System.out.println("Number doesn't belongs to the interval");
        }
    }
}
