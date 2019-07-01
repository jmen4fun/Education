package homeTask2;

import java.util.Scanner;

public class Convector {

    public static final double INCHES = 39.37;
    public static final double KILOMETERS = 39.37;
    public static final double POUNDS = 39.37;
    public static final double KM_TO_MI = 39.37;
    public static final double KELVIN = 273.15;
    public static final double FAHRENHEIT_VALUE = 9f / 5;
    public static final double FAHRENHEIT_VALUE_2 = 32;
    public static final double FAHRENHEIT_VALUE_3 = 5f / 9;

    public static void main(String... args) {

        System.out.println("Wellcome to Сonvector:");
        System.out.println("Select:\n 1. Meters to Inches\n 2. Miles to Kilometres\n " +
                "3. Kilograms to Pounds\n 4. Speed: km/hr to mi/hr\n 5. Celsius to Fahrenheit\n " +
                "6. Fahrenheit to Celsius\n 7. Celsius to Kelvin");

        int convectorType = Integer.parseInt(new Scanner(System.in).nextLine());

        System.out.println("Enter value:");

        double value = Double.parseDouble(new Scanner(System.in).nextLine());
        double result = 0;

        switch (convectorType) {
            case (1):
                result = metersToinches(value);
                break;

            case (2):
                result = milesTokilometres(value);
                break;

            case (3):
                result = kilogramsTopounds(value);
                break;

            case (4):
                result = speeds(value);
                break;

            case (5):
                result = celsiusTofahrenheit(value);
                break;

            case (6):
                result = fahrenheitTocelsius(value);
                break;

            case (7):
                result = kelvins(value);
                break;

            default:
                System.out.println("Nice try");
        }
        System.out.println(result);

    }

    public static double metersToinches(double metr) {
        return metr * INCHES;
    }

    public static double milesTokilometres(double miles) {
        return miles * KILOMETERS;
    }

    public static double kilogramsTopounds(double pound) {
        return pound * POUNDS;
    }

    public static double speeds(double speed) {
        return speed * KM_TO_MI;
    }

    public static double celsiusTofahrenheit(double fahrent) {
        return (fahrent * FAHRENHEIT_VALUE) + FAHRENHEIT_VALUE_2;
    }

    public static double fahrenheitTocelsius(double celsius) {
        return (celsius - FAHRENHEIT_VALUE_2) * FAHRENHEIT_VALUE_3;
    }

    public static double kelvins(double kelvin) {
        return kelvin + KELVIN;
    }
}