import java.util.Random;

public class AttendanceChecker {
    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();
        final int FULL_TIME_HOURS = 12;
        final int PART_TIME_HOURS = 8;
        final int WAGE_PER_HOUR = 20;
        final int WORKING_DAYS=20;

        int totalMonthlyWage = 0;
        System.out.println("Daily Wage Details:");

        for (int day = 1; day <= WORKING_DAYS; day++) {

        int workHours = 0;
        int attendance=random.nextInt(3);
            String attendanceStatus;

        switch(attendance){
            case 0:
                attendanceStatus="Absent";
                workHours=0;
                break;
            case 1:
                attendanceStatus="Part-Time";
                workHours = PART_TIME_HOURS;
                break;

            case 2:
                attendanceStatus=" Full-Time";
                workHours = FULL_TIME_HOURS;
                break;

            default:
                attendanceStatus="Unknown";
                workHours = 0;
                break;


        }
            int dailyWage = workHours * WAGE_PER_HOUR;
            totalMonthlyWage += dailyWage;

            System.out.println("Day " + day + ": " + attendanceStatus + " - Daily Wage: $" + dailyWage);
        }




            System.out.println("\nTotal Monthly Wage: $" + totalMonthlyWage);

    }
}
