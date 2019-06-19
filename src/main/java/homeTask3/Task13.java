package homeTask3;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        System.out.print("Enter the side 'A' of the triangle: ");
        double a = Double.parseDouble(new Scanner(System.in).nextLine());
        System.out.print("Enter the side 'B' of the triangle: ");
        double b = Double.parseDouble(new Scanner(System.in).nextLine());
        System.out.print("Enter the side 'C' of the triangle: ");
        double c = Double.parseDouble(new Scanner(System.in).nextLine());
        if (a == b || b == c || c == a){
            System.out.println("Sides are equal");
        }else {
            System.out.println("Sides aren't equal");
        }
    }
}
