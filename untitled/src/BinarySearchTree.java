import java.util.Scanner;

public class BinarySearchTree {
    public static void main(String[] args) {
//        4
        Scanner scanner = new Scanner(System.in);
        int[] arr = {2, 4, 5, 7, 8, 23, 54, 65, 67};
        int left = 0;
        int right = arr.length - 1;

        System.out.println("Enter key");
        int key = scanner.nextInt();
        int result = -1;
        while (right >= left) {
            int mid = (right + left) / 2;
            if (key > arr[mid]) {
                left = mid + 1;
            } else if (key == arr[mid]) {
                result = mid;
                break;
            } else {
                right = mid - 1;
            }
        }
        if (result != -1) {
            System.out.println(result);
        } else {
            System.out.println("khong tim thay");
        }
    }
}
