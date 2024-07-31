package day12_Polymorphism;

public class Overloading {

    int a = 10, b = 20;

// 1 метод.
// Метод без параметров
    void sum(){
        System.out.println(a+b);
    }

// 2 метод.
// Метод с двумя параметрами (int, int)
    void sum(int x, int y){
        System.out.println(x+y);
    }

// 3 метод.
// Метод с двумя параметрами (int, double)
    // Имплементация - (int x, double y)
    void sum(int x, double y){
        // Реализация - System.out.println(x+y);
        System.out.println(x+y);
    }

// 4 метод.
// Метод с двумя параметрами (int, double) в другом порядке
    void sum(double y, int x){
        System.out.println(x+y);
    }

// 5 метод.
// Метод с тремя параметрами (int, int, int)
    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }

    // Как видно выше у нас есть пять методов с один и тем же названием, и выполняющих,
    // так или иначе, одно и тоже - вывод суммы чисел. Однако теперь, нам не нужно
    // запоминать 5 названий методов, а лишь один - sum()

}
