package day14_Inheritance;

// Создан родительский класс H у которого есть переменная и метод
class E {
    int e;
    void display(){
        System.out.println("This is H class variable: " + e);
    }
}

// Создан дочерний класс I у которого есть собственная переменная и метод,
// а также переменная и метод наследованные из класса H
class F extends E {
    int f;
    void show(){
        System.out.println("This is I class variable: " + f);
    }
}

// Создан дочерний класс J у которого есть собственная переменная и метод,
// а также переменная и метод наследованные из класса I, а также
// переменная и метод наследованные из класса H (H -> I -> J)
class G extends F {
    int g;
    void letssee(){
        System.out.println("This is J class variable: " + g);
    }
}


public class MultiLevel {
    public static void main(String[] args) {

        // Создание объекта класса J
        G gobj = new G();

        // Переменные можно задать и в main классе, в то время как инициализированы
        // они были в своих родных классах. Как видно, через объект класса J
        // у нас есть полный доступ к переменным его родительских классов
        gobj.e = 100;
        gobj.f = 200;
        gobj.g = 300;

        // Вывод в консоль переменной из родительского класса H
        System.out.println(gobj.e); // 100
        // Вызов метода из родительского класса H
        gobj.display(); // This is H class variable: 100

        // Вывод в консоль переменной из дочернего класса I
        System.out.println(gobj.f); // 200
        // Вызов метода из дочернего класса I
        gobj.show(); // This is I class variable: 200

        // Вывод в консоль переменной из дочернего класса J
        System.out.println(gobj.g); // 300
        // Вызов метода из дочернего класса J
        gobj.letssee(); // This is J class variable: 300

        // Как видно, хоть и был создан лишь один объект класса J,
        // мы имеем полный доступ к переменным и методам из класса H,
        // а также к переменным и методам из класса I, потому-как класс J
        // наследует класс I, который, в свою очередь, наследует класс H


    }
}
