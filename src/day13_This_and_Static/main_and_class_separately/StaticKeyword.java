package day13_This_and_Static.main_and_class_separately;

// Класс находится отдельно от main метода, в котором нам
// нужно обратится к переменным этого класса
public class StaticKeyword {

// создание статической переменной
    static int a = 10;
    // создание не статической переменной
    int b = 20;

// создание статического метода 1
    static void m1() {
        System.out.println("This is a m1 - static method");
    }
    // создание не статического метода 2
    void m2() {
        System.out.println("This is a m2 - non-static method");
    }

// создание не статического метода 3
    // Не статический метод имеет полный доступ к любым переменным и методам
    // (статическим и не статическим) без создания объекта класса
    void m(){
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }
}
