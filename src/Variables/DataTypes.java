package Variables;

import java.util.Arrays;

public class DataTypes {

    public static void main(String[] args) {

// Примитивные типы данных

        byte b = 127; // от -128 до 127
        short s = -32768;  // от -32768 до 32767

        // Можно разделять цифры подчеркиванием для читаемости
        int i = -2_147_483_648; // от -2_147_483_648 до 2_147_483_647

        // Можно сразу задать переменной максимальное значение
        long l = Long.MAX_VALUE; // от -9,223,372,036,854,775,808 до -9,223,372,036,854,775,807

        // Также можно для типа данных long поместить в переменную огромное число, однако
        // в конце нужно обязательно дописать букву 'L', иначе будет ошибка
        long l2 = 1_234_564_323_416_234_512L;


        System.out.println("This is a byte value " + b);
        System.out.println("This is a short value " + s);
        System.out.println("This is an int value " + i);
        System.out.println("This is a long value " + l);
        System.out.println("This is a second long value " + l2);


        // Чтобы не быть перепутанной с double, в конце значения для типа данных float
        // указывается буква 'F'. Это не выбирается, буква обязательно должна быть прописана
        float f = 3.4028235E36F; // 3.4028236E36
        double d = Double.MAX_VALUE; // 1.7976931348623157E308

        System.out.println("This is a float value " + f);
        System.out.println("This is a double value " + d);

        boolean bool = true; // значение true/false

        // Слово final означает, что переменную нельзя переназначать, она неизменна
        final char c = 'c'; // одна буква, в одинарных ковычках


        System.out.println("This is a boolean value: " + bool);
        System.out.println("This is a char value: " + c);


// Не примитивные типы данных / Коллекции

        int[] arr = new int[100]; // Создание пустого массива чисел длиною 100
        arr[0] = 5; // Самое первое значение массива будет равно 5
        System.out.println(Arrays.toString(arr)); // Вывод массива в консоль - [5, 0, 0 … 0, 0]
    }
}
