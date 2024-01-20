import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the size");
        int n=sc.nextInt();
        int array[]=new int[n];

        System.out.println("enter val");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
            
            System.out.println("search element ");
            int search=sc.nextInt();
            for(int j=0;j<array.length;j++){
                if(array[j]==search)
                System.out.println(search + "found at position" + j);
                
            }
        
        
    }
    
    
    
}
