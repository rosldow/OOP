import java.util.Scanner;

public class Account {
    //-balance: double
    //-ownerName: String
    private String ownerName;
    private double balance;
    private String password;

    //<<constructor>>Account( name: String, balance: double)
    Account (String ownerName, double balance, String password){
        this.ownerName = ownerName;
        this.balance = balance;
        this.password = password;
    }

    //+setOwnerName(name: String)
    //+getOwnerName():String
    //+add(amount: double)
    //+withdraw(amount: double)
    //+getBalance():double


    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void add(double amount) {
        if(amount >0.0)
            balance +=amount;
    }
    public void withdraw(double amount) {
        Scanner scanner = new Scanner(System.in);
        boolean isMatched = false;
        for(int i=0; i<3;i++)
        {
            System.out.println("Enter your password: ");
            String pass = scanner.nextLine();

            if(pass.equals(this.password))
                this.balance -= amount;
            isMatched = true;
        }
        if(!isMatched)
            System.out.println("Your account has been blocked.");
    }

    public double getBalance() {
        return balance;
    }

    //In order to withdraw money, there will be a set of conditions:
    //Set a password (for example 1234)
    //User will get a message: “Please enter the 4-digit pass:”
    //User must enter the pass using keyboard
    //If pass is true, the user will withdraw the money
    //If pass is wrong, the user will try again two more times.
    //If the pass is still wrong, the user will get another message:
    //“Your account has been blocked, please try again later”
}
