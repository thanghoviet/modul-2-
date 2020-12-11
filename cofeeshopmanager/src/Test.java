import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Đỗ Quang Phước",0001,18,"HUế",512345,"Nam") ;
        Drinks cafe = new Drinks("coffee",1,"coffee milk",12.000);
//        Bill bill= new Bill(1,20/11,getName(),3,32);
        BillDetails billDetail1 = new BillDetails(cafe, 3);
        BillDetails billDetail2 = new BillDetails(cafe, 2);
        ArrayList<BillDetails> billDetails = new ArrayList<>();
        Bill bill = new Bill(035,"10/10/2020",employee1,3,billDetails);
        bill.getBill();
        billDetails.add(billDetail1);
        billDetails.add(billDetail2);
        System.out.println(billDetail1);
    }
}
