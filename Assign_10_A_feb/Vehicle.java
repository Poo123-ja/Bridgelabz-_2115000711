import java.util.*;
public class VehicleSystem {
public static void main(String[] args) {
List<Vehicle> vehicleList = new ArrayList<>();
vehicleList.add(new Car("A101", 1000));
vehicleList.add(new Bike("B102", 500));
vehicleList.add(new Truck("C103", 2000));
for (Vehicle vehicle : vehicleList) {
int rentalDays = 5;
double rentalCost = vehicle.calculateRentalCost(rentalDays);
double insurance = (vehicle instanceof Insurable) ? ((Insurable) vehicle).calculateInsurance() : 0;

System.out.println("Vehicle: " + vehicle.getType());
System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
System.out.println("Rental Cost for " + rentalDays + " days: " + rentalCost);
System.out.println("Insurance Cost: " + insurance);
if (vehicle instanceof Insurable) {
System.out.println(((Insurable) vehicle).getInsuranceDetails());
}
System.out.println("---------------------");
}
}
}
abstract class Vehicle {
private String vehicleNumber;
private String type;
private double rentalRate;

public Vehicle(String vehicleNumber, String type, double rentalRate) {
this.vehicleNumber = vehicleNumber;
this.type = type;
rentalRate = rentalRate;
}

public String getVehicleNumber() { return vehicleNumber; }
public String getType() { return type; }
public double getRentalRate() { return rentalRate; }

public void setRentalRate(double rentalRate) { this.rentalRate = rentalRate; }

public abstract double calculateRentalCost(int days);
}
interface Insurable {
double calculateInsurance();
String getInsuranceDetails();
}
class Car extends Vehicle implements Insurable {
public Car(String vehicleNumber, double rentalRate) {
super(vehicleNumber, "Car", rentalRate);
}

@Override
public double calculateRentalCost(int days) {
return getRentalRate() * days;
}

@Override
public double calculateInsurance() {
return getRentalRate() * 0.05;
}

@Override
public String getInsuranceDetails() {
return "Car Insurance: 5% of rental rate";
}
}
class Bike extends Vehicle implements Insurable {
public Bike(String vehicleNumber, double rentalRate) {
super(vehicleNumber, "Bike", rentalRate);
}

@Override
public double calculateRentalCost(int days) {
return getRentalRate() * days * 0.9; // 10% discount
}

@Override
public double calculateInsurance() {
return getRentalRate() * 0.02;
}

@Override
public String getInsuranceDetails() {
return "Bike Insurance: 2% of rental rate";
}
}
class Truck extends Vehicle {
public Truck(String vehicleNumber, double rentalRate) {
super(vehicleNumber, "Truck", rentalRate);
}

@Override
public double calculateRentalCost(int days) {
return getRentalRate() * days * 1.2; // 20% extra charge
}
}
