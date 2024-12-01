import java.util.Random;

public class EmployeeWage {
    private static final int FULL_TIME_HOURS = 12;
    private static final int PART_TIME_HOURS = 8;




    public static void computeEmployeeWage(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;
        int totalMonthlyWage = 0;
        Random random = new Random();
        System.out.println("\nCalculating wage for " + companyName);
        System.out.println("Daily Wage Details:");
        while (totalWorkingDays < maxWorkingDays && totalWorkingHours < maxWorkingHours) {
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

            if (totalWorkingHours + workHours > maxWorkingHours) {
                workHours = maxWorkingHours - totalWorkingHours;
            }

            if (totalWorkingHours + workHours > maxWorkingHours) {
                workHours = maxWorkingHours - totalWorkingHours;
            }

            totalWorkingHours += workHours;
            totalWorkingDays++;
            int dailyWage =  workHours * wagePerHour;
            totalMonthlyWage += dailyWage;

            System.out.println("Day " + totalWorkingDays + ": " + attendanceStatus + " - Daily Wage: $"
                    + dailyWage + " - Total Hours Worked: " + totalWorkingHours);
        }

        printSummary(companyName, totalWorkingDays, totalWorkingHours, totalMonthlyWage);
    }

    private static void printSummary(String companyName, int totalWorkingDays, int totalWorkingHours, int totalMonthlyWage) {
        System.out.println("\nSummary for " + companyName + ":");
        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Total Monthly Wage: $" + totalMonthlyWage);
    }



    public static void main(String[] args) {
        computeEmployeeWage("Company A",20,20,100);
        computeEmployeeWage("Company B", 25, 22, 120);
        computeEmployeeWage("Company C", 15, 18, 80);
    }
}
