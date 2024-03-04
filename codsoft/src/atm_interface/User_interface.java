package atm_interface;
import java.util.Scanner;

public class User_interface 
{
    public static void main(String[] args) 
    {

        Atm atm = new Atm();
        Scanner sc = new Scanner(System.in);
        int choice;
        double amount;

        System.out.println("Welcome to ATM");  

        while(true)
        {
            System.out.println("\n<1> Withdraw\n<2> Deposit\n<3> Check Balance\n<4> Exit");
            System.out.print("Select an option(1-4) : ");
            choice = sc.nextInt();
    
            switch(choice)
            {
                case 1:
                    System.out.print("Enter amount to be withdrawn : ");
                    amount = sc.nextDouble();
                    System.out.println(atm.withdraw(amount));
                    break;
                case 2:
                    System.out.print("Enter amount to deposit : ");
                    amount = sc.nextDouble();
                    System.out.println(atm.deposit(amount));
                    break;
                case 3:
                    double balance = atm.check_balance();
                    System.out.println("Your current balance is : "+balance+" Rs");
                    break;
                case 4:
                    System.exit(1);
                    break;
                default: System.out.println("Invalid input ! plzz try again");                    
            }
        }
    }
}