public class BankAccount{
    private double checkingBalance;
    private double savingsBalance;
    public static int numOfAccounts = 0;
    public static double totalMoney = 0.0;
    public BankAccount(){
        this.checkingBalance=0.0;
        this.savingsBalance=0.0;
        BankAccount.numOfAccounts++;
    }
    public double getCheckingBalance(){
        return this.checkingBalance;
    }
    public double getSavingBalance(){
        return this.savingsBalance;
    }
    public void deposit(String account,double amount){
        if(account.equals("checking")){
            this.checkingBalance+=amount;
            System.out.println(amount+" has been added to your checking balance, your new balance is "+this.checkingBalance);
            BankAccount.totalMoney+=amount;
        }
        else if(account.equals("savings")){
            this.savingsBalance+=amount;
            System.out.println(amount+" has been added to your savings balance, your new balance is "+this.savingsBalance);
            BankAccount.totalMoney+=amount;
        }
        else{
            System.out.println("Please enter a valid account name!");
        }
    }
    public void withdraw(String account,double amount){
        if(account.equals("checking")){
            if(amount<this.checkingBalance)
            {
                this.checkingBalance-=amount;
                System.out.println(amount+" has been withdrawn from your checking balance, your new balance is "+this.checkingBalance);
                BankAccount.totalMoney-=amount;
            }
            else{
                System.out.println("Insufficient funds!");
            }
        }
        else if(account.equals("savings")){
            if(amount<this.savingsBalance)
            {
                this.savingsBalance-=amount;
                System.out.println(amount+" has been withdrawn from your savings balance, your new balance is "+this.savingsBalance);
                BankAccount.totalMoney-=amount;
            }
            else{
                System.out.println("Insufficient funds!");
            }
        }
        else{
            System.out.println("Please enter a valid account name! e.g: 'savings' or 'checking'.");
        }
    }
    public void displayFunds(){
        System.out.println("Total amount in both accounts is: "+(this.checkingBalance+this.savingsBalance));
    }
}