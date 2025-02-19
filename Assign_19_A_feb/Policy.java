import java.util.*;
import java.time.*;
class Policy{
String policyNumber,policyholderName,coverageType;
LocalDate expiryDate;
double premiumAmount;
public Policy(String policyNumber,String policyholderName,LocalDate expiryDate,String coverageType,double premiumAmount){
this.policyNumber=policyNumber;
this.policyholderName=policyholderName;
this.expiryDate=expiryDate;
this.coverageType=coverageType;
this.premiumAmount=premiumAmount;
}

public String toString(){
return policyNumber+" | "+policyholderName+" | "+expiryDate+" | "+coverageType+" | "+premiumAmount;
}
}

public class InsuranceManagement{
public static void main(String[]args){
Map<String,Policy>hashMap=new HashMap<>();
Map<String,Policy>linkedHashMap=new LinkedHashMap<>();
Map<LocalDate,Policy>treeMap=new TreeMap<>();

addPolicy(hashMap,linkedHashMap,treeMap,new Policy("P123","Alice",LocalDate.of(2025,5,20),"Health",5000));
addPolicy(hashMap,linkedHashMap,treeMap,new Policy("P456","Bob",LocalDate.of(2024,3,15),"Auto",3000));
addPolicy(hashMap,linkedHashMap,treeMap,new Policy("P789","Charlie",LocalDate.of(2024,4,10),"Home",7000));
addPolicy(hashMap,linkedHashMap,treeMap,new Policy("P101","David",LocalDate.of(2024,2,25),"Health",4000));

System.out.println("Retrieve Policy by Number: "+getPolicyByNumber(hashMap,"P456"));
System.out.println("\nPolicies Expiring Soon:");
display(getExpiringPolicies(treeMap));
System.out.println("\nPolicies for 'Alice':");
display(getPoliciesByHolder(hashMap,"Alice"));
removeExpiredPolicies(hashMap,linkedHashMap,treeMap);
System.out.println("\nAfter Removing Expired Policies:");
display(hashMap.values());
}

static void addPolicy(Map<String,Policy>hm,Map<String,Policy>lhm,Map<LocalDate,Policy>tm,Policy p){
hm.put(p.policyNumber,p);
lhm.put(p.policyNumber,p);
tm.put(p.expiryDate,p);
}

static Policy getPolicyByNumber(Map<String,Policy>policies,String policyNumber){
return policies.get(policyNumber);
}

static List<Policy>getExpiringPolicies(Map<LocalDate,Policy>policies){
List<Policy>expiring=new ArrayList<>();
LocalDate now=LocalDate.now();
for(LocalDate date:policies.keySet())if(date.isBefore(now.plusDays(30)))expiring.add(policies.get(date));
return expiring;
}

static List<Policy>getPoliciesByHolder(Map<String,Policy>policies,String holder){
List<Policy>holderPolicies=new ArrayList<>();
for(Policy p:policies.values())if(p.policyholderName.equalsIgnoreCase(holder))holderPolicies.add(p);
return holderPolicies;
}

static void removeExpiredPolicies(Map<String,Policy>hm,Map<String,Policy>lhm,Map<LocalDate,Policy>tm){
LocalDate now=LocalDate.now();
Iterator<LocalDate>itr=tm.keySet().iterator();
while(itr.hasNext()){
LocalDate date=itr.next();
if(date.isBefore(now)){
Policy p=tm.get(date);
hm.remove(p.policyNumber);
lhm.remove(p.policyNumber);
itr.remove();
}
}
}

static void display(Collection<Policy>policies){
for(Policy p:policies)System.out.println(p);
}
}
