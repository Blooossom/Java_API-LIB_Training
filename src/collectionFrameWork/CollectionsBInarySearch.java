package collectionFrameWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsBInarySearch {
    public static void main(String[] args) {
        Integer[] list = {1123,1412,23,44,512232,44};
        List<Integer> arr = new ArrayList<>(Arrays.asList(list));
        System.out.println(Collections.binarySearch(arr,44));
    }
}
