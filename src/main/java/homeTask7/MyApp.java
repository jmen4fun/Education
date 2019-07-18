package homeTask7;

public class MyApp {
    public static void main(String[] args) {
        FractNumb fractNumb1 = new FractNumb(4,5);
        FractNumb fractNumb2 = new FractNumb(3,4);

        System.out.println(fractNumb1.sumFractionNumbers(fractNumb2));
        System.out.println(fractNumb1.minusFractionNumbers(fractNumb2));
        System.out.println(fractNumb1.multiplyFractionNumbers(fractNumb2));
        System.out.println(fractNumb1.devideFractionNumbers(fractNumb2));

        System.out.println(fractNumb1.toString());
        System.out.println(fractNumb2.toString());
    }
}
