import java.util.*;
public class Arr14
{

    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 4, 5, 6, 7, 8 };
        int[] mergedArray = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                mergedArray[k] = array1[i];
                i++;
            } else {
                mergedArray[k] = array2[j];
                j++;
            }
            k++;
        }
        while (i < array1.length) {
            mergedArray[k] = array1[i];
            i++;
            k++;
        }
        while (j < array2.length) {
            mergedArray[k] = array2[j];
            j++;
            k++;
        }
        System.out.println("Merged and sorted array: " + Arrays.toString(mergedArray));
    }
}