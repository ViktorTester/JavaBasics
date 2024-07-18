package day8;

public class StringMethods {
    public static void main(String[] args) {

// length() - определение длины строки
        String s = "Hello World";
        System.out.println("s length is " + s.length());

// concat() - сложение строк
        String s1 = "Hello";
        String s2 = "World";

        // Две строки ниже одинаковы по значению
        System.out.println("Common method = " + s1 + s2);
        System.out.println("Concat method = " + s1.concat(s2));
    }
}
