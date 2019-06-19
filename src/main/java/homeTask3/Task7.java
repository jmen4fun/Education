package homeTask3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        System.out.print("Enter value 'a': ");
        int a = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.print("Enter value 'b': ");
        int b = Integer.parseInt(new Scanner(System.in).nextLine());

        if (Math.abs(a) > Math.abs(b)){
            System.out.println("Value " + a + " is more than " + b);
        }else {
            System.out.println("Value " + b + " is more than " + a);
        }
    }
}
