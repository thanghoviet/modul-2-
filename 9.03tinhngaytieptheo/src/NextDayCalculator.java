import java.util.Scanner;

public class NextDayCalculator {

//    public static void main(String[] args) {
//        String Time;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("year:");
//        int year = scanner.nextInt();
//        System.out.println("month:");
//        int month = scanner.nextInt();
//        System.out.println("days:");
//        int days = scanner.nextInt();
//
//        getNextDay(days, month, year);
//    }

    public static String getNextDay(int days, int month, int year) {
        int maxDayOfMonth = getMaxDayOfMonth(month, year);
        if (maxDayOfMonth == -1 || days < 0 || days > maxDayOfMonth )
            return "Nhap sai";

        if (++days > maxDayOfMonth) {
            ++month;
            days = 1;
        }
        if (month > 12) {
            days = 1;
            month = 1;
            year++;
        }

        return (days + "/" + month + "/" + year);
    }

    private static int getMaxDayOfMonth(int month, int year) {
        int maxDayOfMonth;
        switch (month) {
            case 2:
                maxDayOfMonth = isLeapYear(year) ? 28 : 29;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                maxDayOfMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDayOfMonth = 30;
                break;
            default:
                maxDayOfMonth = -1;
        }
        return maxDayOfMonth;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}

