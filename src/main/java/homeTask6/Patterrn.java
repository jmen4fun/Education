package homeTask6;

public class Patterrn {
    public static void main(String[] args) {
        String word= "Shut Fuck Up";
        char[] charArray = new char[word.length()];

        for (int k = 0; k < word.length(); k++) {
            char temp = word.charAt(0);
            for (int i = 0; i < word.length()-1; i++) {
                charArray[i] = word.charAt(i + 1);
            }
            charArray[word.length()-1]= temp;
            word =  new String(charArray);
            System.out.println(word);
        }

    }
}
