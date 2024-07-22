package day4_Control_Statements.conditionalStatements;

public class IfElse {
    public static void main(String[] args) {

        int person_age = 16;

// Example 1

        // Если значение переменной >= 18, то выполнится вывод
        // текста-подтверждения в консоль. В противном случае -
        // выполнится вывод текста-отрицания

        if (person_age >= 18) { // true
            System.out.println("You are older than 18");
        } else { // false
            System.out.println("You are not older than 18");
        }

        // Проще говоря: если условие равно True, то выполнится блок 'if',
        // если условие равно False, то выполнится блок 'else'


// Example 2

        int number = 13;

        // 13 % 2 = 1
        if (number % 2 == 0) {
            System.out.println("You are even");
        } else {
            // Так как при делении 13 на 2 остается остаток, то наше условие
            // возвращает False, а значит выполняется блок else
            System.out.println("You are odd");
        }


// Example 3

        // Допустим нужно проверить какое из нескольких чисел больше
        // В данном случае используются как логический оператор (&&),
        // так и условные операторы (if, else if, else)

        int a = 10, b = 20, c = 30;

        if (a > b && a > c) { // оба условия должны вернуть true
            System.out.println("a is the biggest number");
        } else if (b > a && b > c) { // оба условия должны вернуть true
            System.out.println("b is the biggest number");
        } else {
            System.out.println("c is the biggest number");
        }

    }
}

