package day18_Exceptions;

public class UnhandledExceptions {
    public static void main(String[] args) {

        // 1 - Код для отображения начала программы
        System.out.println("Program is started");


// java.lang.ArithmeticException: / by zero
        // Вывод результата деления 100 на 0
        System.out.println(100 / 0);


// java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        // Создание массива длиной 5
        int[] a = new int[5];
        // Задаем число - индекс массива
        int pos = 5;
        // Задаем число - элемент массива
        int value = 13;
        // Пытаемся присвоить массиву элемент по индексу
        a[pos] = value;


// java.lang.NumberFormatException: For input string: "test"
        // Попытка провести конвертацию текста (слова) в число,
        // очевидно приводит к срабатыванию исключения
        String s = "test";
        int num = Integer.parseInt(s);
        System.out.println(s);


// java.lang.NullPointerException: Cannot invoke "String.length()" because "s1" is null
        // При попытке провести манипуляции с null, также сработает исключение
        String s1 = null;
        System.out.println(s1.length());


// Данный код показан для примера, он никогда не отработает до конца, так как срабатывание
// самого первого исключения, прервет выполнение кода. Если, конечно, верно его (исключение) не обработать

    }
}
