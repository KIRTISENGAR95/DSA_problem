import java.util.*;
public class Arr4{
    public static void main(String [] args){
        int arr []={14,16,18,44,66};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        
        }
        int avg=sum/n;
        System.out.println(avg);
    }
}