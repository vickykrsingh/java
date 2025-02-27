package ArrayListClass;

import java.util.ArrayList;

public class ALPart1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(33);
        arr.add(45);
        arr.add(23);

        System.out.println(arr);

        System.out.println(arr.get(2));
        arr.add(1,46);
        System.out.println(arr);

        arr.set(0, 4);
        System.out.println(arr);

        arr.remove(2);
        System.out.println(arr);

        arr.remove(Integer.valueOf(46)); // if exists it delete the element if not then it don't do anything just execute code without throwing any error. and return type is boolean either true or false if element found it will return ture otherwise it will return false.
        System.out.println(arr);

        for(int i = 0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();

        System.out.println(arr.contains(237));

        // array list also contain different types of data types in a single array list
        // ArrayList a1 = new ArrayList();
        // a1.add("vicky");
        // a1.add(true);
        // a1.add(23);

        // System.out.println(a1);
    }
}
