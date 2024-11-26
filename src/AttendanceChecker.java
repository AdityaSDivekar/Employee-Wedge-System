import java.util.Random;

public class AttendanceChecker {
    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();
        final int FULL_TIME_HOURS = 12;
        final int PART_TIME_HOURS = 8;
        final int WAGE_PER_HOUR = 20;

        // Generate a random number: 0 or 1
        int workHours = 0;
        int attendance=random.nextInt(3);
        switch(attendance){
            case 0:
                System.out.println("Employee is Absent.");
                workHours=0;
                break;
            case 1:
                System.out.println("Employee is Part-Time.");
                workHours = PART_TIME_HOURS;
                break;

            case 2:
                System.out.println("Employee is Full-Time.");
                workHours = FULL_TIME_HOURS;
                break;

            default:
                System.out.println("Invalid attendance status.");
                workHours = 0;
                break;


        }

        int dailyWage = workHours * WAGE_PER_HOUR;


        System.out.println("Daily Wage: $" + dailyWage);
    }
}
