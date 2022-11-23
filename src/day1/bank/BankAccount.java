package day1.bank;

public class BankAccount {

    //States

    //SSN (String)
    private String ssn;
    //Account Number (String)
    private String accountNumber;
    //Account Type (String)
    private AccountType accountType;
    //Customer Information (CustomerInformation)
    private CustomerInformation customerInformation;
    //Account Balance (double)
    private double accountBalance;
    //Branches (Int / String)
    private String branch;
    //Interest Rate (float)
    private float interestRate;
    //Account Holder Name
    private String accountHolderName;

    public BankAccount(){

    }
    public BankAccount(String accountNumber, String accountHolderName, double accountBalance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;

    }

    //Getters and Setters

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public void setCustomerInformation(CustomerInformation customerInformation) {
        this.customerInformation = customerInformation;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    } {
        if (accountBalance < 0){
            throw new RuntimeException("Account balance can not be negative");
        }
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    //Behaviour

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                ", accountHolderName='" + accountHolderName + '\'' +
                '}';
    }

    public void transferBalance(BankAccount fromAccount, BankAccount toAccount, double amountToTransfer) {
      //  fromAccount.setAccountBalance(fromAccount.getAccountBalance() - amountToTransfer);
      //  toAccount.setAccountBalance(toAccount.getAccountBalance() + amountToTransfer);

        fromAccount.accountBalance = fromAccount.accountBalance - amountToTransfer;
        toAccount.accountBalance = toAccount.accountBalance + amountToTransfer;


    }


    //Deposit
    //Withdraw
    //Check Balance
    //Calculate Interest
    //Transfer Balance
    //Create
    //Close
    //Update Information
    //Apply Credit Card

}
