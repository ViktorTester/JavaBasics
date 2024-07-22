package day4_Control_Statements.loopingStatements;

public class DoWhileLoop {

    // Разница между циклами while и do while в одном моменте - в цикле do while
    // действие будет выполнено как минимум 1 раз, даже если проверка условия провалена,
    // так как выполнение действия в таком цикле происходит до проверки условия

    public static void main(String[] args) {

        int i = 1; // Инициализация

        do {
            System.out.println(i); // Сперва вывод в консоль
            i++; // Затем инкремент на 1
        } while (i <= 10); // Затем проверка условия

    }
}
