package day20_Collections;

import java.util.ArrayList;
import java.util.Iterator;
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

        // Создание объекта класса с указанием типа хранимых
        // в нем объектов - все методы из класса Animals
        ArrayList<Animals> arr4 = new ArrayList<Animals>();


// Добавление данных
    // add()
        // При попытке добавить в массив примитивные типы данных, они
        // будут автоматически обернуты классом-оболочкой int → Integer и т.д.

        arr.add(100);
        arr.add(10.5);
        arr.add("Welcome");
        arr.add('A');
        arr.add(100);  // Дубликаты разрешены
        arr.add(true);
        arr.add(null);
        arr.add(null);  // Многочисленные null разрешены


// Размер
    // size()
        System.out.println("The size of this ArrayList is: " + arr.size());  // 8
        System.out.println("------------------------------------------------");


// Вывод всех значений сразу
        // Все данные в массиве находятся в том же порядке, в котором они
        // были туда добавлены, что подтверждает концепт индексирования
        System.out.println(arr);  // [100, 10.5, Welcome, A, 100, true, null, null]
        System.out.println("------------------------------------------------");


// Удаление элемента
    // remove()
        System.out.println("Before removing: " + arr);  // [100, 10.5, Welcome, A, 100, true, null, null]
        arr.remove(5); // Удаление элемента с индексом 5 (true)
        System.out.println("After removing:" + arr);  // [100, 10.5, Welcome, A, 100, null, null]
        System.out.println("------------------------------------------------");


// Вставка элемента
    // add()
        // Не путать с добавлением.
        // Добавляется элемент в конец массива, а вставляется - в любой место

        // Элемент вставляется в указанное место массива, соответственно все
        // элементы справа от вставленного элемента сдвигаются на одно значение вправо

        System.out.println("Before inserting: " + arr);  // [100, 10.5, Welcome, A, 100, null, null]
        arr.add(2, 'X'); // Вставка элемента во второй индекс массива
        System.out.println("After inserting: " + arr);  // [100, 10.5, X, Welcome, A, 100, null, null]
        System.out.println("------------------------------------------------");


// Обновление элемента
    // set()
        // Действие можно также назвать замещением или заменой
        // Элемент по указанному индексу удаляется, а на его
        // место вставляется переданный в метод элемент

        System.out.println("Before modifying: " + arr);  // [100, 10.5, X, Welcome, A, 100, null, null]
        arr.set(7, "Hello World"); // Замещение элемента с индексом 7
        arr.set(6, 1234); // Замещение элемента с индексом 6
        System.out.println("After modifying: " + arr);  // [100, 10.5, X, Welcome, A, 100, 1234, Hello World]
        System.out.println("------------------------------------------------");


// Получение конкретного элемента
    // get()
        // Тут надо иметь в виду, что происходит именно обращение к элементу,
        // а не его доставание из массива и удаление

        // Выводится элемент с указанным индексом
        System.out.println(arr.get(5)); // 100
        System.out.println("------------------------------------------------");


// Вывод значений по одному
        // Тут есть варианты. Это всегда будет цикл, тот или иной, а также, так
        // называемый итератор - специально созданный способ вывода элементов коллекции


    // цикл for
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i) + " | " + arr.get(i).getClass().getName());
        }
        System.out.println("------------------------------------------------");

        // Как видно ниже, все примитивные типы превратились в объектные типы

        // 100 | java.lang.Integer
        // 10.5 | java.lang.Double
        // X | java.lang.Character
        // Welcome | java.lang.String
        // A | java.lang.Character
        // 100 | java.lang.Integer
        // 1234 | java.lang.Integer
        // Hello World | java.lang.String

    // цикл foreach
        // Тут нужно иметь в виду, что тип переменной i будет
        // объектом, так как в ArrayList хранятся именно объекты

        for(Object i : arr) {
            System.out.println(i);
        }
        System.out.println("------------------------------------------------");

    // Итератор
        // Способ вывода исключительно для коллекций

        // Объявление объекта класса
        // Также нудно не забыть этот класс импортировать:
        // import java.util.Iterator;
        Iterator it = arr.iterator();

        // При использовании итератора предпочтительно использования цикла while

        // hasNext() - метод проверяет существует ли следующий элемент массива
        // next() - выводит следующий элемент массива

        // Если следующий элемент найден - он выводится, если нет - цикл
        // прерывается. Очень удобно если неизвестна длина массива

        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("------------------------------------------------");


// Проверка заполненности
    // isEmpty();
        // если массив пустой, то будет возвращено true,
        // в противном случае - false
        System.out.println(arr.isEmpty());  // false
        System.out.println("------------------------------------------------");


// Удаление нескольких элементов массива
    // removeAll()
        // Есть метод clear(), который очищает весь массив, также есть
        // метод remove(), удаляющий один элемент. Но что если нужно удалить
        // сразу несколько различных элементов? Тут пригодится метод removeAll()

        // Методу removeAll() как параметр нужно передать другой массив.
        // И из первого массива будут удалены все элементы, которые
        // находятся в переданном массиве.
        System.out.println("Before removing all: " + arr);  // [100, 10.5, X, Welcome, A, 100, 1234, Hello World]

        arr2.add(10.5);
        arr2.add("Hello World");
        arr2.add('A');

        arr.removeAll(arr2);
        System.out.println("After removing all: " + arr);  // [100, X, Welcome, 100, 1234]
        System.out.println("------------------------------------------------");


// Удаление всех элементов массива
    // clear()
        System.out.println("Before deleting all elements: " + arr);  // [100, X, Welcome, 100, 1234]
        arr.clear();
        System.out.println(arr.isEmpty()); // true

    }
}
