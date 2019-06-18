package homeTask3;

import java.util.Scanner;

public class CheckPassFail {

    public static void main(String[] args) {

        System.out.print("Enter value variable: ");
        int mark = Integer.parseInt(new Scanner(System.in).nextLine());

        if (mark >= 50){
            System.out.println("Done");
            System.out.println("Pass");
        }else {
            System.out.println("Done");
            System.out.println("Fail");
        }

    }

}
