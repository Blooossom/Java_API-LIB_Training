package regex;
import java.util.regex.Pattern;
public class PatternCompile {
    public static void main(String[] args) {

        //정규표현식 작성
        String a = "[ABC][@][ABC]";
        Pattern regex = Pattern.compile(a);

        System.out.println(regex);
    }
}
