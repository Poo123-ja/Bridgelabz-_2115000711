package Assign_26_A_feb;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;


public class Age {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            List<Person> people = objectMapper.readValue(
                    new File("C:Users/POOJA/Desktop/Capgemini_Training/src/main/java/Assign_26_A_feb/people.json"),
                    new TypeReference<List<Person>>() {
                    }
            );
            List<Person> filteredPeople = people.stream()
                    .filter(person -> person.getAge() > 25)
                    .collect(Collectors.toList());
            String jsonOutput = objectMapper.writeValueAsString(filteredPeople);
            System.out.println("Filtered JSON: " + jsonOutput);

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }
}
