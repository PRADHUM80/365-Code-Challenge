// package JAVA.OOPS.Encapsulation;

class BankAccount
{
    private String accountNumber;
    private double balance;

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public String getStringAccountNumber()
    {
        return accountNumber;
    }

    public double getBalance()
    {
        return balance;
    }
}




public class Encap2 {

    public static void main(String[] args) {
        
        BankAccount account = new BankAccount();
        account.setAccountNumber("292294509");

        account.setBalance(22000.0);

        System.out.println("Account Number : " + account.getStringAccountNumber());
        System.out.println("Balance : " + account.getBalance());
    }
    
}
