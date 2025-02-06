import java.util.ArrayList;
public class Main {
public static void main(String[] args) {
Bank bank = new Bank("Axis Bank");

Customer customer1 = new Customer("Pooja");
Customer customer2 = new Customer("Arun");

Account account1 = new Account(101, 5000, bank);
Account account2 = new Account(102, 3000, bank);
Account account3 = new Account(103, 7000, bank);

customer1.addAccount(account1);
customer1.addAccount(account2);
customer2.addAccount(account3);

bank.openAccount(customer1, account1);
bank.openAccount(customer1, account2);
bank.openAccount(customer2, account3);

customer1.viewBalance();
customer2.viewBalance();
}
}

class Bank {
String name;
ArrayList<Account> accounts;

Bank(String name) {
this.name = name;
this.accounts = new ArrayList<>();
}

void openAccount(Customer customer, Account account) {
accounts.add(account);
System.out.println("Account " + account.accountNumber + " opened for " + customer.name + " at " + name);
}
}

class Customer {
String name;
ArrayList<Account> accounts;

Customer(String name) {
this.name = name;
this.accounts = new ArrayList<>();
}

void addAccount(Account account) {
accounts.add(account);
}

void viewBalance() {
System.out.println("Customer: " + name);
for (Account account : accounts) {
System.out.println("Account " + account.accountNumber + " Balance: $" + account.balance);
}
}
}

class Account {
int accountNumber;
double balance;
Bank bank;

Account(int accountNumber, double balance, Bank bank) {
this.accountNumber = accountNumber;
this.balance = balance;
this.bank = bank;
}
}
