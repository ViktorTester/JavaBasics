package day17;

import java.util.ArrayList;

public class DataConversionMethods {
    public static void main(String[] args) {

    // String -> int
        String s1 = "10";
        String s2 = "20";
        System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));  // 30

    // String -> double
        String s3 = "10.5";
        String s4 = "15.60";

        System.out.println(Double.parseDouble(s3) + Double.parseDouble(s4));  // 26.1

    // String -> boolean
        String s5 = "true";
        String s6 = "False";
        String s7 = "hello";

        System.out.println(Boolean.parseBoolean(s5));  // true
        System.out.println(Boolean.parseBoolean(s6));  // false
        // Если передать что угодно кроме true, ответ всегда будет false
        System.out.println(Boolean.parseBoolean(s7));  // false

    // Convert into string
        int a = 10;
        double d = 10.5;
        char C = 'A';
        boolean bool = true;

        // В отличие от конвертации различных типов данных в строку, при обратной
        // конвертации есть только один метод - String.valueOf()

        System.out.println(String.valueOf(a) + " Hello");  // 10 Hello
        System.out.println(String.valueOf(d) + " its a 10 and 5");  // 10.5 it's a 10 and 5
        System.out.println(String.valueOf(C) + "n Elephant");  // An Elephant
        System.out.println(String.valueOf(bool).toUpperCase());  // TRUE

        // Пример использования:

        // ArrayList принимает в себя любые типы данных,
        // а также увеличивает свою длину по мере добавления в себя новых
        // элементов. Допустим в коллекцию нужно добавлять элементы
        // примитивного типа данных, однако в коллекции нельзя просто так
        // добавить такие элементы, потому-что коллекции работают с объектами,
        // а не с примитивами. Однако класс-обертка поможет в этом деле

        // Создание объекта класса ArrayList()
        ArrayList<Integer> arr = new ArrayList<>();

        // Добавляем примитивные int значения
        arr.add(10);  // int 10 автоматически упаковывается в Integer
        arr.add(20);  // int 20 автоматически упаковывается в Integer
        arr.add(30);  // int 30 автоматически упаковывается в Integer

    }
}
