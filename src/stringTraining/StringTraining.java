package stringTraining;

public class StringTraining {
    public static void main(String[] args) {
        String str = "Hello World";
        String str1 = "hellO woRlD";
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.isEmpty());
        System.out.println(str.indexOf('o'));
        System.out.println(str.lastIndexOf('o'));
        System.out.println(str.startsWith("H"));
        System.out.println(str.endsWith("d"));
        System.out.println(str.concat(str1));
        System.out.println(str.replace('e','a'));
        System.out.println(str.substring(1,3));
        char[] temp = {'G','o','o','d','d','a','y','c','o','m','a','n','d','o'};
        System.out.println(String.valueOf(temp));
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println();

    }
}
