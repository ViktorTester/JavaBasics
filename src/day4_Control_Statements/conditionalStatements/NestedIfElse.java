package day4_Control_Statements.conditionalStatements;

public class NestedIfElse {

    public static void main(String[] args) {

        // В одном блоке условий может располагаться еще один блок условий и
        // так до бесконечности. Конечно, это не самая лучшая практика, лучше
        // избегать многочисленных блоков условий, но возможность делать
        // их вложенными есть.

        // Данная программа работает с числом и обрабатывает все его возможные
        // значения - позитивное/негативное/равно 0
        int num = 15;

        // Выполняется внешний блок 'if', так как условие возвращает True
        if (num > 0) {
            System.out.println("the number is positive");
            if (num % 2 == 0) {
                System.out.println("You are even");
                // Выполняется внутренний блок 'else', так как условие возвращает False
            } else {
                System.out.println("You are odd");
            }
        } else if (num < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }

        // Блок 'else' в данном примере выполнится лишь в том случае,
        // если блок 'if' и блок 'else if' вернут значение False,
        // То есть если рассматриваемое число будет равно 0

        // Структура всегда такая:
        // Сперва идет один блок 'IF'
        // Затем идет сколько угодно блоков 'ELSE IF'
        // Затем идет один блок 'ELSE'
    }
}
