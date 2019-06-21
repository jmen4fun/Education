package homeTask4;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {1, 5, 0, 9, 66};
        int indexOfMin = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] < array[indexOfMin]) {
                indexOfMin = i;
            }
        }
        System.out.println(indexOfMin);
    }
}

