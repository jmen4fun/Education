package homeTask4;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int arr[] = {6, 2, 3, 4, 5};
        Arrays.sort(arr);
        for(int i = 0; i <  arr.length; i++){
            System.out.print(arr[i] + "  ");
        }
    }
}