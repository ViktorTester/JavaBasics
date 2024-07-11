package day5;

public class MultiDimensionalArray {

    // Данный код сперва создает пустой вложенный массив
    // Затем заполняет его значениями от 1 до 9 (так как общая длина всех внутренних массивов равна 9)
    // Затем значения массива выводятся в консоль

    public static void main(String[] args) {
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

        // Вывод массива на экран для проверки
        // Опять же используется вложенный цикл
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
