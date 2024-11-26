import java.util.Random;

public class AttendanceChecker {
    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();
        final int FULL_TIME_HOURS = 12;
        final int PART_TIME_HOURS = 8;
        final int WAGE_PER_HOUR = 20;
        final int MAX_WORKING_DAYS = 20;
        final int MAX_WORKING_HOURS = 100;

        int totalWorkingHours = 0;
        int totalWorkingDays = 0;
        int totalMonthlyWage = 0;
        System.out.println("Daily Wage Details:");

        while (totalWorkingDays < MAX_WORKING_DAYS && totalWorkingHours < MAX_WORKING_HOURS) {
            int workHours = 0;
            int attendance = random.nextInt(3);
            String attendanceStatus;

            switch (attendance) {
                case 0:
                    attendanceStatus = "Absent";
                    workHours = 0;
                    break;
                case 1:
                    attendanceStatus = "Part-Time";
                    workHours = PART_TIME_HOURS;
                    break;

                case 2:
                    attendanceStatus = " Full-Time";
                    workHours = FULL_TIME_HOURS;
                    break;

                default:
                    attendanceStatus = "Unknown";
                    workHours = 0;
                    break;


            }
            if (totalWorkingHours + workHours > MAX_WORKING_HOURS) {
                workHours = MAX_WORKING_HOURS - totalWorkingHours;
            }
            totalWorkingHours += workHours;
            totalWorkingDays++;
            int dailyWage = workHours * WAGE_PER_HOUR;
            totalMonthlyWage += dailyWage;
            System.out.println("Day " + totalWorkingDays + ": " + attendanceStatus + " - Daily Wage: $" + dailyWage + " - Total Hours Worked: " + totalWorkingHours);
            if (totalWorkingHours >= MAX_WORKING_HOURS) {
                break;
            }

        }
        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Total Monthly Wage: $" + totalMonthlyWage);
    }
}
