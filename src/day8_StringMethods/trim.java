package day8_StringMethods;

public class trim {
    public static void main(String[] args) {

// удаление пробелов справа и слева
        String s4 = "   string with spaces   ";

        System.out.println("here is a string with right and left spaces: " + s4);
        System.out.println("here is a string without side spaces: " + s4.trim());

        // Кстати при вычислении длины строки, пробелы также считаются как символ:
        System.out.println("string len with spaces: " + s4.length());  // 24
        System.out.println("string len without spaces: " + s4.trim().length());  // 18
    }
}
