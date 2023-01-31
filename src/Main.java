public class Main {
    public static void main(String[] args) {
        double amount = 650000;
        String name = "Brian Steven";
        long numberAcc = 123456789;
        BankAccount account = new BankAccount(amount, name, numberAcc);
        System.out.println(account.setEntry(200000));
        System.out.println(account.setWithdrawl(300000));
        System.out.println(account.getBalanceAccount(amount));
        account.getDataAccount();
    }


}