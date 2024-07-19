package day8;

public class StringMethods {
    public static void main(String[] args) {

// length() - определение длины строки
        String s = "Hello World";
        System.out.println("s length is " + s.length()); // 11


// concat() - сложение строк
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


// trim() - удаление пробелов справа и слева
        String s4 = "   string with spaces   ";

        System.out.println("here is a string with right and left spaces: " + s4);
        System.out.println("here is a string without side spaces: " + s4.trim());

        // Кстати при вычислении длины строки, пробелы также считаются как символ:
        System.out.println("string length with spaces: " + s4.length());  // 24
        System.out.println("string length without spaces: " + s4.trim().length());  // 18



    }
}
