package homeTask5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Enter your text: ");
        Scanner text = new Scanner(System.in);
        String str = text.nextLine();
        System.out.println("Total: " + countWord(str));
    }
    public static int countWord(String string){
        String[] stringArr = string.split(" ");
        int count = 0;
        for (String s:stringArr){
            if (!s.equals("")){
                count++;
            }
        }
        return count;
    }
}
