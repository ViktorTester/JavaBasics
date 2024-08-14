package day14_Inheritance.single;
// Пример c наследованием


// Создан родительский класс C у которого есть переменная и метод
class C {
    int c = 100;
    void display(){
        System.out.println("This is C class variable: " + c);
    }
}

// Создан дочерний класс D у которого есть собственная переменная и метод,
// а также переменная и метод наследованные из класса C
class D extends C {
    int d = 200;
    void show(){
        System.out.println("This is D class variable: " + d);
    }
}

public class WithInheritance {
    public static void main(String[] args) {

        // Создание объекта класса D
        D dobj = new D();

        // Вывод в консоль переменной из родительского класса C
        System.out.println(dobj.c); // 100
        // Вызов метода из родительского класса C
        dobj.display(); // This is C class variable: 100

        // Вывод в консоль переменной из дочернего класса D
        System.out.println(dobj.d); // 200
        // Вызов метода из дочернего класса D
        dobj.show(); // This is D class variable: 200


        // Как видно, хоть и был создан лишь один объект класса D,
        // мы имеем полный доступ к переменным и методам из класса C,
        // потому-как класс D наследует класс C


    }
}