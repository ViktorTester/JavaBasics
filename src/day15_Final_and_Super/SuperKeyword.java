package day15_Final_and_Super;


class first {

    int a = 100;

}

class second extends first {
    // Переопределение переменной
    int a = 200;

    void ma1() {
        System.out.println("test " + a);
    }

    // Создан второй метод с использованием
    // ключевого слова super
    void ma2() {
        System.out.println("test " + super.a);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {

        // Создание объекта класса second, который наследует класс first
        second sc = new second();
        // Вызов метода, который выводит переменную
        sc.ma1(); // 200
        // Очевидно, что будет выведена уже переопределенная переменная

        // Однако нам нужно вывести изначальное значение переменной,
        // и непременно через объект не родительского класса, а дочернего
        // (Через объект родительского класса понятно, что будет выведено 100)

        sc.ma2(); // 100
        // Как видно метод выводит значение переменной родительского класса,
        // несмотря на то, что вызван этот метод через
        // объект дочернего класса



    }
}
