package homeTask3;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        int a, b, c;

        System.out.println("Enter a, b, c: ");
        Scanner num = new Scanner(System.in);
        a = num.nextInt();
        b = num.nextInt();
        c = num.nextInt();

        if (b > a && a > c || c > a && a > b){
            System.out.println("Value " + a + " is first");
        }else if (a > b && b > c || c > b && b > a){
            System.out.println("Value " + b + " is second");
        }else if (a > c && c > b || b > c && c > a){
            System.out.println("Value " + c + " is third");
        }else if (a == b || a == c || b == c) {
            System.out.println("Numbers are the same");
        }
    }
}
