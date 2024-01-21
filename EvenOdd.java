import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the size");
        int n=sc.nextInt();
        int array[]=new int[n];

        System.out.println("enter val");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0)
            System.out.println(array[i] + "even");
            else
            System.out.println("odd");
        }
    }
}
