import java.util.*;

public class Main {
public static void main(String[] args) {
List<Vehicle> rides = new ArrayList<>();
rides.add(new Car("C1", "Piyush", 10));
rides.add(new Bike("B1", "Sachin", 5));
rides.add(new Auto("A1", "Aditiya", 8));

double distance = 15; 
for (Vehicle ride : rides) {
System.out.println(ride.getVehicleDetails());
System.out.println("Fare for " + distance + " km: " + ride.calculateFare(distance));
if (ride instanceof GPS) {
GPS gpsVehicle = (GPS) ride;
gpsVehicle.updateLocation("Downtown");
System.out.println("Updated Location: " + gpsVehicle.getCurrentLocation());
}
System.out.println(" ");
}
}
}
abstract class Vehicle {
private String vehicleId;
private String driverName;
private double ratePerKm;

public Vehicle(String vehicleId, String driverName, double ratePerKm) {
this.vehicleId = vehicleId;
this.driverName = driverName;
this.ratePerKm = ratePerKm;
}

public String getVehicleId() { return vehicleId; }
public String getDriverName() { return driverName; }
public double getRatePerKm() { return ratePerKm; }

public String getVehicleDetails() {
return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate per Km: " + ratePerKm;
}

public abstract double calculateFare(double distance);
}
interface GPS {
String getCurrentLocation();
void updateLocation(String newLocation);
}
class Car extends Vehicle implements GPS {
private String location;

public Car(String vehicleId, String driverName, double ratePerKm) {
super(vehicleId, driverName, ratePerKm);
this.location = "Unknown";
}

@Override
public double calculateFare(double distance) {
return getRatePerKm() * distance;
}

@Override
public String getCurrentLocation() {
return location;
}

@Override
public void updateLocation(String newLocation) {
this.location = newLocation;
}
}
class Bike extends Vehicle {
public Bike(String vehicleId, String driverName, double ratePerKm) {
super(vehicleId, driverName, ratePerKm);
}

@Override
public double calculateFare(double distance) {
return getRatePerKm() * distance * 0.9; 
}
}
class Auto extends Vehicle implements GPS {
private String location;

public Auto(String vehicleId, String driverName, double ratePerKm) {
super(vehicleId, driverName, ratePerKm);
this.location = "Unknown";
}

@Override
public double calculateFare(double distance) {
return getRatePerKm() * distance * 1.1; 
}

@Override
public String getCurrentLocation() {
return location;
}

@Override
public void updateLocation(String newLocation) {
this.location = newLocation;
}
}

