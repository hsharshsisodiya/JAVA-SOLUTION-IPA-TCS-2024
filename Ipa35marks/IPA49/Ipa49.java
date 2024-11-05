public class Ipa49 {
    public static void main(String []args){

    }
    public static transferFunds()
}

class BankAccount{
    String accountNumber,accountHolderName;
    double balance;

    BankAccount(String accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    String getAccountNumber(){
        return accountNumber;
    }
    String getAccountHolderName(){
        return accountHolderName;
    }
    double getBalance(){
        return balance;
    }

    void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    void setAccountHolderName(Sting accountHolderName){
        this.accountHolderName = accountHolderName;
    }
    void setBalance(double balance){
        this.balance = balance;
    }
}

class BankUtils
{
    BankAccount fromAccount;
    BankAccount toAccount;
    double amount;
    String transactionCode;
    public BankUtils(BankAccount fromAccount, BankAccount toAccount, double amount, String transactionCode) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.transactionCode = transactionCode;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getTransactionCode() {
        return transactionCode;
    }
    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    } 
}

class Transaction
{
    String transactionCode;
    double amount;
    String timestamp;
    public Transaction(String transactionCode, double amount, String timestamp) {
        this.transactionCode = transactionCode;
        this.amount = amount;
        this.timestamp = timestamp;
    }
    public String getTransactionCode() {
        return transactionCode;
    }
    public double getAmount() {
        return amount;
    }
    public String getTimestamp() {
        return timestamp;
    }
}

