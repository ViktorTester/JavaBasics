package day4.loopingStatements;

public class ForLoop {

    public static void main(String[] args) {

        // Сперва единожды происходит инициализация (int i = 0)
        // Затем проверка условия (i < 10)
        // Затем вывод текущего значения в консоль (System.out.println(i))
        // Затем инкремент (i++)

// Пример 1:
        // Цикл выводит в консоль числа от 1 до 10 включительно
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

// Пример 2:
        // Цикл выводит в консоль только четные числа от 1 до 10
        for (int x = 2; x <= 10; x +=2) {
            System.out.println(x);
        }

// Пример 3:
        // Цикл выводит все числа от 10 до 1 и пишет четное число или нет
        for (int y = 1; y <= 10; y ++) {
            if (y % 2 == 0) {
                System.out.println(y + " is even");
            } else {
                System.out.println(y + " is odd");
            }
        }
    }
}
