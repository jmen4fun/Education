package homeTask6;

public class LettRemove {
    public static void main(String[] args) {
        String someText = "text";
        char symbol = 'a';
        String result = "";
        int index = 0;
        for (int i = 0; i < someText.length(); i++) {
            if (someText.charAt(i) == symbol) {
                result += someText.substring(index, i );
                index = i+1;
            }
        }
        System.out.println(result);
    }
}
