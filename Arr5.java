import java.util.*;
public class Arr5{
    public static void main(String [] args){
        int arr []={14,16,18,44,66};
        int max=arr[0];
        int min=arr[0];
        int n=arr.length;
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
           
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        
    }
}