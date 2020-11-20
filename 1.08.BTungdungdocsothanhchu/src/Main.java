import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cannang;
        Scanner sc=new Scanner(System.in);
        System.out.print("xin nhap vao can nang(kg):");
        cannang = sc.nextInt();
        if (0 < cannang && cannang <10){
            switch (cannang) {
                case 1:
                    System.out.print("Mot");
                    break;
                case 2:
                    System.out.print("Hai");
                    break;
                case 3:
                    System.out.print("Ba");
                    break;
                case 4:
                    System.out.print("Bon");
                    break;
                case 5:
                    System.out.print("Nam");
                    break;
                case 6:
                    System.out.print("Sau");
                    break;
                case 7:
                    System.out.print("Bay");
                    break;
                case 8:
                    System.out.print("Tam");
                    break;
                case 9:
                    System.out.print("Chin");
                    break;
            }
            }else {
                if (10 <= cannang && cannang < 20) {
                    switch (cannang - 10) {
                        case 1:
                            System.out.print("Muoi");
                            break;
                        case 2:
                            System.out.print("Muoi Mot");
                            break;
                        case 3:
                            System.out.print("Muoi Hai");
                            break;
                        case 4:
                            System.out.print("Muoi Ba");
                            break;
                        case 5:
                            System.out.print("Muoi Bon");
                            break;
                        case 6:
                            System.out.print("Muoi Nam");
                            break;
                        case 7:
                            System.out.print("Muoi Sau");
                            break;
                        case 8:
                            System.out.print("Muoi Bay");
                            break;
                        case 9:
                            System.out.print("Muoi Tam");
                            break;
                        case 10:
                            System.out.print("Muoi Chin");
                            break;
                    }
                }else {
                    if (20<cannang && cannang<100) {
                        switch (cannang / 10) {
                            case 1:
                                System.out.print("Mot");
                                break;
                            case 2:
                                System.out.print("Hai");
                                break;
                            case 3:
                                System.out.print("Ba");
                                break;
                            case 4:
                                System.out.print("Bon");
                                break;
                            case 5:
                                System.out.print("Nam");
                                break;
                            case 6:
                                System.out.print("Sau");
                                break;
                            case 7:
                                System.out.print("Bay");
                                break;
                            case 8:
                                System.out.print("Tam");
                                break;
                            case 9:
                                System.out.print("Chin");
                                break;
                        }
                        switch (cannang % 10) {
                            case 1:
                                System.out.print("Mot");
                                break;
                            case 2:
                                System.out.print("Hai");
                                break;
                            case 3:
                                System.out.print("Ba");
                                break;
                            case 4:
                                System.out.print("Bon");
                                break;
                            case 5:
                                System.out.print("Nam");
                                break;
                            case 6:
                                System.out.print("Sau");
                                break;
                            case 7:
                                System.out.print("Bay");
                                break;
                            case 8:
                                System.out.print("Tam");
                                break;
                            case 9:
                                System.out.print("Chin");
                                break;
                        }
                    }
                }
            }
        }
    }

