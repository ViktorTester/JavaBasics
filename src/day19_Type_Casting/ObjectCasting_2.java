package day19_Type_Casting;

// Сужение все же можно провести с объектами без риска
// остановки кода, и ниже показано как это сделать

// Для корректного сужения классов нужно попадать под 3 правила:


// 1)
// Между 3 и 4 должны быть какие-то отношения (Родитель и дочка или наоборот, неважно).
// На примере ниже такие отношения есть у Animal{} и Dog{}. Между Cat{} и Dog{} отношений нет

// 2)
// 3 должен либо быть равным 1, либо быть его дочкой.

// 3)
// Конструктор <Dog()>, помещенный в переменную <4>, должен быть либо дочкой для <3>, либо одинаковым с <3>

// Animal an = new Dog();
// Dog dg = (Dog) an;

// Dog  -  1
// dg    -  2
// (Dog) -  3
// an    -  4



class Animal{}

class Dog extends Animal{

    String dogName = "Jack";

    void m1() {
        System.out.println("This is Dog class name " + dogName);
    }
}

class Cat extends Animal{

    String catName = "Kitty";

    void m2() {
        System.out.println("This is Cat class name " + catName);
    }
}

public class ObjectCasting_2 {
    public static void main(String[] args) {

        Animal an = new Dog();
        Dog dg = (Dog) an;

// Соответствует правилу 1: an - переменная класса-родителя, (Cat) - объект класса-дочки.
// Соответствует правилу 2: (Cat) равен Cat.
// Соответствует правилу 3: Конструктор Dog() в верхней строке, является одинаковым с Dog() в строке ниже

        // При запуске такого кода, не возникнет никаких ошибок, однако
        // и доступ будет получен только к переменным и методам класса Dog{}

        System.out.println(dg.dogName);  // Jack
        dg.m1();  // This is Dog class name Jack
        // System.out.println(dg.catName); -  переменная недоступна
        // dg.m2();  -  метода недоступен


    }
}
