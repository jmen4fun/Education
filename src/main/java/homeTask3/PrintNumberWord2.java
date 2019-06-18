package homeTask3;

import java.util.Scanner;

public class PrintNumberWord2 {

    public static void main(String[] args) {
        System.out.print("Enter number: ");
        int num = Integer.parseInt(new Scanner(System.in).nextLine());

        if (num == 1){
            System.out.println("One");
        }else if (num == 2){
            System.out.println("Two");
        }else if (num == 3){
            System.out.println("Three");
        }else if (num == 4){
            System.out.println("Four");
        }else if (num == 5){
            System.out.println("Five");
        }else if (num == 6){
            System.out.println("Six");
        }else if (num == 7){
            System.out.println("Seven");
        }else if (num == 8){
            System.out.println("Eight");
        }else if (num == 9){
            System.out.println("Nine");
        }else if (num == 10){
            System.out.println("Ten");
        }else {
            System.out.println("Other");
        }

    }
}
