import java.util.*;
public class SimpleInterest{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int r=sc.nextInt();
        int t=sc.nextInt();
        float i=(p*r*t)/100;
        System.out.println(i);
    }
}