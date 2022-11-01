package collectionFrameWork;

import java.util.SortedMap;

import java.util.TreeMap;

public class TreeMapHeadMap {
    public static void main(String[] args) {
        TreeMap<String, String>list = new TreeMap<String, String>();

        String[] key = {"z","a","b","c","d","e"};
        String[] value = {"zip","apple","banana","candy","dog","enum"};

        for (int i = 0; i < key.length; i++) {
            list.put(key[i],value[i]);
        }
        SortedMap<String, String> s = list.headMap("d");
        System.out.println(s);

        SortedMap<String, String> s2 = list.headMap("d",true);
        System.out.println(s2);

    }
}
