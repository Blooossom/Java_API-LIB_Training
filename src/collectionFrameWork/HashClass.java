package collectionFrameWork;
import java.util.HashSet;
import java.util.TreeSet;
public class HashClass {
    public static void main(String[] args) {
        String[] value = {"zip", "banana", "apple", "candy", "enum", "dog","dog","enum"};
        HashSet<String> list = new HashSet<String>();

        for (int i = 0; i <value.length; i++) {
            list.add(value[i]);
        }
        System.out.println(list);
        HashSet<String>list2 = new HashSet<String>();
        list2.add("apple");
        list2.add("추가");
        list2.add("추가추가");
        list.addAll(list2);
        System.out.println(list);
    }

}
