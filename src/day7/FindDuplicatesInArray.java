package day7;

public class FindDuplicatesInArray {

    public static void main(String[] args) {

        String[] arr = {"dog", "cat", "wolf", "bee", "chicken", "dog", "dog"}; // Объявление массива
        String search_element = "dog"; // Этот элемент будем искать
        int counter = 0;

        // Цикл, равный длине массива
        for (String i : arr) {
            // Проверка на то, что искомый элемент равен элементу из списка
            // Можно использовать как '==', так и equals()
            if (i.equals(search_element)) {
                // И если совпадение найдено, то счетчик увеличивается на 1
                counter++;
            }

        }
        // После прохождения всего цикла выводится переменная из счетчика
        System.out.println("The searched element is mentioned int the array " + counter + " times");

    }
}
