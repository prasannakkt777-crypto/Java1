public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setBalance(1000);

        System.out.println(account.getBalance());

        account.setBalance(-500);

        System.out.println(account.getBalance());
    }
}