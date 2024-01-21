import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the size");
        int n=sc.nextInt();
        int array[]=new int[n];

        for(int i=0;i<array.length;i++){
            System.out.println("enter val" + (i+1));
            array[i]=sc.nextInt();
        }
        System.out.println("orginal val");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i] + " ");
        }
        System.out.println("reverse val");
        for(int i=array.length-1;i>=0;i--){
            System.out.println(array[i] + " ");
        }
        
        
    }
}
