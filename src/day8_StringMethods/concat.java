package day8_StringMethods;

public class concat {
    public static void main(String[] args) {

// concat()
// сложение строк

        String s1 = "Hello";
        String s2 = "World";
        String s3 = "test";

        // Две строки ниже одинаковы по значению
        // Однако метод concat() может сложить только 2 строки за раз, а прямая
        // конкатенация через '+' позволяет складывать сколько угодно строк
        System.out.println("Common method = " + s1 + s2);
        System.out.println("Concat method = " + s1.concat(s2));

        // Либо придется прибегать к такому способу:
        System.out.println("Three string using concat() methods: " + s1.concat(s2).concat(s3));

        // Способы конкатенации можно совмещать:
        System.out.println("Combined concatenation - " + s1.concat(s2 + s3));

        // Можно и не использовать переменные:
        System.out.println("Welcome".concat(" to" + " Java"));
    }
}
