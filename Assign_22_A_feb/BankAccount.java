import java.util.Scanner;
public class BankTransaction {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter initial balance: ");
double balance = scanner.nextDouble();
BankAccount account = new BankAccount(balance);
try {
System.out.print("Enter withdrawal amount: ");
double amount = scanner.nextDouble();
account.withdraw(amount);
} catch (InsufficientBalanceException e) {
System.out.println(e.getMessage());
} catch (IllegalArgumentException e) {
System.out.println(e.getMessage());
} catch (Exception e) {
System.out.println("An error occurred. Please enter a valid amount.");
}
}
}
class InsufficientBalanceException extends Exception {
public InsufficientBalanceException(String message) {
super(message);
}
}
class BankAccount {
private double balance;
public BankAccount(double balance) {
this.balance = balance;
}
public void withdraw(double amount) throws InsufficientBalanceException, IllegalArgumentException {
if (amount < 0) {
throw new IllegalArgumentException("Invalid amount!");
}
if (amount > balance) {
throw new InsufficientBalanceException("Insufficient balance!");
}
balance -= amount;
System.out.println("Withdrawal successful, new balance: " + balance);
}
}
