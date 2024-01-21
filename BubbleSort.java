import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the size");
        int n=sc.nextInt();
        int array[]=new int[n];

        System.out.println("enter val");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        int temp;
        for(int i=0;i<array.length;i++){
            for(int j=1;j<array.length-i;j++){
                if(array [j-1] > array[j]){
                    temp=array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("array after sorting");
        for(int i=0;i<array.length;i++)
        System.out.println(array[i] + " ");
    }
}
