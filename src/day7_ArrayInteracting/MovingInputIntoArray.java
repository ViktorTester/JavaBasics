package day7_ArrayInteracting;

import java.util.Arrays;
import java.util.Scanner;

public class MovingInputIntoArray {
    public static void main(String[] args) {

        // Создание пустого массива
        int[] arr = new int[5];

        // Объявление переменной для работы с вводом данных
        Scanner scanner = new Scanner(System.in);

        // Создание цикла в которым в каждой итерации запрашивается ввод числа,
        // а также происходит занесение введенного числа в пустую ячейку массива
        for (int i = 0; i < arr.length; i++) {

            System.out.println("Please enter number #: " + (i + 1));
            arr[i] = scanner.nextInt();

        }

        // Вывод массива с только что введенными числами
        System.out.println(Arrays.toString(arr));

    }
}
