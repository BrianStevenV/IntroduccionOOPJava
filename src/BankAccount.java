public class BankAccount {
    private double balanceAccount;
    private String holderName;
    private long numberAccount;
    private double amount;


    public BankAccount(double balanceAccount, String holderName, long numberAccount) {
        this.balanceAccount = balanceAccount;
        this.holderName = holderName;
        this.numberAccount = numberAccount;
    }

    public double setEntry(double amount){
        System.out.println("Entry a value of: " + amount);
        return balanceAccount +=  amount;
    }

    public double setWithdrawl( double amount){
        System.out.println("Withdrawl amount of: " + amount);
        return balanceAccount -= amount;
    }

    public double getBalanceAccount(double balanceAccount) {
        System.out.println("The balance account is: " + this.balanceAccount);
        return this.balanceAccount;
    }

    public void getDataAccount(){
        System.out.println("The Owner account " + this.holderName + " with account number:" + this.numberAccount + " with a balance account of: $" + this.balanceAccount);
    }
}
