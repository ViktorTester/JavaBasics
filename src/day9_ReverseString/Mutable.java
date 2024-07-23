package day9_ReverseString;

import java.util.Arrays;

public class Mutable {
    public static void main(String[] args) {

        // Mutable - изменяемый

        // Массив чисел - изменяемый тип данных и ниже это
        // продемонстрировано сортировкой значений массива
        int[] a = {20, 10, 30, 90, 50, 60};

        System.out.println(Arrays.toString(a)); // [20, 10, 30, 90, 50, 60]

        Arrays.sort(a); // Сортировка (Изменение) массива

        // Изначальный массив отсортирован и выведен корректно
        System.out.println(Arrays.toString(a)); // [10, 20, 30, 50, 60, 90]


    }
}
