package day3;

public class OperatorsPartOne {

    public static void main(String[] args) {

// Арифметические
        // +,   -,   *,   /,   %
        int a = 30, b = 7;
        System.out.println("Sum of a and b = " + (a + b));
        System.out.println("Diff of a or b = " + (a - b));
        System.out.println("Division of a or b = " + (a / b)); // возвращает целую часть
        System.out.println("Modular division of a or b = " + (a % b)); // возвращает остаток
        System.out.println("Multiplication of a and b = " + (a * b));

// Операторы сравнения
        // >,   >=,  <,  <=,  !=,  ==
        // Результат сравнения - всегда boolean значение
        // Сравнивать можно любые типы данных
        System.out.println("a is greater than b = " + (a > b)); // true
        System.out.println("a is less than than b = " + (a < b)); // false
        System.out.println("a is equal to than b = " + (a == b)); // false
        System.out.println("a is greater or equal b = " + (a >= b)); // true
        System.out.println("a is less or equal b = " + (a <= b));  // false
        System.out.println("a is not equal b = " + (a != b)); // true

        // Сравнивать можно и строки. Только тогда сраниваются их ASCII-номера
        // Например 'b' > 'a', так как у 'b' ASCII-номер равен 62, а у 'a' - 61
        System.out.println("String b is greater than string a" + ('b' > 'a')); //true

// Логические
        // &&,  ||,  !
        // Результат сравнения - всегда boolean значение
        // Сравнивать можно только boolean значения

        // задаем переменные
        boolean x = true, y = true;
        System.out.println("The result of x and y comparison is " + (x && y)); // true AND true = true
        System.out.println("The result of x and y comparison is " + (x || y)); // true OR true = true
        System.out.println("The result of x and y comparison is " + (!x)); // NOT true = false

        // переназначаем переменную
        y = false; // x = true, y = false
        System.out.println("The result of x and y comparison is " + (x && y)); // true AND false = false
        System.out.println("The result of x and y comparison is " + (x || y)); // true OR false = true
        System.out.println("The result of x and y comparison is " + (!x)); // NOT true = false

        // переназначаем переменную
        x = false; // x = false, x = false
        System.out.println("The result of x and y comparison is " + (x && y)); // false AND false = false
        System.out.println("The result of x and y comparison is " + (x || y)); // false OR false = false
        System.out.println("The result of x and y comparison is " + (!x)); // NOT false = true

        // переназначаем переменную
        y = true; // x = false, y = true
        System.out.println("The result of x and y comparison is " + (x && y)); // false AND true = false
        System.out.println("The result of x and y comparison is " + (x || y)); // false OR true = true
        System.out.println("The result of x and y comparison is " + (!x)); // NOT false = true


        int q1 = 10, q2 = 20, q3 = 30;
        System.out.println((q1 == q2) && (q1 == q3)); // false AND false = false
        System.out.println((q1 > q2) || (q1 < q3)); // false OR true = true

    }
}
