package day5_Arrays;

public class MultiDimensionalArray {

    // Данный код сперва создает пустой вложенный массив
    // Затем заполняет его значениями от 1 до 9 (так как общая длина всех внутренних массивов равна 9)
    // Затем значения массива выводятся в консоль

    public static void main(String[] args) {

// Вариант 1

        // Создание и инициализация двумерного массива
        // Массив, в котором есть еще 3 массива, каждый длиной в 3
        int[][] myArray = new int[3][3];

        // Заполнение массива числами от 1 до 9
        int counter = 1;
        // Так как массив вложенный, то и цикл нужно использовать вложенный,
        // для того чтобы заполнить все внутренние массивы значениями
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = counter++;
            }
        }

        // Вывод элементов массива на экран для проверки
        // Опять же используется вложенный цикл
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }


// Вариант 2

        // Опять же, можно заполнить массив данными и вручную:
        String[][] myStringArray = new String[2][2];

        myStringArray[0][0] = "Hello1";
        myStringArray[0][1] = "World1";
        myStringArray[1][0] = "Hello2";
        myStringArray[1][1] = "World2";

        // Вывод элементов массива на экран для проверки.
        // Используется вложенный цикл for each
        for (String[] k : myStringArray) {
            for (String v : k) {
                System.out.print(v + " ");
            }
        }


// Вариант 3

        // Можно заполнить вложенный массив и при его создании:
        double[][] myDoubleArray = {
                {25, 1234},
                {6774, 234234},
                {1234, 7543}
        };
        // Вывод элементов массива на экран для проверки.
        // Используется вложенный цикл for each
        for (double[] h : myDoubleArray) {
            // Вывод символа переноса строки либо пустой строки для того,
            // чтобы следующая строка массива печаталась с новой строки
            System.out.print("\n");
            for (double p : h) {
                System.out.print(p + " ");
            }
        }


        // Также можно узнать длину вложенного массива:
        System.out.println("Длина внешнего массива равна " + myDoubleArray.length);
        System.out.println("Длина внутреннего массива равна " + myDoubleArray[0].length);

    }
}
