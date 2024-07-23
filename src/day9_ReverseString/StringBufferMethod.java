package day9_ReverseString;

public class StringBufferMethod {
    public static void main(String[] args) {

        // Обязательное условие - прописывание такой строки
        StringBuffer sb = new StringBuffer("Welcome");


        System.out.println("This is a normal string: " + sb);

        // Разворачивание строки с помощью встроенного метода
        System.out.println("This is a reversed string: " + sb.reverse());
    }
}
