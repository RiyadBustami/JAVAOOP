public class BankAccountTest{
    public static void main(String[] args){
        BankAccount account1=new BankAccount();
        account1.deposit("checking",25);
        account1.deposit("savings",25);
        account1.deposit("checking",25);
        account1.withdraw("savings",50);
        System.out.println(account1.getCheckingBalance());
        account1.displayFunds();
        System.out.println(BankAccount.numOfAccounts);
        System.out.println(BankAccount.totalMoney);
    }
}