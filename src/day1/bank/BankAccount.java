package day1.bank;

public class BankAccount {

        //States

        //SSN (String)
   private String ssn;
        //Account Number (String)
   private String accountNumber;
        //Account Type (String)
   private String accountType;
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

   //Getters and Setters

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setCustomerInformation(CustomerInformation customerInformation) {
        this.customerInformation = customerInformation;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
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
