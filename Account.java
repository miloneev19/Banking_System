import java.util.ArrayList;
import java.util.Scanner;

public class Account
{
    static Scanner sc= new Scanner(System.in);

    String name,dob,city,ifsc,gender,email, type;
    int age,pincode,branch,balance,account_number;
    String mobile_number;

    int max_withdraw;
    //static ArrayList<Account> account = new ArrayList<>();

    Account(String name,String dob,String city,String gender, String email,int age, int pincode, int balance,
            String mobile_number,int account_number)
    {
     this.name=name;
     this.dob=dob;
     this.city=city;
     this.gender=gender;
     this.email=email;
     this.age=age;
     this.pincode=pincode;
     this.balance=balance;
     this.mobile_number=mobile_number;
     this.account_number=account_number;
    }

    public void Branch()
    {
        System.out.println("Select your Branch");
        System.out.println("1.Shivaji Nagar");
        System.out.println("2.Hinjewadi") ;
        System.out.println("3.Kothrud");
        System.out.println("Enter choice");
        branch=sc.nextInt();
        if(branch==1)
        {
            ifsc = "HDFC0098765";
            System.out.println("IFSC CODE:  " + ifsc);
        }
        else if(branch==2)
        {
            ifsc="HDFC0034567";
            System.out.println("IFSC CODE :" + ifsc);
        }
        else if(branch==3)
        {
            ifsc="HDFC0012345";
            System.out.println("IFSC CODE: " + ifsc);

        }
        else
        {
            System.out.println("Invalid Input !! Please select a branch mentioned above! ");
        }
    }


    public void balance()
    {
        System.out.println("Available Balance in your account is " + balance);
        System.out.println("***************************************************");
    }

    public int getAccount_number() {
        return account_number;
    }
    public String account_type() {
        String acc_type = "";
        System.out.println("Select the type of account:");
        System.out.println("1.Saving account");
        System.out.println("2.Current account");
        System.out.println("3.Salary Account");
        System.out.println("Please enter the type of account you want to create: ");
        int account_choice = sc.nextInt();
        if (account_choice == 1) {
            System.out.println("You're creating a Savings account.");
            max_withdraw = 10000;
            acc_type = "Saving";

        } else if (account_choice == 2) {
            System.out.println("You're creating a Current account.");
            max_withdraw=20000;
            acc_type = "Current";

        } else if (account_choice == 3) {
            System.out.println("You're creating a Salary account. ");
            max_withdraw=70000;
            acc_type = "Salary";

        } else {
            System.out.println("Invalid selection!");
        }
        System.out.println("***************************************************");
        return acc_type;
    }


    public void setType(String s){
        type = s;
    }

    public int getBalance(){
        return balance;
    }

    public void setBalance(int amount)
    {
        balance = amount;
    }

    public int getmax_withdraw()
    {
        return max_withdraw;
    }

    public int getBranch() {
        return branch;
    }


    public void account_info()
    {
        System.out.println("Name :" + name);
        System.out.println("Age  :" + age);
        System.out.println("DOB  :" + dob);
        System.out.println("Pincode : " + pincode);
        System.out.println("Mobile Number :" +mobile_number);
        System.out.println("Account Number :" + account_number);
        System.out.println("Email : "  + email);
        System.out.println("City :" + city);
        System.out.println("Gender :" + gender);

    }

   /* public String toString()
    {
        return "Name "+name+"\nAge "+age+"\nDOB "+dob+"\nPincode "+pincode+"\nMobile Number "+mobile_number+"\nAccount Number "+account_number+"\nEmail "+email+"\nCity "+city+"\nGender "+gender
                +"\nBranch " +getBranch() +"\nAccount Type "+ account_type();
    }
*/


  /*  public void display()
    {
        System.out.println("-----------------------------------------------------------------------------------------");
        for(int i=0;i<account.size();i++)
        {
          //Account acc_details = account.get(i);
          System.out.println(account.get(i));
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }*/
}
