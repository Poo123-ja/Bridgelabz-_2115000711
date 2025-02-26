package Assign_26_A_feb;

import org.json.JSONArray;
import org.json.JSONObject;

public class StudentJSON {
    public static void main(String[] args) {
        JSONObject student = new JSONObject();
        student.put("name", "pooja");
        student.put("age", 20);
        JSONArray subjects = new JSONArray();
        subjects.put("Mathematics");
        subjects.put("Physics");
        subjects.put("Chemistry");
        student.put("subjects", subjects);
        System.out.println(student.toString(4));
    }
}
