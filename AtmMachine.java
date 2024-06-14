import java.util.Scanner;
class Atm{
    float Balance;
    int PIN=5674;
    public void checkpin(){
        System.out.println("enter your pin");
        Scanner sc= new Scanner(System.in);
        int enteredpin=sc.nextInt();
        if(enteredpin==PIN){
            menu();
        }
        else{
            System.out.println("enter your valid pin");
            menu();
        }
    }
    public void menu(){
        System.out.println("enter your choice");
        System.out.println("1.check A/C Balance");
        System.out.println("2.withdraw Money");
        System.out.println("3.deposit Money");
        System.out.println("4.Exit");

        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();
        if(opt==1){
            checkBalance();
        }
        else if(opt==2){
           withdrawMoney();
        }
        else if(opt==3){
            depositMoney();
        }
        else if(opt==4){
            return;
        }
        else{
            System.out.println("enter a valid choice");
        }
    }
    public void checkBalance(){
        System.out.println("Balance:"+Balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("enter Amount to withdraw");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else{
            Balance= Balance - amount;
            System.out.println("Money withdrawl successful");
        }
        menu();
    }
    public void depositMoney(){
        System.out.println("enter the amount");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        Balance= Balance + amount;
        System.out.println("money deposited successfully");
        menu();
    }
    }
    public class AtmMachine{

    public static void main(String[] args) {
        Atm obj=new Atm();
        obj.checkpin();
    }
}
