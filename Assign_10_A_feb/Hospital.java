import java.util.*;

public class Main{
public static void main(String[] args) {
List<Patient> patients = new ArrayList<>();
patients.add(new InPatient("P1", "Aman", 25, 20000, 3));
patients.add(new OutPatient("P2", "Ram", 30, 5000));

for (Patient patient : patients) {
System.out.println(patient.getPatientDetails());
System.out.println("Total Bill: " + patient.calculateBill());
if (patient instanceof MedicalRecord) {
MedicalRecord medicalRecord = (MedicalRecord) patient;
medicalRecord.addRecord("Routine checkup completed.");
System.out.println("Medical Records: " + medicalRecord.viewRecords());
}
System.out.println(" ");
}
}
}

// Abstract class Patient
abstract class Patient {
private String patientId;
private String name;
private int age;

public Patient(String patientId, String name, int age) {
this.patientId = patientId;
this.name = name;
this.age = age;
}

public String getPatientId() { return patientId; }
public String getName() { return name; }
public int getAge() { return age; }

public String getPatientDetails() {
return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
}

public abstract double calculateBill();
}

// Interface MedicalRecord
interface MedicalRecord {
void addRecord(String record);
List<String> viewRecords();
}

// InPatient class
class InPatient extends Patient implements MedicalRecord {
private double dailyRate;
private int daysAdmitted;
private List<String> records;

public InPatient(String patientId, String name, int age, double dailyRate, int daysAdmitted) {
super(patientId, name, age);
this.dailyRate = dailyRate;
this.daysAdmitted = daysAdmitted;
this.records = new ArrayList<>();
}

@Override
public double calculateBill() {
return dailyRate * daysAdmitted;
}

@Override
public void addRecord(String record) {
records.add(record);
}

@Override
public List<String> viewRecords() {
return records;
}
}

// OutPatient class
class OutPatient extends Patient {
private double consultationFee;

public OutPatient(String patientId, String name, int age, double consultationFee) {
super(patientId, name, age);
this.consultationFee = consultationFee;
}

@Override
public double calculateBill() {
return consultationFee;
}
}

