package day7_ArrayInteracting;

// Так как используется сторонний класс-пакет, то его нужно импортировать
import java.util.Arrays;

public class SortingElementsInArray {
    public static void main(String[] args) {

// ASC
        System.out.println("ASC");

        // Массив с числами идущими не по порядку
        int[] arr = {2, 7, 1, 100, 45, 19, 3, 9};
        // Массив со строками идущими не по алфавиту
        String[] arr2 = {"cat", "dog", "fish", "hippo", "zebra"};

        // Вывод элементов массива в изначальном порядке
        System.out.println("Not sorted number array: \n" + Arrays.toString(arr)); // [2, 7, 1, 100, 45, 19, 3, 9]
        System.out.println("Not sorted string array: \n" + Arrays.toString(arr2)); // [cat, dog, fish, hippo, zebra]

        // Сортировка значений массива ASC
        Arrays.sort(arr);
        Arrays.sort(arr2);

        // Вывод отсортированных элементов массива. По умолчанию сортировка
        // происходит в порядке увеличения значений/по алфавиту
        System.out.println("Sorted number array ASC: \n" + Arrays.toString(arr)); // [1, 2, 3, 7, 9, 19, 45, 100]
        System.out.println("Sorted string array ASC: \n" + Arrays.toString(arr2)); // [cat, dog, fish, hippo, zebra]


// DESC

        System.out.println("DESC");
        // С сортировкой элементов массива в порядке убывания не все так просто.
        // Можно использовать опять же, сторонние пакеты, но проще:
        // - Сперва отсортировать элементы по возрастанию
        // - Затем вывести их в обратном порядке

        // Массив с числами идущими не по порядку
        int[] nums = {2, 7, 1, 100, 45, 19, 3, 9};
        // Массив со строками идущими не по алфавиту
        String[] strs = {"cat", "dog", "fish", "hippo", "zebra"};

        // Сортировка значений массива ASC
        Arrays.sort(nums);
        Arrays.sort(strs);

        // Вывод отсортированных чисел в массиве в порядке убывания
        for (int i = nums.length - 1; i > -1; i--) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        // Вывод отсортированных строк в массиве в порядке убывания
        for (int j = strs.length - 1; j > -1; j--) {
            System.out.print(strs[j] + " ");
        }

    }
}
