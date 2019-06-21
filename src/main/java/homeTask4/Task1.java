package homeTask4;

public class Task1 {
    public static void main(String[] args){
        int a = 8;
        System.out.print("Binary 8 is : ");
        StringBuilder sb = new StringBuilder();
        do {
            sb.append(a % 2);
            a = a / 2;
        } while (a != 0);
        System.out.println(sb.reverse());
    }
}

