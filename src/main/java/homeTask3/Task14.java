package homeTask3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Enter a, b, c: ");
        Scanner num = new Scanner(System.in);
        a = num.nextInt();
        b = num.nextInt();
        c = num.nextInt();
        int[] result = {a, b, c};
        Arrays.sort(result);
        System.out.println("Value " + result[0] + " is first");
        System.out.println("Value " + result[1] + " is second");
        System.out.println("Value " + result[2] + " is second");
    }
}
