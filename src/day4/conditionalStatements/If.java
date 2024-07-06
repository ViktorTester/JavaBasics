package day4.conditionalStatements;

public class If {

    public static void main(String[] args) {

        // задаем переменную возраста
        int person_age = 25;

        // Если значение переменной >= 18, то выполнится вывод
        // текста в консоль. В противном случае - ничего не произойдет
        if (person_age >= 18) {
            System.out.println("You are older than 18");
        }
    }
}
