import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;
        int cal;
        int quotient;
        int remainder;

        System.out.println("enter two number");
        Scanner sc=new Scanner(System.in);

        System.out.println("enter first number");
        n1=sc.nextInt();
        System.out.println("enter second number");
        n2=sc.nextInt();
        System.out.println("select opretions");
        System.out.println("1-add");
        System.out.println("2-substract");
        System.out.println("multiply");
        System.out.println("divide");
        System.out.println("enter operation number");
        Scanner s = new Scanner(System.in);
        n3=sc.nextInt();
        if(n3==1){
            cal=n1+n2;
            System.out.println("sum of two numbers"+ cal);
        }
        else if(n3==2){
            cal=n1-n2;
            System.out.println("difference of twwo numbers"+ cal);
        }
        else if(n3==3){
            cal=n1*n2;
            System.out.println("product of two numbers"+ cal);
        }
        else if(n3==4){
            quotient=n1/n2;
            remainder=n1%n2;
            System.out.println("quotient of two numbers"+ quotient);
            System.out.println("remainder of two numbers"+ remainder);
        }
    }
}
