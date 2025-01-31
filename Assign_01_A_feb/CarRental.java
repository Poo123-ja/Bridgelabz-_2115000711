
public class CarRental{
private String customerName;
private String carModel;
private int rentalDays;
private int cost;
private double totalCost;
public CarRental(){
customerName="";
carModel="";
rentalDays=0;
totalCost=0;
cost=0;
}
public CarRental(String carModel, String customerName , int rentalDays, int cost){
this.customerName=customerName;
this.carModel=carModel;
this.rentalDays=rentalDays;
this.cost=cost;
totalCost=cost*rentalDays;
}
public void TotalCost(){
System.out.println("Total cost for "+rentalDays+" for "+carModel+" is "+totalCost);
}
public static void main(String [] args){
CarRental c1=new CarRental();
c1.TotalCost();
CarRental c2=new CarRental("Jaguar","Yashi",2,120000);
c2.TotalCost();
}
}
