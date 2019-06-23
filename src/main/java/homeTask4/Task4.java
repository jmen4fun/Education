package homeTask4;

public class Task4 {
    public static void main(String[] args) {
        int min = 0;
        int max = 360;
        for(int step = 0; step < 2 * Math.PI; step += Math.PI / 18.){
            System.out.println(Math.sin(step));
        }
    }
}
