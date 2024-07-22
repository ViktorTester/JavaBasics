package day7_ArrayInteracting;

// Импорт класса
import java.util.Scanner;

public class TakingSingleInputValue {
    public static void main(String[] args) {

// INT
        // Объявление переменной для работы с вводом данных
        Scanner scanner = new Scanner(System.in);

        // Так как консоль никак не реагирует на запрос числа у пользователя,
        // можно перед этим запросом вывести сообщение с просьбой ввода числа
        System.out.println("Please enter a number: ");

        // Вот тут будет запрошено ввести данные и после ввода,
        // число будет помещено в переменную "num"
        // Данная строка кода предусматривает ввод исключительно int значений
        int num = scanner.nextInt();

        // Вывод в консоль только что введенного числа
        System.out.println("This is your input: " + num);


// FLOAT
        // Те же самые действия, но запрашивается ввод float-числа:
        System.out.println("Please enter a float number: ");
        float flt = scanner.nextFloat();
        System.out.println("This is your input: " + flt);


// STRING
        // Те же самые действия, но запрашивается ввод строки:
        System.out.println("Please enter your city: ");
        String city = scanner.next();
        System.out.println("This is your city: " + city);

// UNKNOWN
        // Те же самые действия, но тип вводимых данных неизвестен:
        System.out.println("Please enter something: ");
        Object someValue = scanner.next();
        System.out.println("This is your value: " + someValue);

    }
}
