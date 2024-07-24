package day9;

public class StringComparison {
    public static void main(String[] args) {

        // При создании строк таким способом, разницы между '==' и equals() нету
        String s1 = "Welcome";
        String s2 = "Welcome";

        System.out.println(s1 == s2);  // true
        System.out.println(s1.equals(s2));  // true
    }
}
