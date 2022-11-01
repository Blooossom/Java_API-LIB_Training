package regex;
import java.util.regex.Pattern;
public class PatternMatches {
    public static void main(String[] args) {

        //정규표현식 작성
        String a = "[ABC][@][ABC]";

        //검사할 문자
        String c = "A@C";
        System.out.println(Pattern.matches(a,c));
    }
}
