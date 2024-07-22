package day8_StringMethods;

public class contains {
    public static void main(String[] args) {

// contains()
// проверка является ли одна строка подстрокой другой строки

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
    }
}
