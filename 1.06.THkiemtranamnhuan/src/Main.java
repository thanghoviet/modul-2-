import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        boolean namNhuan = false;

        System.out.println("Ban muon xem nam nao:");
        year = scanner.nextInt();

        boolean chiaHetCho4 = year % 4 == 0;
        if(chiaHetCho4){
            boolean chiaHetCho100 = year % 100 == 0;
            if(chiaHetCho100){
                boolean chiaHetCho400 = year % 400 == 0;
                if(chiaHetCho400){
                    namNhuan = true;
                }
            } else {
                namNhuan = true;
            }
        }

        if(namNhuan){
            System.out.printf("%d la nam nhuan", year);
        } else {
            System.out.printf("%d khong phai la nam nhuan", year);
        }
    }
}
