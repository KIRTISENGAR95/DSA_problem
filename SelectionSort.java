import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the size");
        int n=sc.nextInt();
        int array[]=new int[n];

        System.out.println("enter val");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<array.length-1;i++){
            int loc=i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[loc]){
                    loc=j;
                }
            }
            int temp=array[i];
            array[i]=array[loc];
            array[loc]=temp;
        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    } 
}
