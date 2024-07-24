package day9;

public class StringBuilderMethod {
    public static void main(String[] args) {

// Разворот строки (Reverse)

        // Обязательное условие - прописывание такой строки
        StringBuilder sb = new StringBuilder("Welcome");


        System.out.println("This is a normal string: " + sb);

        // Разворачивание строки с помощью встроенного метода
        System.out.println("This is a reversed string: " + sb.reverse());

        // StringBuilder - это изменяемый тип данных, поэтому такую строку можно менять

        // Используется не конкатенация, а специальный метод append()
        sb.append(" - this string is reversed");
        System.out.println(sb); // emocleW - this string is reversed
    }
}
