package homeTask3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        double a = Double.parseDouble(new Scanner(System.in).nextLine());
        if (a > 1000){
            a = a * (100 - 15) / 100;
            System.out.println(a);
        }else {
            System.out.println("Get out fucking loser");
        }
    }
}
