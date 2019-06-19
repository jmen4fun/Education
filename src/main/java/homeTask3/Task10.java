package homeTask3;

public class Task10 {
    public static void main(String[] args) {
        double circle = 15;
        double square = 5;

        double c = Math.sqrt(square);
        double diameter = Math.sqrt(circle / Math.PI) * 2;
        if (c > diameter){
            System.out.println("Ep");
        }else {
            System.out.println("No");
        }
    }
}
