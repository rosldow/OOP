public class Account {
    private String ownerName;
    private double balance;
    private String password;

    //<<constructor>>Account( name: String, balance: double)
    public Account (String ownerName, double balance, String password)
    {
        this.ownerName = ownerName;
        if(balance >= 0)
            this.balance=balance;
        this.password=password;
    }
    public void addAmount(double amount)
    {
        if (amount > 0.0)
            balance = balance + amount;
    }

    public void withdraw(double withdraw)
    {
        balance = balance - withdraw;
    }

    public void setName(String name)
    {
        this.ownerName=ownerName;
    }

    public String getName()
    {
        return ownerName;
    }

    public double getBalance()
    {
        return balance;
    }


}