package homeTask3;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Enter value a: ");
        double a = Double.parseDouble(new Scanner(System.in).nextLine());
        System.out.println("Enter value b: ");
        double b = Double.parseDouble(new Scanner(System.in).nextLine());
        if (a % b == 0){
            System.out.println("b divider of а");
        }else {
            System.out.println("б isn't divider of а");
        }
    }
}
