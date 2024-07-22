package day4_Control_Statements.conditionalStatements;

public class SwitchCase {

    public static void main(String[] args) {
 // Допустим нужно вывести день недели в зависимости от введенного числа.
        // Сразу же просится раскидать условия по блокам if/else
        // Это будет верно, но код получится громоздким.
        // Всегда нужно старатьcя уменьшить код, поэтому в данном случае
        // более компактное решение будет с использованием конструкции switch case
        int day = 10;

        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day");
        }

        // В данном конкретном случае вообще лучше бы использовать цикл,
        // но для примера подойдет и конструкция switch case:

        // В итоге: тот же результат, но код в три раза короче

        int weekDay = 7;

        // Сперва задается нужное условие
        switch (weekDay) {
            // Затем проводится проверка
            // Всегда нужно указывать 'break' - прерывание выполнения
            // кода когда совпадение будет найдено
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            // В конце указывается дефолтное значение (аналог блока 'else')
            // Тут мы подразумеваем, что в неделе 7 дней и цифра в переменной
            // находится в диапазоне от 1 до 7, однако нужно предусмотреть и случай
            // когда цифра не соответствует требованиям.
            default: System.out.println("Invalid day");

        }
    }
}
