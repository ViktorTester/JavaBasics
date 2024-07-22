package day4_Control_Statements.loopingStatements;

public class ForEachLoop {

    public static void main(String[] args) {

        // В Java нет ключевого слова For Each, как в некоторых других языках,
        // однако суть остается прежней - это такой же цикл for с упрощенным
        // синтаксисом:


        int[] numbers = {1, 2, 3, 4, 5};

//Цикл for
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

//Цикл for each
        for (int i : numbers) {
            System.out.println(i);
        }




        String[] fruits = {"Apple", "Banana", "Orange", "Mango"};

//Цикл for
        for (int j = 0; j < fruits.length; j++) {
            System.out.println(fruits[j]);
        }

//Цикл for each
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    // Очевидно то, что выполняя одну и ту же работу, цикл for each
    // гораздо проще в написании и понимании.
}
