package day14_Inheritance;

// Создан родительский класс H у которого есть переменная и метод
class H {
    int h = 100;
    void display(){
        System.out.println("This is H class variable: " + h);
    }
}

// Создан дочерний класс I у которого есть собственная переменная и метод,
// а также переменная и метод наследованные из класса H
class I extends H {
    int i = 200;
    void show(){
        System.out.println("This is I class variable: " + i);
    }
}

// Создан дочерний класс J у которого есть собственная переменная и метод,
// а также переменная и метод наследованные из класса H
class J extends H {
    int j = 300;
    void letssee(){
        System.out.println("This is J class variable: " + j);
    }
}


public class Hierarchical {
    public static void main(String[] args) {

        // Создание объекта класса I
        I iobj = new I();

        // Вывод в консоль переменной из родительского класса H
        System.out.println(iobj.h); // 100
        // Вызов метода из родительского класса H
        iobj.display(); // This is H class variable: 100

        // Вывод в консоль переменной из дочернего класса I
        System.out.println(iobj.i); // 200
        // Вызов метода из дочернего класса I
        iobj.show(); // This is I class variable: 200



        // Создание объекта класса J
        J jobj = new J();

        // Вывод в консоль переменной из родительского класса H
        System.out.println(jobj.h); // 100
        // Вызов метода из родительского класса H
        jobj.display(); // This is H class variable: 100

        // Вывод в консоль переменной из дочернего класса J
        System.out.println(jobj.j); // 300
        // Вызов метода из дочернего класса J
        jobj.letssee(); // This is J class variable: 300

        // Как видно, хоть и был создан лишь один объект класса J,
        // мы имеем полный доступ к переменным и методам из класса H,
        // а также к переменным и методам из класса I, потому-как класс J
        // наследует класс I, который, в свою очередь, наследует класс H


    }
}
