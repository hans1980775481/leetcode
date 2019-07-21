package PascalsTriangle.XMHans;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrTOListTest {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,43,5,6,72,2,0};

        List<Integer> list = new ArrayList<>();

//        Collections.addAll(list,arr);
        List<Integer> list1 = new ArrayList(Arrays.asList(arr));

        System.out.println(list1.get(1));

        System.out.println(list1.size());
        for (int x :
                list1) {
            System.out.println(x);
        }
    }
}
