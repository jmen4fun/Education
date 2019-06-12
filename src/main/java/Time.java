import java.util.*;

public class Time {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int sec = in.nextInt();
        if (sec != 0) {
            int s1 = sec % 60;
            int s2 = sec / 60;
            int s3 = s2 % 60;
            s2 = s2 / 60;
            System.out.println(s2 + ":" + s3 + ":" + s1);
        }else {
            System.out.print("wtf?");
        }
    }
}
