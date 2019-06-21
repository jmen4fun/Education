package homeTask4;

public class Task10 {
    public static void main(String[] args){
        System.out.print("ASCII символы и коды:\n № символ OCT  HEX\n");
        for (int i = 135; i < 256; i++) {
            char ch = (char) i;
            String tempOct = Integer.toOctalString(i);
            String tempHex = Integer.toHexString(i);
            System.out.printf("%03d %3s %5s %4s%n", i, ch, tempOct, tempHex);
        }
    }
}
