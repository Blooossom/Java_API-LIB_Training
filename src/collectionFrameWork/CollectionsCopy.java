package collectionFrameWork;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class CollectionsCopy {
    public static void main(String[] args) {
        List<Integer> source = new ArrayList<>();
        source.add(1000);
        source.add(2000);
        System.out.println(source.size());

        List<Integer> dest = new ArrayList<>();
        dest.add(10);
        System.out.println(dest.size());

        /*
        Collections.copy(dest, source);
        System.out.println(dest);
        dest의 사이즈가 source 보다 작기 때문에 오류
         */

        dest.add(100);
        dest.add(101);
        System.out.println(dest.size());

        Collections.copy(dest, source);
        System.out.println(dest);
    }
}
