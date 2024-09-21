package Assingment1;

public class BankAccount {
    private String userName ;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber,double balance){
        this.accountNumber = accountNumber;

    }
    public  void deposit(double amount)throws InvalidAmountException{
        if(amount<=0){
            System.out.println("Invalid deposit amount"+amount);
        }
        balance = balance + amount;
    }

    public void withdraw()throws InsufficientFundsException {
        withdraw(0.0);
    }

    public void withdraw(double amount)throws InsufficientFundsException{
        if (amount<=0){
            System.out.println("Invalid withdral amount"+ amount);
        }
        if (amount>balance){
            System.out.println("Insufficient amount"+amount);
        }
        balance = balance - amount;
    }
    public double getBalance(){
        return balance;
    }
    public  void setUserName(String userName){
        this.userName = userName;
    }
    public String getUserName(){
        return userName;
    }
}
