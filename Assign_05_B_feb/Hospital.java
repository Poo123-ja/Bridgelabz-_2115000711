import java.util.ArrayList;
public class Main {
public static void main(String[] args) {
Hospital hospital=new Hospital("City Hospital");

Doctor doctor1=new Doctor("Dr. Ankur");
Doctor doctor2=new Doctor("Dr. Nitranjan");

Patient patient1=new Patient("Aman");
Patient patient2=new Patient("Nisha");

hospital.addDoctor(doctor1);
hospital.addDoctor(doctor2);

hospital.addPatient(patient1);
hospital.addPatient(patient2);

doctor1.consult(patient1);
doctor1.consult(patient2);
doctor2.consult(patient1);

patient1.viewConsultedDoctors();
patient2.viewConsultedDoctors();

doctor1.viewConsultedPatients();
doctor2.viewConsultedPatients();
}
}

class Hospital {
String name;
ArrayList<Doctor> doctors;
ArrayList<Patient> patients;

Hospital(String name) {
this.name=name;
this.doctors=new ArrayList<>();
this.patients=new ArrayList<>();
}

void addDoctor(Doctor doctor) {
doctors.add(doctor);
}

void addPatient(Patient patient) {
patients.add(patient);
}
}

class Doctor {
String name;
ArrayList<Patient> patients;

Doctor(String name) {
this.name=name;
this.patients=new ArrayList<>();
}

void consult(Patient patient) {
patients.add(patient);
patient.addDoctor(this);
System.out.println(name+" is consulting "+patient.name);
}

void viewConsultedPatients() {
System.out.println(name+" has consulted:");
for(Patient patient:patients) {
System.out.println("-"+patient.name);
}
}
}

class Patient {
String name;
ArrayList<Doctor> doctors;

Patient(String name) {
this.name=name;
this.doctors=new ArrayList<>();
}

void addDoctor(Doctor doctor) {
doctors.add(doctor);
}

void viewConsultedDoctors() {
System.out.println(name+" has consulted:");
for(Doctor doctor:doctors) {
System.out.println("-"+doctor.name);
}
}
}
