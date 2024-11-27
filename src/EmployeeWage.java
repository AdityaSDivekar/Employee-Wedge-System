import java.util.Random;

public class EmployeeWage {
    private static final int FULL_TIME_HOURS = 12;
    private static final int PART_TIME_HOURS = 8;
    private static final int WAGE_PER_HOUR = 20;
    private static final int MAX_WORKING_DAYS = 20;
    private static final int MAX_WORKING_HOURS = 100;

    private int totalWorkingHours = 0;
    private int totalWorkingDays = 0;
    private int totalMonthlyWage = 0;

    public void computeEmployeeWage() {
        Random random = new Random();
        System.out.println("Daily Wage Details:");

        while (totalWorkingDays < MAX_WORKING_DAYS && totalWorkingHours < MAX_WORKING_HOURS) {
            int workHours = 0;
            String attendanceStatus;

            switch (random.nextInt(3)) {
                case 0:
                    attendanceStatus = "Absent";
                    workHours = 0;
                    break;
                case 1:
                    attendanceStatus = "Part-Time";
                    workHours = PART_TIME_HOURS;
                    break;
                case 2:
                    attendanceStatus = "Full-Time";
                    workHours = FULL_TIME_HOURS;
                    break;
                default:
                    attendanceStatus = "Unknown";
            }

            if (totalWorkingHours + workHours > MAX_WORKING_HOURS) {
                workHours = MAX_WORKING_HOURS - totalWorkingHours;
            }

            totalWorkingHours += workHours;
            totalWorkingDays++;
            int dailyWage = calculateDailyWage(workHours);
            totalMonthlyWage += dailyWage;

            System.out.println("Day " + totalWorkingDays + ": " + attendanceStatus + " - Daily Wage: $"
                    + dailyWage + " - Total Hours Worked: " + totalWorkingHours);
        }

        printSummary();
    }

    private int calculateDailyWage(int workHours) {
        return workHours * WAGE_PER_HOUR;
    }

    private void printSummary() {
        System.out.println("\nSummary:");
        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Total Monthly Wage: $" + totalMonthlyWage);
    }

    public static void main(String[] args) {
        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.computeEmployeeWage();
    }
}
