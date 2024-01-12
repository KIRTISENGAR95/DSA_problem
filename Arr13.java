import java.util.Arrays;
public class Arr13
{




    public static void main(String[] args) {
        Integer[] array1 = { 1, 2, 3, 4, 5 };
        Integer[] array2 = { 4, 5, 6, 7, 8 };
        Integer[] mergedArray = new Integer[array1.length + array2.length];
        int i = 0;
        for (int element : array1) {
            mergedArray[i] = element;
            i++;
        }
        for (int element : array2) {
            mergedArray[i] = element;
            i++;
        }
        System.out.println("Merged array: " + Arrays.toString(mergedArray));
    }
}