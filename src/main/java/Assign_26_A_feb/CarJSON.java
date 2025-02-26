
package Assign_26_A_feb;


import com.fasterxml.jackson.databind.ObjectMapper;

class Car {
    private String brand;
    private String model;
    private int year;

    public Car() {} // Default constructor (required for Jackson)

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public static void main(String[] args) {
        try {
            Car car = new Car("Toyota", "Corolla", 2023);

            // Convert Java Object to JSON
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonString = objectMapper.writeValueAsString(car);

            System.out.println("JSON Output: " + jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
