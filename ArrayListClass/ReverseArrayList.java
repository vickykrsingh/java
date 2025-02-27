package ArrayListClass;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void reverse(ArrayList<Integer> a1){
        int i = 0, j = a1.size()-1;

        while (i<j) {
            Integer temp = Integer.valueOf(a1.get(i));
            a1.set(i, a1.get(j));
            a1.set(j, temp);
            i++;
            j--;
        }
        System.out.println(a1);
    }
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(3);
        a1.add(4);
        a1.add(5);
        a1.add(6);
        a1.add(7);
        a1.add(8);
        System.out.println(a1);
        // using user defined method
        // reverse(a1);
        // using collection framework in-built method
        Collections.reverse(a1);
        System.out.println(a1);
    }
}
