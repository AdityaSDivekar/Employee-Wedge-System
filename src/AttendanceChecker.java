import java.util.Random;

public class AttendanceChecker {
    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();
        final int FULL_TIME_HOURS = 12;
        final int PART_TIME_HOURS = 8;
        final int WAGE_PER_HOUR = 20;

        // Generate a random number: 0 or 1
        int randomValue = random.nextInt(3); // 0 or 1
        int workHours = 0;
        String attendance;
        if (randomValue == 0) {
            attendance = "Absent";
            workHours = 0;
        } else if (randomValue == 1) {
            attendance = "Part-Time";
            workHours = PART_TIME_HOURS;
        } else {
            attendance = "Full-Time";
            workHours = FULL_TIME_HOURS;
        }

        int dailyWage = workHours * WAGE_PER_HOUR;


        System.out.println("Employee is " + attendance);
        System.out.println("Daily Wage: $" + dailyWage);
    }
}
