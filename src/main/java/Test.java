import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int sumOfBall = 150;
        int countOftest = 10;

        System.out.print("Enter value: ");
        int currentOfAnswer = Integer.parseInt(new Scanner(System.in).nextLine());
        double result;
        result = currentOfAnswer * 100 / countOftest;
        System.out.println(result + "%");
        result = currentOfAnswer * sumOfBall / countOftest;
        System.out.println(result + "%");
    }
}
