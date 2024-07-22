package day9;

public class ArrayLoopStringReverse {
    public static void main(String[] args) {

        // Изначальная строка
        String s = "WelcomeWorld";
        // Новая, но пока пустая строка, куда будут записываться символы
        String reversed = "";
        // Перевод строки в массив с типом данных 'char'
        // Так называемая конвертация
        char[] chars = s.toCharArray();

        // цикл, повторяющий итерации пока не закончится строка
        for (int i = s.length() - 1; i >= 0; i--) {
            // К переменной добавляется по одному символу с конца
            // изначальной строки, в результате получая развернутую строку
            reversed += chars[i];
        }
        System.out.println("Reverse string is: " + reversed);
    }
}
