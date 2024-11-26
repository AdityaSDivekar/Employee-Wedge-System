import java.util.Random;

public class AttendanceChecker {
    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();

        // Generate a random number: 0 or 1
        int randomValue = random.nextInt(2); // 0 or 1

        // Check attendance
        String attendance = (randomValue == 1) ? "Present" : "Absent";

        // Print the result
        System.out.println("Employee is " + attendance);
    }}
