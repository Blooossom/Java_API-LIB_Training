package regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class MatcherClassCreate {
    public static void main(String[] args) {

        //정규표현식 작성
        String a = "[ABC][@][ABC]";
        Pattern regex = Pattern.compile(a);

        //비교문자열 생성
        String c = "A@C";
        Matcher comp = regex.matcher(c);

        //정규표현식 맞는지 비교
        System.out.println(comp.matches());
    }
}
