package atm_interface;

public class Atm 
{
    private Bank_account user_account;

    public Atm()
    {
        user_account = new Bank_account(40000);
    }

    public String withdraw(double amount)
    {
        if(user_account.withdraw(amount))
        {
            return "Transaction succesfull. Succesfully withdrawn "+amount+" Rs";
        }
        else
        {
            return "Transaction failed ! Insufficient Balance .... Plzz try again";
        }
    }

    public String deposit(double amount)
    {
        user_account.deposit(amount);
        return "Transaction succesfull. Succesfully deposited "+amount+" Rs";
    }

    public double check_balance()
    {
        return user_account.check_balance();
    }
}
