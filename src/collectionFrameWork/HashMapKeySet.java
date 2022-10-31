package collectionFrameWork;

import java.util.HashMap;

public class HashMapKeySet {
    public static void main(String[] args) {
        HashMap<String, String> list = new HashMap<String, String>();

        String[] key = {"a","b","c","d","e"};
        String[] value = {"apple","banana","candy","dog","enum"};

        for (int i = 0; i <key.length; i++) {
            list.put(key[i],value[i]);
        }
        System.out.println(list.keySet());
        System.out.println(list.values());
    }
}
