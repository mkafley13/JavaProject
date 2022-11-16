package day1.bank;

public class BankingApplication {
    public static void main(String[] args) {
        BankAccount tesAccount = new BankAccount("7789","Test Account", 100);

        BankAccount manojAccount = new BankAccount();
        // manojAccount.accountNumber = "7638";
        manojAccount.setAccountNumber("7638");

        // String accountNumber = manojAccount.accountNumber;
        String accountNumber = manojAccount.getAccountNumber();

        // manojAccount.accountHolderName = "Manoj Kafley";
        manojAccount.setAccountHolderName("Manoj Kafley");

        // manojAccount.accountBalance = 5000;
        manojAccount.setAccountBalance(5000);

        // manojAccount.accountType = "SAVING";
        manojAccount.setAccountType(AccountType.SAVING);

        // manojAccount.branch = "Bank Of America";
        manojAccount.setBranch("Bank Of America");

        // manojAccount.interestRate = 8;
        manojAccount.setInterestRate(8f);

        // manojAccount.ssn = "6789";
        manojAccount.setSsn("6789");

        CustomerInformation manojInformation = new CustomerInformation();

        // manojInformation.phoneNumber = "6372849261";
        manojInformation.setPhoneNumber("6372849261");

        // manojAccount.customerInformation = manojInformation;
        manojAccount.setCustomerInformation(manojInformation);

         BankAccount personBAccount = new BankAccount();
        personBAccount.setAccountNumber("1234");
        personBAccount.setAccountBalance(200);

        double amountToTransfer = 200;
        // Manoj -> B

       // manojAccount.setAccountBalance(manojAccount.getAccountBalance() - amountToTransfer);
       // personBAccount.setAccountBalance(personBAccount.getAccountBalance() + amountToTransfer);

        BankAccount dummyAccount = new BankAccount();
        dummyAccount.transferBalance(manojAccount, personBAccount, amountToTransfer);

        System.out.println("Manoj Balance : " + manojAccount.getAccountBalance());
        System.out.println("Person B Balance : " + personBAccount.getAccountBalance());

        // B -> Manoj
       // manojAccount.setAccountBalance(manojAccount.getAccountBalance() + amountToTransfer);
       // personBAccount.setAccountBalance(personBAccount.getAccountBalance() - amountToTransfer);

        dummyAccount.transferBalance(personBAccount, manojAccount, amountToTransfer);

        System.out.println("Manoj Balance : " + manojAccount.getAccountBalance());
        System.out.println("Person B Balance : " + personBAccount.getAccountBalance());
    }
}
