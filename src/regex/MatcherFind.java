package regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MatcherFind {
    public static void main(String[] args) {
        String a = "([ABC][@][ABC])|([XYZ][#][XYZ])";
        Pattern regex = Pattern.compile(a);

        String c="A@C매칭되지않는문자열X#Y";
        Matcher comp = regex.matcher(c);

        System.out.println(comp.find());
        System.out.println(comp.find());
        System.out.println(comp.find());
        System.out.println(comp.find(0));
    }
}
