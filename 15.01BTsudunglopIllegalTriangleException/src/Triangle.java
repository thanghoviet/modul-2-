import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int canh1, canh2, canh3;
        System.out.println("nhập vào độ dài cạnh 1");
        canh1 = scanner.nextInt();
        System.out.println("nhập vào độ dài cạnh 1");
        canh2 = scanner.nextInt();
        System.out.println("nhập vào độ dài cạnh 1");
        canh3 = scanner.nextInt();

        try {
            CheckTriangle(canh1, canh2, canh3);

        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void CheckTriangle(int canh1, int canh2, int canh3) throws IllegalTriangleException {
        if (!(canh1 + canh2 - canh3 > 0) || !(canh1 + canh3 - canh2 > 0) || !(canh2 + canh3 - canh1 > 0)) {
            throw new IllegalTriangleException("tam giac khong hop le");
        }
        System.out.println("tam giac ok");
    }
}
