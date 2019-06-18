package homeTask2;

import java.util.Scanner;

import static java.lang.Math.*;

public class MathExample {

    public static void main(String[] args) {
/*
        Math.abs()   // Returns the absolute value (module)
        Math.sin()   // Returns the trigonometric sine of an angle
        Math.asin()  // Returns the arc cosine of a value
        Math.cos()   // Returns the trigonometric cosine of an angle
        Math.acos()  // Returns the arc cosine of a value
        Math.tan()   // Returns the trigonometric tangent of an angle
        Math.atan()  // Returns the arc tangent of a value
        Math.PI      // PI number
        Math.E       // The base of the natural logarithms
        Math.sqrt()  // square root
        Math.cbrt()  // cube root
        Math.log()   // Returns the natural logarithm
        Math.log10() // Returns the base 10 logarithm
        Math.exp()   // Exponent
        Math.pow()   // Returns the value of the first argument raised to the power of the second argument
        if result NaN - / to zero !!!!!!
*/

        System.out.print("Enter x: ");
        float x9 = Float.parseFloat(new Scanner(System.in).nextLine());
        double result9 = Math.pow(1.1, x9) + Math.abs(Math.cos(Math.sqrt(PI * x9))) - (3.0 / 8.0);
        System.out.println(result9);

        System.out.print("Enter x: ");
        float x10 = Float.parseFloat(new Scanner(System.in).nextLine());
        double result10 = 1. / 3. * Math.sqrt(Math.abs(Math.sin(x10))) * Math.cbrt(Math.exp(0.12 * x10));
        System.out.println(result10);

        System.out.print("Enter x: ");
        float x11 = Float.parseFloat(new Scanner(System.in).nextLine());
        double result11 = 2 * Math.PI * x11 - Math.abs(Math.abs(10.5 * x11)) * 1 / (Math.cbrt(Math.pow(x11, 2)) + 1. / 7.);
        System.out.println(result11);

        System.out.print("Enter x: ");
        float x12 = Float.parseFloat(new Scanner(System.in).nextLine());
        double result12 = Math.log(Math.sqrt(Math.abs(2 - x12) + 1.2)) * 1 / (2 + Math.exp(-x12)) + Math.cbrt(2 / x12);
        System.out.println(result12);

        System.out.print("Enter x: ");
        float x13 = Float.parseFloat(new Scanner(System.in).nextLine());
        double result13 = Math.pow(Math.exp(-2 + x13), 1./5.) * 1 / (Math.sqrt(Math.pow(x13, 2) + Math.pow(x13, 4)) + Math.log(Math.abs(3 - 3.14)));
        System.out.println(result13);

        System.out.print("Enter x: ");
        float x14 = Float.parseFloat(new Scanner(System.in).nextLine());
        double result14 = (Math.sqrt(Math.pow(Math.sin(x14 / 2), 3)) + Math.cbrt(Math.exp(1.3 * x14) + Math.exp(-1.3 * x14))) * 1 / Math.abs(x14 + 2.5);
        System.out.println(result14);

        System.out.print("Enter x: ");
        float x15 = Float.parseFloat(new Scanner(System.in).nextLine());
        double result15 = (Math.abs(x15 * Math.log(x15) - 4) * Math.sqrt(x15)) * 1 / Math.pow(Math.exp(4 * x15 - 1), 1. / 5.);
        System.out.println(result15);

        System.out.print("Enter x: ");
        float x16 = Float.parseFloat(new Scanner(System.in).nextLine());
        double result16 =  Math.cbrt(Math.exp(2 * x16) * Math.sqrt(x16) - (x16 + 1. / 3.) / x16) * Math.abs(Math.cos(2.5 * x16));
        System.out.println(result16);

        System.out.print("Enter x: ");
        float x17 = Float.parseFloat(new Scanner(System.in).nextLine());
        double result17 =  Math.pow(x17, 3) / 3 - Math.exp(x17) * Math.log(Math.abs(Math.pow(1.3, 3) + Math.pow(x17, 3))) +  4. / 3.;
        System.out.println(result17);

        System.out.print("Enter x: ");
        float x18 = Float.parseFloat(new Scanner(System.in).nextLine());
        double result18 = Math.abs(7.2 - 10 * x18) / Math.cbrt(Math.pow(x18, 2) + Math.exp(x18)) * Math.atan(4 * (x18 / 3) / Math.sqrt(Math.pow(1.1, 3) + Math.pow(x18, 2)));
        System.out.println(result18);

        System.out.print("Enter x: ");
        float x19 = Float.parseFloat(new Scanner(System.in).nextLine());
        double result19 = Math.acos(Math.tan(5 * x19 / Math.PI)) + Math.pow(x19, 3.2) / 28;
        System.out.println(result19);

        System.out.print("Enter x: ");
        float x20 = Float.parseFloat(new Scanner(System.in).nextLine());
        double result20 = (Math.cbrt(Math.pow(Math.log(x20), 2)) + Math.tan(Math.cos(Math.PI * x20))) * Math.abs(Math.log(x20 / 10.5) + 1. / 3.);
        System.out.println(result20);

        System.out.print("Enter x: ");
        float x21 = Float.parseFloat(new Scanner(System.in).nextLine());
        double result21 = (Math.pow(Math.log10(x21), 1./4.) + Math.acos(x21 + 3) * 1 / Math.abs(x21 + 2 * Math.pow(x21, 2)));
        System.out.println(result21);

        System.out.print("Enter x: ");
        float x22 = Float.parseFloat(new Scanner(System.in).nextLine());
        double result22 = Math.asin(Math.log10(x22) / (Math.pow(x22, 2) + 5 * x22 + 1)) - Math.pow(x22, 3.2) / 28;
        System.out.println(result22);

        System.out.print("Enter x: ");
        float x23 = Float.parseFloat(new Scanner(System.in).nextLine());
        double result23 = Math.acos((int)(Math.tan(5 * x23 / Math.PI))) + Math.pow(x23, 5.7) / 23;
        System.out.println(result23);

        System.out.print("Enter x: ");
        float x24 = Float.parseFloat(new Scanner(System.in).nextLine());
        double result24 = Math.atan((int)Math.abs(8.3 - 21 * Math.pow(x24, 2) - 0.8 * x24) / Math.cbrt(Math.exp(2.5 * x24)));
        System.out.println(result24);

        System.out.print("Enter x: ");
        float x25 = Float.parseFloat(new Scanner(System.in).nextLine());
        double result25 = sqrt(sqrt(log10(acos((abs(pow(x25, 3.4) + 2.5 * pow(x25, 1.2)-0.7) / cbrt(pow(exp(2.5 * x25), x25))))))) + 1;
        System.out.println(result25);

        System.out.print("Enter x: ");
        float x26 = Float.parseFloat(new Scanner(System.in).nextLine());
        double result26 = Math.log(Math.abs(Math.sin(x26))) + 2 * Math.exp(x26) + 2 * Math.cos(Math.abs(x26)) + 2;
        System.out.println(result26);
    }
}
