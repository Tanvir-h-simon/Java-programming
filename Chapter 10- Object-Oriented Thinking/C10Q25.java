public class C10Q25 {
    public static String[] split(String s, String regex) {
        // Use a regular expression to match delimiters and substrings
        String[] parts = s.split("(?=" + regex + ")|(?<=" + regex + ")");
        return parts;
    }

    public static void main(String[] args) {
        String[] result1 = split("ab#12#453", "#");
        for (String str : result1) {
            System.out.println(str);
        }

        System.out.println();

        String[] result2 = split("a?b?gf#e", "[?#]");
        for (String str : result2) {
            System.out.println(str);
        }
    }
}
