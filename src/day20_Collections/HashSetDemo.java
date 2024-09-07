package day20_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {

// Объявление
    // Хранение различных типов объектов
      // Метод 1
        // Создание объекта класса (не забыть про его импорт)
        HashSet set = new HashSet();

      // Метод 2
        // Создание объекта класса HashSet() и помещение
        // его в переменную родительского интерфейса Set().
        Set set2 = new HashSet();

    // Хранение одного типа объектов
        // Создание объекта класса с указанием типа
        // хранимых в нем объектов - Строки
        HashSet<String> set3 = new HashSet<String>();


// Добавление данных
    // add()
        // Дубликаты могут быть добавлены сколько угодно раз, ошибки не будет,
        // однако они не будут сохранены в массиве более одного раза
        set.add(100);
        set.add(100);
        set.add(100);  // Дубликаты запрещены и все они будут удалены. Останется одно значение
        set.add(null);
        set.add(null); // Многочисленные null запрещены и будут удалены. Останется одно значение
        set.add("welcome");
        set.add(14.17);


// Размер
    // size()
        System.out.println("The size of this HashSet is: " + set.size());  // 4
        System.out.println("------------------------------------------------");

// Вывод всех значений сразу
        // Как видно при выводе, данные не будут сохранены в том порядке,
        // в котором были добавлены в массив. Также видно отсутствие дубликатов
        System.out.println(set); // [null, 14.17, 100, welcome]
        System.out.println("------------------------------------------------");


// Удаление конкретного значения
    // remove()
        // В HashSet удаление производится по имени элемента, а не по его индексу
        System.out.println(set); // [null, 14.17, 100, welcome]
        set.remove(null);
        set.remove(100);
        System.out.println(set); // [14.17, welcome]
        System.out.println("------------------------------------------------");


// Вставка элемента
    // Вставка элемента в HashSet невозможна
        // Нельзя вставить элемент в любое место, можно лишь добавить методом add()


// Получение конкретного элемента
    // Правильно будет сказать, что прямое получение элемента невозможно, но есть обходной путь:
        // Преобразовать HashSet в ArrayList
        // Получить значение по индексу
        // Преобразовать ArrayList обратно в HashSet

        // Создания объекта ArrayList и помещение туда переменной 'set',
        // в которой хранится ссылка на объект HashSet
        ArrayList arr = new ArrayList(set);
        System.out.println(arr);  // [14.17, welcome]

        // Получение значения по индексу через стандартный метод для ArrayList - get()
        System.out.println(arr.get(1));  // welcome

        // Преобразование объекта ArrayList обратно в HashSet
        HashSet newSet = new HashSet(arr);

        System.out.println(newSet); // [14.17, welcome]
        System.out.println(newSet.getClass().getName()); // java.util.HashSet
        System.out.println("------------------------------------------------");


// Вывод значений по одному
    // Доступны два варианта - цикл foreach и итератор. Обычный цикл for
    // недоступен, так как у HashSet нет индексов, которые можно перебирать

    // цикл foreach
        for(Object i : arr) {
            System.out.println(i);
        }
        System.out.println("------------------------------------------------");

    // Итератор
        Iterator it = arr.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("------------------------------------------------");


// Удаление всех элементов массива
   // clear()
        System.out.println("Before deleting all elements: " + set);  // [14.17, welcome]
        set.clear();
        System.out.println("After deleting all elements: " + set); // []
        System.out.println("------------------------------------------------");


// Проверка заполненности
    // isEmpty();
        // если массив пустой, то будет возвращено true,
        // в противном случае - false
        System.out.println(set.isEmpty());  // false

    }
}
