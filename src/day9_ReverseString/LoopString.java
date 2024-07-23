package day9_ReverseString;

public class LoopString {
    public static void main(String[] args) {

        // Изначальная строка
        String s = "Welcome";
        // Новая, но пока пустая строка, куда будут записываться символы
        String reversed = "";

        // цикл, повторяющий итерации пока не закончится строка
        for (int i = s.length() - 1; i >= 0; i--) {
            // К переменной добавляется по одному символу с конца
            // изначальной строки, в результате получая развернутую строку
            reversed += s.charAt(i);
        }
        System.out.println("Reverse string is: " + reversed);
    }
}
