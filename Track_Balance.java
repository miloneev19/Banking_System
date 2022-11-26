import java.util.Scanner;

public class Track_Balance
{ static String acc_type;
    static Scanner sc=new Scanner(System.in);
    Account account;
    Track_Balance(Account account)
    {
        this.account = account;

    }

   public void deposit()
    {
        System.out.print("Enter amount to be deposited: ");
        int deposit_amount;
        deposit_amount=sc.nextInt();
        account.setBalance(account.getBalance() + deposit_amount);
        System.out.println("Amount deposited Successfully");
        System.out.println("******************************************************");
    }

    public void withdraw()
    {
        System.out.print("Enter Amount to de withdrawn");
        int withdraw_amount;
        withdraw_amount=sc.nextInt();
       int withdraw_limit = account.getmax_withdraw();
        if(withdraw_amount<withdraw_limit || withdraw_amount< account.getBalance()) {
            account.setBalance(account.getBalance() - withdraw_amount);
            System.out.println("Amount Withdrawn Successfully");
            System.out.println("Updated Balance :" + account.getBalance());
            withdraw_limit = withdraw_limit- withdraw_amount;
           System.out.println("Max withdrawal possible :" + withdraw_limit);
            System.out.println("******************************************************");
        }
        if(withdraw_amount> account.getBalance())
        {
            System.out.println("Insufficient Balance");
            System.out.println("Withdrawal Unsuccessful");
            System.out.println("******************************************************");
        }
    }

    public void displayAccount()
    {
        System.out.println("------------------------------------------------------------------------------------------------------------");
        account.account_info();
        System.out.println("-------------------------------------------------------------------------------------------------------------");
    }





}
