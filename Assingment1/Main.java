package Assingment1;

public class Main {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount("2210776146",100.0);
        obj.setUserName("Samim");
        try{
            obj.deposit(50.0);
            System.out.println("Your current balance is: "+ obj.getBalance());
            try {
                System.out.println("trying to withdraw 200.0 taka");
                obj.withdraw(200.0);
                System.out.println(" Yout current balance is  "+obj.getBalance());
            }catch (InsufficientFundsException e){
                System.out.println(e);
            }try{
                System.out.println("Attempting withdraw 50.0");
                obj.withdraw(50.0);
                System.out.println("Your current balance is: "+obj.getBalance());
            }catch (InsufficientFundsException e){
                System.out.println(e);
            }
            try {
                System.out.println("attempting to deposit - 10 ");
                obj.deposit(-10.0);
                System.out.println("current balance is: "+obj.getBalance());
            }catch (InvalidAmountException e){
                System.out.println(e);
            }
        }catch (InvalidAmountException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Final balance: "+ obj.getBalance());
            System.out.println("Thanks you "  +  obj.getUserName());
        }
    }
}
