package day20_Collections;

import java.util.ArrayList;
import java.util.List;

class Animals {}

public class ArrayListDemo {
    public static void main(String[] args) {

// Объявление

    // Хранение различных типов объектов

        // Метод 1
        // Создание объекта класса (не забыть про его импорт)
        ArrayList arr = new ArrayList();

        // Метод 2
        // Создание объекта класса ArrayList() и помещение
        // его в переменную родительского интерфейса List().
        List arr2 = new ArrayList();


    // Хранение одного типа объектов

        // Создание объекта класса с указанием типа
        // хранимых в нем объектов - Строки
        ArrayList<String> arr3 = new ArrayList<String>();

        // Создание объекта класса с указанием типа хранимы
        // в нем объектов - все методы из класса Animals
        ArrayList<Animals> arr4 = new ArrayList<Animals>();



    }
}
