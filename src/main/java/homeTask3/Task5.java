package homeTask3;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        System.out.print("Enter number x: ");
        int x = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.print("Enter number b: ");
        int b = Integer.parseInt(new Scanner(System.in).nextLine());

        if (x > b){
            System.out.println("The number " + x + " has the greatest value");
        }else {
            System.out.println("The number " + b + " has the greatest value");
        }
    }
}
