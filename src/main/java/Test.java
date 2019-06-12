import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.print("Enter value: ");
        int sumOfBall = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.print("Enter value: ");
        int countOftest = Integer.parseInt(new Scanner(System.in).nextLine());
        double result;
        result = sumOfBall * 100. / countOftest;
        System.out.println(result + "%");
    }
}
