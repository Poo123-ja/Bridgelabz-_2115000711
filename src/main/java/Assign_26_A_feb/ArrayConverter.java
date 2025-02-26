package Assign_26_A_feb;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.util.Arrays;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class ArrayConverter {
    public static void main(String[] args) {
        try {
            List<Person> people = Arrays.asList(
                    new Person("Kanhaiya", 22),
                    new Person("Shyam", 23),
                    new Person("Sundar", 28)
            );

            ObjectMapper objectMapper = new ObjectMapper();
            String jsonArray = objectMapper.writeValueAsString(people);
            System.out.println(jsonArray);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
