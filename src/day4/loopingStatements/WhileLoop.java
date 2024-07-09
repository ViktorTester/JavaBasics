package day4.loopingStatements;

public class WhileLoop {

// Пример 1:
    // Цикл выводит значение i, пока i не станет равной 10
    public static void main(String[] args) {

        int i = 1; // инициализация

        while (i <= 10) { // условие завершения цикла

            System.out.println(i + " Hello");

            i++; // инкремент на 1
        }


// Пример 2:
        // Цикл выводит только четные значения в диапазоне от 1 до 20
        int x = 1;  // инициализация

        while (x <= 20) {  // условие завершения цикла

            if (x % 2 == 0) { // условие вывода данных в консоль
                System.out.println(x);
            }
            x++; // инкремент на 1
        }

// Пример 3:
        // Цикл выводит все числа от 10 до 1 и пишет четное число или нет
        int y = 10;  // инициализация

        while (y >= 1) {  // условие завершения цикла

            if (y % 2 == 0) { // условие вывода данных в консоль
                System.out.println(y + " - even number");
            } else {
                System.out.println(y + " - odd number");
            }
            y--; // декремент на 1
        }
    }
}
