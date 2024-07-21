package day8;

public class equals {
    public static void main(String[] args) {

// equals()
// сравнение двух строк

// equalsIgnoreCase()
// сравнение двух строк (игнорируя регистр)

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
