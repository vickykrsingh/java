package ArrayListClass;

import java.util.ArrayList;
import java.util.Collections;

public class SortInDesc {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(23);
        list.add(55);
        list.add(12);
        list.add(65);
        list.add(2);
        System.out.println(list);
        // sort in ascending order
        Collections.sort(list);
        System.out.println(list);
        // sort in descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("how");
        arr.add("to");
        arr.add("lock");
        arr.add("aim");
        arr.add("perfectly");
        System.out.println(arr);
        // reverse/descending order sorting
        Collections.sort(arr,Collections.reverseOrder());
        System.out.println(arr);
        // ascending order sorting
        Collections.sort(arr);
        System.out.println(arr);
    }
}
