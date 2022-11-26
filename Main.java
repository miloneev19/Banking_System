
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*String name = "Milonee";
        String Gender = "Female";
        String Branch = "Hinjewadi";
        String IFSC = "HDFCN89382";
        long Mobile = 8498423028L;
        long account_number;
        String dob = "08-06-2003";
        int age = 19;
        int balance = 0;*/


        //accept full name,auto generate account number

        int choice;
       // int login_choice;
        //long acc_num;
        Account a;
        login l= new login();
        Account[] accounts = l.getAccounts();
        //login[] info = new login[20];
        //int customer_count=0;


        do {
            System.out.println("Select The operation you want to perform");
            System.out.println("1.Create Account");
            System.out.println("2.Login into Existing Account");
            System.out.println("3.Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("You're now creating a new account");
                    a = l.Create_Account();
                    l.AccountLogin(a);
                   // info[customer_count]=new login();
                    System.out.println("Account Created Successfully");
                    break;
                }
                case 2: {
                    int index = l.credentialMatch();
                    if(index != -1)
                    {
                        a = accounts[index];
                        l.AccountLogin(a);
                    }
                    else {
                        System.out.println("Account Number does not match");
                    }
                    break;
                }
                case 3:
                {
                    System.out.println("Thank you for using");
            }

            }
        } while (choice != 3);
    }
}