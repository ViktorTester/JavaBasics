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


// charAt() - возвращает конкретный символ строки по его индексу
        String s5 = "Welcome";

        System.out.println("The s5 string index 3 element is: " + s5.charAt(3)); // с
        System.out.println("The s5 string last index element is: " + s5.charAt(6)); // e


// contains() - проверка является ли одна строка подстрокой другой строки
        String s6 = "Welcome World";
        String s7 = "World";


        // Метод всегда возвращает булево значение.
        // Регистр символов учитывается

        // Содержится ли в строке s6 подстрока s7
        System.out.println(s6.contains(s7)); // true
        System.out.println(s6.contains("world")); // false
        System.out.println(s6.contains("wor")); // false
        System.out.println(s6.contains("Wor")); // true
        System.out.println(s6.contains("Welme")); // false


// equals() - сравнение двух строк
// equalsIgnoreCase() - сравнение двух строк (игнорируя регистр)

        String s8 = "welcome";
        String s9 = "welcome";
        String s10 = "WElcome";

        // Метод всегда возвращает булево значение

        // Зачастую метод equals() идентичен "==", но не всегда
        System.out.println(s8 == s9); // true
        System.out.println(s8.equals(s9)); // true
        System.out.println(s8.equals(s10)); // false
        System.out.println(s8.equalsIgnoreCase(s10)); // true
    }
}
