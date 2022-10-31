package collectionFrameWork;

import java.lang.reflect.Array;
import java.util.*;

public class CollectionsDisjoint {
    public static void main(String[] args) {
        Integer[] list = {1123, 1412, 23, 44, 512132};
        List<Integer>arr = new ArrayList<>(Arrays.asList(list));

        Integer[] list2 = {121, 23542, 123, 1, 412234};
        List<Integer>arr2 = new ArrayList<>(Arrays.asList(list2));

        Integer[] list3 = {1, 2, 3, 4, 5};
        List<Integer>arr3 = new ArrayList<>(Arrays.asList(list3));

        System.out.println(Collections.disjoint(arr, arr2));
        System.out.println(Collections.disjoint(arr2, arr3));
    }
}
