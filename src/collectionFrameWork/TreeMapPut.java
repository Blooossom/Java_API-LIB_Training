package collectionFrameWork;

import java.util.TreeMap;

public class TreeMapPut {
    public static void main(String[] args) {
        TreeMap<String, String> list = new TreeMap<String, String>();

        String[] key = {"a", "b", "c", "d","e"};
        String[] value = {"apple","banana","candy","dog","enum"};

        for (int i = 0; i <key.length; i++) {
            list.put(key[i],value[i]);
        }
        System.out.println(list);
    }
}
