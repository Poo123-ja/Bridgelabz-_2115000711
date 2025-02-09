import java.util.*;
public class BankingSystem {
public static void main(String[] args) {
List<BankAccount> accounts = new ArrayList<>();
accounts.add(new SavingsAccount("123456", "Seema", 50000));
accounts.add(new CurrentAccount("152365", "Khushi", 10000));

for (BankAccount account : accounts) {
System.out.println("Account Holder: " + account.getHolderName());
System.out.println("Account Number: " + account.getAccountNumber());
System.out.println("Balance: " + account.getBalance());
System.out.println("Interest Earned: " + account.calculateInterest());
if (account instanceof Loanable) {
Loanable loanAccount = (Loanable) account;
loanAccount.applyForLoan();
System.out.println("Loan Eligibility: " + loanAccount.calculateLoanEligibility());
}
System.out.println("+++++++++++++");
}
}
}
abstract class BankAccount {
private String accountNumber;
private String holderName;
private double balance;

public BankAccount(String accountNumber, String holderName, double balance) {
this.accountNumber = accountNumber;
this.holderName = holderName;
this.balance = balance;
}

public String getAccountNumber() { return accountNumber; }
public String getHolderName() { return holderName; }
public double getBalance() { return balance; }

public void deposit(double amount) { balance += amount; }

public void withdraw(double amount) {
if (amount <= balance) {
balance -= amount;
} else {
System.out.println("Insufficient funds");
}
}

public abstract double calculateInterest();
}
interface Loanable {
void applyForLoan();
double calculateLoanEligibility();
}

// SavingsAccount class
class SavingsAccount extends BankAccount implements Loanable {
public SavingsAccount(String accountNumber, String holderName, double balance) {
super(accountNumber, holderName, balance);
}

@Override
public double calculateInterest() {
return getBalance() * 0.04; // 4% interest
}

@Override
public void applyForLoan() {
System.out.println("Loan application submitted for Savings Account.");
}

@Override
public double calculateLoanEligibility() {
return getBalance() * 10;
}
}

// CurrentAccount class
class CurrentAccount extends BankAccount {
public CurrentAccount(String accountNumber, String holderName, double balance) {
super(accountNumber, holderName, balance);
}

@Override
public double calculateInterest() {
return 0; 
}
}
