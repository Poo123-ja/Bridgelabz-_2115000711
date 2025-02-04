public class BankAccount{
private static String bankName="Bank Of Baroda";
private String accountHolderName;
final private long accountNumber;
private static int totalAccounts=0;
public BankAccount(String accountHolderName,long accountNumber){
this.accountHolderName=accountHolderName;
this.accountNumber=accountNumber;
totalAccounts++;
}
static int getTotalAccounts(){
return totalAccounts;
}
public void Display(){
System.out.println("Bank Name:"+bankName);
System.out.println("Account NUmber:"+accountNumber);
System.out.println("Accoutn Holder:"+accountHolderName);
}
public static void main(String []args){
BankAccount b=new BankAccount("pooja singh",1234567890);
System.out.println(b instanceof BankAccount);
System.out.println(b.getTotalAccounts());
b.Display();
}
}
