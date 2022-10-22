
public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account("Osman", 1000, "1234");
        System.out.println("Owner name of account: "+acc1.getOwnerName());
        System.out.println("Balance value: "+acc1.getBalance());

        acc1.add(500);
        System.out.println("Balance value: "+acc1.getBalance());
        acc1.withdraw(500);
        System.out.println("Balance value: "+acc1.getBalance());


    }
}