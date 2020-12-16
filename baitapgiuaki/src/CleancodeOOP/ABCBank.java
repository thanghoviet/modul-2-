package CleancodeOOP;


import java.util.Scanner;

public class ABCBank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckYourMoney check= new CheckYourMoney();
        String name = "Nguyen Van A";
        int monney = 1200000;
        String choice;
        do {
        check.Menu();
        choice = scanner.nextLine();
            switch (choice) {
                case "A" -> check.CheckMonney();
                case "B" -> check.Payment();
                case "C" -> check.Withdrawal();
                case "D" -> check.History();
                case "X" -> System.exit(0);
                default -> System.out.println("Ban nhap sai chuc nang" +
                        "Bam nut theo menu de tiep tuc giao dich");
            }
        } while (true);
    }
}



