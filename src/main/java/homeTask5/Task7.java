package homeTask5;

import java.util.Random;

public class Task7 {

public static void main(String[] args) {
    System.out.println(generateRandomChars("help", 4));
}

    public static String generateRandomChars(String candidateChars, int length) {
        StringBuilder help = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            help.append(candidateChars.charAt(random.nextInt(candidateChars.length())));
        }
        return help.toString();
    }

}

