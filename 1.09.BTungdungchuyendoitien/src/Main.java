import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Số USD bạn muốn đổi :");
        int USD = sc.nextInt();

        int VND = USD * 23000;
        System.out.println(NumberFormat.getCurrencyInstance(new Locale("vi", "VN")).format(VND));

        System.out.printf("bạn sẽ có %d VND", VND );

    }
}

