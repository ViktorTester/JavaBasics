package day7_ArrayInteracting;

public class FindElementInArray {
    public static void main(String[] args) {

// Допустим задача найти некое число в целом списке чисел

        int[] arr = {1,2,3,4,5,6,7,8,9}; // Объявление массива
        int search_element = 6; // Этот элемент будем искать
        boolean status = false; // Тут задаем флаг

        // Цикл, равный длине массива
        for (int i = 0; i < arr.length; i++) {
            // Если элемент найден,
            if (arr[i] == search_element) {
                // выводится сообщение и цикл прерывается
                System.out.println("Element found at index " + i);
                status = true; // Если элемент все-таки найден, то флаг меняет статус
                break;
            }
        }

        // Если флаг так и не сменил статус после прохождения всего цикла,
        // то это значит, что элемент так и не был найден. В таком случае
        // выводится сообщения об отрицательных результатах поиска
        if (!status) {
            System.out.println("Element not found");
        }

    }
}
