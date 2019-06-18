package homeTask3;

import java.util.Scanner;

public class CheckOddEven {

    public static void main(String[] args) {

        System.out.println("Enter value: ");
        int num = Integer.parseInt(new Scanner(System.in).nextLine());

        if( num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
