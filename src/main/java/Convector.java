import java.util.Scanner;

public class Convector {

    public static void main(String... args) {

        double inches = 39.37;
        double kilometres = 1.30934;
        double pounds = 2.205;
        double kmTOmi = 1.609;

        System.out.println("Wellcome to Сonvector:");
        System.out.println("Select:\n 1. Meters to Inches\n 2. Miles to Kilometres\n " +
                "3. Kilograms to Pounds\n 4. Speed: km/hr to mi/hr\n 5. Celsius to Fahrenheit\n " +
                "6. Fahrenheit to Celsius\n 7. Celsius to Kelvin");

        int a = Integer.parseInt(new Scanner(System.in).nextLine());

        System.out.println("Enter value:");

        double b = Double.parseDouble(new Scanner(System.in).nextLine());
        double result = 0;

        switch (a){
            case(1):
                result = b * inches;
                break;

            case(2):
                result = b * kilometres;
                break;

            case(3):
                result = b * pounds;
                break;

            case(4):
                result = b / kmTOmi;
                break;

            case(5):
                result = (b * 9/5) + 32;
                break;

            case(6):
                result = (b - 32) * 5/9;
                break;

            case(7):
                result = b + 273.15;
                break;

                default:
                    System.out.println("Nice try");
        }
        System.out.println(result);
    }
}