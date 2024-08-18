package day14_Inheritance.MethodOverriding;

// Создание класса
class ABC {
    // Создание метода
    void m1(int a) {
        System.out.println(a);
    }

    // Создание метода
    void m2(int b) {
        System.out.println(b);
    }
}

// Наследование класса
class XYZ extends ABC {

    // Переопределение метода
    // Изменена только реализация
    void m1(int a) {
        System.out.println(a * a);
    }

    // Перегрузка метода
    // Изменено количество параметров
    // Изменена реализация
    void m2(int a, int b) {
        System.out.println(a * b);
    }

}

public class OverloadingVsOverriding {

    public static void main(String[] args) {

        XYZ xyzobj = new XYZ();

        // Вызов переопределенного метода
        xyzobj.m1(100);  // 10000
        // Вызов изначального метода
        xyzobj.m2(20);  // 20
        // Вызов перегруженного метода
        xyzobj.m2(10, 20);  // 200


    }


}
