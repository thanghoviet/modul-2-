public class Main {
    public static void main(String[] args) {
        int[] arr={2,654,64,531,9,265};
        int index=minValue(arr);
        System.out.println("gia tri nho nhat trong mang la:" + minValue(arr));

    }
    public static int minValue(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
    return min;
    }
}
