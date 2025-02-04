public class Vehicle{
static int registrationFee=200;
private String ownerName;
private String vehicleType;
final private int registrationNumber;
public Vehicle(String ownerName, String vehicleType,int registrationNumber){
this.ownerName=ownerName;
this.vehicleType=vehicleType;
this.registrationNumber=registrationNumber;
}
static int updateRegistrationFee(int f){
registrationFee=f;
return registrationFee;
}
public void Display(){
System.out.println("Registration Fees is:"+registrationFee);
System.out.println("Name of qwner is:"+ownerName);
System.out.println("Vehicle Type is:"+vehicleType);
System.out.println("Registration Number is :"+registrationNumber);
}
public static void main(String []args){
Vehicle v=new Vehicle("Santosh kumar","Car",123456);
System.out.println(v instanceof Vehicle);
v.Display();
v.updateRegistrationFee(200);
}
}
