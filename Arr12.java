import java.util.*;
public class Arr12
{

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 8, 9 };
        int[] brr = { 2, 4, 5, 9 };
        System.out.print("Intersection of the two arrays: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < brr.length; j++) {
                if (arr[i] == brr[j]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }


}