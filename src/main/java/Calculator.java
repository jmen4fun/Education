import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

public class Calculator {

    public static void main(String[] args) {
        System.out.print("Enter your date of birth(dd.MM.yyyy): ");
        String d2 = new Scanner(System.in).nextLine();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date date1 = null;
        Date date2 = null;
        try{
            date1 = new Date();
            date2 = format.parse(d2);
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
        long difference = date1.getTime() - date2.getTime();
        long days =  difference / (24 * 60 * 60 * 1000);
        long old =  days / 365;
        System.out.println("Days = " + days);
        if(old == 30){
            System.out.println("Download track: " + "Сектор Газа - 30 лет");
        }else{
            System.out.println("Your age = " + old);
        }
        System.out.println("Keep Calm you Will Die Anyway");
    }
}