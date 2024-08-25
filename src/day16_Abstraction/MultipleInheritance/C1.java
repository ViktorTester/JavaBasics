package day16_Abstraction.MultipleInheritance;

// Интерфейсы поддерживают множественное наследование, поэтому без проблем
// класс может имплементировать сразу 2 интерфейса.
// Также класс может наследовать и другой класс одновременно с интерфейсами,
// в таком случае для классов нужно использовать слово extends, а для
// интерфейсов - implements. Слово extends пишется первым
public class C1 extends C2 implements MultipleInheritance1, MultipleInheritance2 {

    // Метод объявлен в интерфейсе(1) и теперь в него можно имплементировать
    // логику через дочерний класс.
    // Метод в дочернем классе также должен быть public, также, как и в
    // родительском интерфейсе. Просто в классе это нужно указать явно
    public void m1() {
        System.out.println("This is variable from MultipleInheritance1 " + x);
    };

    // Метод объявлен в интерфейсе(2) и теперь в него можно имплементировать
    // логику через дочерний класс.
    // Метод в дочернем классе также должен быть public, также, как и в
    // родительском интерфейсе. Просто в классе это нужно указать явно
    public void m2() {
        System.out.println("This is variable from MultipleInheritance1 " + y);
    }

    public static void main(String[] args) {

        // Создание объекта класса
        C1 c1obj = new C1();

        // Вызов метода объявленного в интерфейсе(1) и имлементированного в его дочернем классе
        c1obj.m1();  // This is variable from MultipleInheritance1 100

        // Вызов метода объявленного в интерфейсе(2) и имлементированного в его дочернем классе
        c1obj.m2();  // This is variable from MultipleInheritance1 200

        // Вызов метода объявленного и имлементированного в родительском классе C2
        c1obj.m3();  // This is variable from the parent class C2 300

    }
}
