package atm_interface;

public class Bank_account 
{
    private double balance;

    public Bank_account(double balance)
    {
        this.balance = balance;
    }

    boolean withdraw(double amount)
    {
        if(balance < amount)
        {
            return false;
        }
        else
        {
            balance = balance - amount;
            return true;
        }
    }

    void deposit(double amount)
    {
        balance = balance + amount;
    }

    double check_balance()
    {
        return balance;
    }
}