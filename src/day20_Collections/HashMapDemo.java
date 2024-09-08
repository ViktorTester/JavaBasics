package day20_Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

// Объявление
    // Метод 1
        // Создание объекта класса без указания типов данных
        // Ключи и значения могут быть любого типа
        HashMap map1 = new HashMap ();

    // Метод 2
        // Создание объекта класса HashMap() и помещение
        // его в переменную родительского интерфейса Map().
        Map map2 = new HashMap();

    // Хранение одного типа объектов
        // Создание объекта класса (не забыть про его импорт)
        // Необходимо также указать тип данных ключей и их значений
        HashMap<Integer, String> map3 = new HashMap<Integer, String> ();


// Добавление пар
    // put()
        map1.put("Name", "JohnDoe");  // Дубликаты ключей будут удалены
        map1.put("Name", "John");
        map1.put("Surname", "Snow");
        map1.put("Age", "22");
        map1.put("Home", "Winterfell");


// Размер
    // size()
        System.out.println("The size of this HashMap is: " + map1.size());  // 4
        System.out.println("------------------------------------------------");


// Вывод всех значений сразу
        // Как видно при выводе, данные не будут сохранены в том порядке,
        // в котором были добавлены в массив. Также видно отсутствие дубликатов
        // Причем оставлен будет последний добавленный дубликат
        System.out.println(map1); // {Surname=Snow, Home=Winterfell, Age=22, Name=John}
        System.out.println("------------------------------------------------");


// Удаление конкретной пары
    // remove()
        // Для удаления пары нужно передать ее ключ как параметр
        System.out.println(map1); // {Surname=Snow, Home=Winterfell, Age=22, Name=John}
        map1.remove("Home");
        System.out.println(map1); // {Surname=Snow, Age=22, Name=John}
        System.out.println("------------------------------------------------");


// Получить значение по его ключу
    // get()
        System.out.println(map1.get("Surname"));  // Snow
        System.out.println("------------------------------------------------");


// Получить все ключи
    // keyset()
        System.out.println(map1.keySet());  // [Surname, Age, Name]
        System.out.println("------------------------------------------------");


// Получить все значения
    // values()
        System.out.println(map1.values());  // [Snow, 22, John]
        System.out.println("------------------------------------------------");

// Получить все пары
    // entrySet()
        System.out.println(map1.entrySet());
        System.out.println("------------------------------------------------");
        // [Surname, Age, Name]
        // [Snow, 22, John]
        // [Surname=Snow, Age=22, Name=John]


// Вывод значений по одному
        // Доступны два варианта - цикл foreach и итератор. Обычный цикл for
        // недоступен, так как у HashMap нет индексов, которые можно перебирать

    // цикл foreach
        for(Object k:map1.keySet()) {
            System.out.println(k + "   " + map1.get(k));
        }
        // Surname   Snow
        // Age   22
        // Name   John
        System.out.println("------------------------------------------------");

    // Итератор
        Iterator<Map.Entry<String, String>> it = map1.entrySet().iterator();


        while(it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
        System.out.println("------------------------------------------------");
        // Surname  Snow
        // Age  22
        // Name  John



// Удаление всех элементов массива
    // clear()
        System.out.println("Before deleting all elements: " + map1);  // {Surname=Snow, Age=22, Name=John}
        map1.clear();
        System.out.println("After deleting all elements: " + map1); // {}
        System.out.println("------------------------------------------------");

// Проверка заполненности
    // isEmpty();
        // если массив пустой, то будет возвращено true,
        // в противном случае - false
        System.out.println(map1.isEmpty());  // true
    }

}
