public class PenDistribution {
    public static void main(String[] args) {
        int totalPens = 14;
        int numberOfStudents = 3;

        int pensPerStudent = totalPens / numberOfStudents;
        int remainingPens = totalPens % numberOfStudents;

        // Output the result
        System.out.println("The pens per student is " + pensPerStudent 
                           + " and the remaining pens not distributed is " + remainingPens);
    }
}
