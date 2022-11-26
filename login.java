import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class login {
    Account[] accounts;
    Account a;
    int i = 0;
    static Scanner sc = new Scanner(System.in);
   ArrayList<Account> account_info;

    login(){
        accounts = new Account[20];
    }

    public Account Create_Account() {

        String name, dob, city, ifsc, gender, email, type, mobile_number;
        int age, pincode, branch, balance, account_number;
        System.out.print("Name: ");
        name = sc.next();
        System.out.print("Date of Birth: ");
        dob = sc.next();
        System.out.print("City: ");
        city = sc.next();
        System.out.print("Age: ");
        age = sc.nextInt();
        System.out.print("Mobile Number: ");
        mobile_number = sc.next();
        System.out.print("Pincode: ");
        pincode = sc.nextInt();
        System.out.print("Account Number: ");
        account_number = sc.nextInt();
        System.out.print("Enter opening balance : ");
        balance = sc.nextInt();
        System.out.print("Gender: ");
        gender = sc.next();
        System.out.print("Email Id: ");
        email = sc.next();
        System.out.println("Thank you for entering your details");
        System.out.println("Account Created Successfully");
        a = new Account(name, dob, city, gender, email, age, pincode, balance, mobile_number, account_number);
        a.Branch();
        a.setType(a.account_type());
        accounts[i++] = a;
        account_info=new ArrayList<>();
        account_info.add(a);
        return a;
    }


   /* public void infoStore()
    {
        account_info = new ArrayList<>();
        account_info.add(new Account(Create_Account().name, Create_Account().dob, Create_Account().city, Create_Account().gender, Create_Account().email, Create_Account().age,
                Create_Account().pincode, Create_Account().balance, Create_Account().mobile_number, Create_Account().getAccount_number()));
    }

    public void displayInfo()
    {
        System.out.println("Account Info Is displayed Below");
        for (int i = 0; i < account_info.size();i++)
        {
            System.out.println(account_info.get(i));
        }
    }*/

    public void AccountLogin(Account account) {
        Scanner sc = new Scanner(System.in);
        int login_choice;
        Track_Balance tb = new Track_Balance(account);
            do {
                System.out.println("Choose the option from drop down menu");
                System.out.println("1.Deposit Money");
                System.out.println("2.Withdraw Money");
                System.out.println("3.Check Balance");
                System.out.println("4.Display Account Info");
                System.out.println("5.Exit");
                login_choice = sc.nextInt();
                switch (login_choice) {

                    case 1:
                        tb.deposit();
                        break;
                    case 2:
                        tb.withdraw();
                        break;
                    case 3:
                        a.balance();
                        break;

                    case 4:
                        tb.displayAccount();
                        break;
                    case 5:
                        System.out.println("Thank you for using");
                        break;

                }
            } while (login_choice != 5);

        }


    public int credentialMatch() {
        int login_accountNum;
        System.out.println("Enter account number you want to login into");
        login_accountNum = sc.nextInt();
        for (int j = 0; j < 20; j++) {
            if (login_accountNum == accounts[j].getAccount_number()) {
                return j;
            }
        }
        return -1;
    }

    public Account[] getAccounts(){
        return accounts;
    }
}

