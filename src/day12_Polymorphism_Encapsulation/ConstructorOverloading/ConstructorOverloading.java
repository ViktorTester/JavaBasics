package day12_Polymorphism_Encapsulation.ConstructorOverloading;

public class ConstructorOverloading {

    double width, height, depth;

// Первый конструктор
    ConstructorOverloading() {
        // Можно задать переменные так:
        width = 0;
        height = 0;
        depth = 0;
    }

// Второй конструктор
    ConstructorOverloading(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

// Третий конструктор
    ConstructorOverloading(double len) {
        // А можно задать переменные так, при условии, что их значения равны:
        width = height = depth = len;
    }

    // Создание метода
    double volume(){
        return (width * height * depth);
    }

}
