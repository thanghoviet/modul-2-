import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stacks = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scanner.nextInt();
        while (num != 0 && num > 0) {
            int surplus = num % 2;
            num = num / 2;
            stacks.push(surplus);
        }

        int size = stacks.size();
        int[] arr = new int[size];
        int manhiphan;
        for (int i = 0; i < size; i++) {
            manhiphan = stacks.pop();
            arr[i] = manhiphan;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
