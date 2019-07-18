package homeTask6;

import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        char character = 'a';
        String someText = new Scanner(System.in).nextLine();
        int count = 0;

        for(int i = 0; i < someText.length(); i++){
            if (someText.charAt(i) == character)
                count++;
        }

        System.out.println(count);
    }
}
