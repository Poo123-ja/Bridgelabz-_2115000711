import java.util.*;
public class BankingSystem{
public static void main(String[]args){
Map<Integer,Double>accounts=new HashMap<>();
Map<Double,Integer>sortedAccounts=new TreeMap<>();
Queue<Integer>withdrawQueue=new LinkedList<>();
createAccount(accounts,101,5000);
createAccount(accounts,102,3000);
createAccount(accounts,103,7000);
createAccount(accounts,104,4000);
for(Map.Entry<Integer,Double>entry:accounts.entrySet())sortedAccounts.put(entry.getValue(),entry.getKey());
withdrawQueue.add(102);
withdrawQueue.add(104);
withdrawQueue.add(101);
System.out.println("Customer Accounts:");
display(accounts);
System.out.println("\nSorted by Balance:");
for(Double balance:sortedAccounts.keySet())System.out.println("Account "+sortedAccounts.get(balance)+" -> $"+balance);
System.out.println("\nProcessing Withdrawals:");
processWithdrawals(accounts,withdrawQueue);
System.out.println("\nUpdated Accounts:");
display(accounts);
}
static void createAccount(Map<Integer,Double>accounts,int accNo,double balance){
accounts.put(accNo,balance);
}
static void processWithdrawals(Map<Integer,Double>accounts,Queue<Integer>withdrawQueue){
while(!withdrawQueue.isEmpty()){
int accNo=withdrawQueue.poll();
if(accounts.containsKey(accNo)){
accounts.put(accNo,accounts.get(accNo)-500);
System.out.println("Withdrawn $500 from Account "+accNo);
}else{
System.out.println("Account "+accNo+" not found.");
}
}
}
static void display(Map<Integer,Double>accounts){
for(int acc:accounts.keySet())System.out.println("Account "+acc+" -> $"+accounts.get(acc));
}
}
