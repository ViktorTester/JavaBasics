package day11;

public class ConstructorDemo {

    int x, y;

    // Конструктор по умолчанию
    ConstructorDemo() {
        x = 100;
        y = 200;
    }

    // Параметризованный конструктор
    ConstructorDemo(int a, int b) {
        x = a;
        y = b;
    }

    // метод
    void sum(){
        System.out.println(x + y);
    }

    public static void main(String[] args) {

        // Создание объекта без параметров.
        // Будет работать конструктор по умолчанию
        ConstructorDemo cd = new ConstructorDemo();
        cd.sum(); // 300

        // Создание объекта без параметров.
        // Будет работать параметризованный конструктор
        ConstructorDemo cd2 = new ConstructorDemo(10,20);
        cd2.sum(); // 30

    }
}
