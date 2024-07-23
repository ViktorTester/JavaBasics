package day9;

public class StringBuilderMethod {
    public static void main(String[] args) {

        // Обязательное условие - прописывание такой строки
        StringBuilder sb = new StringBuilder("Welcome");


        System.out.println("This is a normal string: " + sb);

        // Разворачивание строки с помощью встроенного метода
        System.out.println("This is a reversed string: " + sb.reverse());
    }
}
