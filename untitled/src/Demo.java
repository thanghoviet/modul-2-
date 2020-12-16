import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 4, 5, 7, 8, 23, 54, 65, 67};
        int left = 0;
        int right = arr.length - 1;
        int key = sc.nextInt();
        sc.nextLine();
        System.out.println(find(arr, left, right, key));
    }

    public static int find(int[] arr, int left, int right, int key) {
        if (left > right) return -1;
        int mid = (left + right) / 2;
        if (key == arr[mid]) return mid;
        if (key < arr[mid]) {
            right = mid - 1;
        }
        if (key > arr[mid]) {
            left = mid + 1;
        }
        return find(arr, left, right, key);
    }
}
