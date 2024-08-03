package day12_Polymorphism_Encapsulation.ConstructorOverloading;

public class ConstructorOverloadingMain {

    public static void main(String[] args) {

// Создание объекта без параметров.
        // Будет работать конструктор-1 без параметров.
        ConstructorOverloading constr1 = new ConstructorOverloading();
        // Вывод значения первого конструктора
        System.out.println(constr1.volume()); // 0.0

// Создание объекта с параметрами.
        // Будет работать конструктор-2 с параметрами.
        ConstructorOverloading constr2 = new ConstructorOverloading(4.6, 5.1, 6.9);
        // Вывод значения второго конструктора
        System.out.println(constr2.volume()); // 161.874

// Создание объекта с одним парамертом.
        // Будет работать конструктор-3 с одним параметром.
        ConstructorOverloading constr3 = new ConstructorOverloading(5);
        // Вывод значения первого конструктора
        System.out.println(constr3.volume()); // 125.0

    }
}
