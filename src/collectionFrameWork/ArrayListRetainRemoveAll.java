package collectionFrameWork;

import java.util.ArrayList;

public class ArrayListRetainRemoveAll {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(3);
        list2.add(5);

        ArrayList<Integer> list3 = new ArrayList<Integer>();
        list3.add(3);
        list3.add(7);
        list3.add(10);

        list.retainAll(list2);
        System.out.println(list);
        list.removeAll(list3);
        System.out.println(list);
    }
}
