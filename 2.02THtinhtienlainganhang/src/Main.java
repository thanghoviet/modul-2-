import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double money = 1.0;
        double interset_rate = 1;
        int month = 1;
        double total_interset = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("monney: ");
        money = input.nextDouble();
        System.out.println("months: ");
        month = input.nextInt();
        System.out.println("rate: ");
        interset_rate = input.nextDouble();

        for (int i = 0; i < month; i++) {
            total_interset += money * (interset_rate / 100) / 12 * month;
        }
            System.out.println("Total of interset: " + NumberFormat.getCurrencyInstance(new Locale("vi", "VN")).format(total_interset));
    }
}
