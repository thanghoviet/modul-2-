import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int i=2;
    int number;
    boolean check=true;


    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number:");
     number = scanner.nextInt();

        while (i <= Math.sqrt(number)) {
            if (number % i == 0) {
                check = false;
                break;
            }
            i++;
        }

        if (check)
            System.out.println(number + " is a prime.");
        else
            System.out.println(number + " is not a prime.");

    }
}
