package day14_Inheritance.single;
// Пример без наследования


// Создан класс А у которого есть переменная и метод
class A {
    int a = 100;
    void display(){
        System.out.println("This is A class variable: " + a);
    }
}

// Создан класс B у которого есть переменная и метод
class B {
    int b = 200;
    void show(){
        System.out.println("This is B class variable: " + b);
    }
}

public class WithoutInheritance {
    public static void main(String[] args) {

        // Для обращения к переменным и метода классов А и B необходимо
        // для каждого их них создавать собственный объект класса

        A aobj = new A();
        System.out.println(aobj.a); // 100
        aobj.display(); // This is A class variable: 100


        B bobj = new B();
        System.out.println(bobj.b); // 200
        bobj.show(); // This is B class variable: 200

    }
}