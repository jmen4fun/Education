package homeTask6;

public class LowText {
    public static void main(String[] args) {
        String text = "Some text";
        System.out.println(text.toUpperCase());

        for (int i = 0; i < text.length(); i++) {
            if (text.substring(i, i + 1).equals(" "))
                continue;
            else if (i == 0) {
                String modifiedText = text.substring(i, i + 1).toUpperCase() + text.substring(i + 1);
                System.out.println(modifiedText);
            } else
                System.out.println(text.substring(0, i) + text.substring(i, i + 1).toUpperCase() + text.substring(i + 1));
        }
    }
}
