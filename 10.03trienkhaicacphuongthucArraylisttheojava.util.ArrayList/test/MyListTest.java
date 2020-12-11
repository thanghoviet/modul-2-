import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MyListTest<E> {

    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(8);
        myList.add(9);
        arrayList.add(5);

        System.out.println("integer<my list>:"+ Arrays.toString(myList.getElementList()));
        System.out.println("integer<my list>:"+arrayList);

    }
}