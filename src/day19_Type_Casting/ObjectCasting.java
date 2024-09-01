package day19_Type_Casting;

class Parent {

    String name = "John";

    void m1(){
        System.out.println("This is m1() from Parent");
    }

}

class Child extends Parent {

    int id = 101;

    void m2(){
        System.out.println("This is m2() from Child");
    }

}

public class ObjectCasting {
    public static void main(String[] args) {

    // Обычное наследование
        // все методы и переменные из родительского класса доступны также в дочернем классе
        Child c = new Child();

        System.out.println(c.name); // John - Parent class
        c.m1(); // This is m1() from Parent - Parent class
        System.out.println(c.id); // 101    - Child class
        c.m2(); // This is m2() from Child  - Child class

    // Upcasting
        // Child меньший класс (дочерний)
        // Parent больший класс (родительский)
        // Приведение меньшего к большему - это upcasting

        // Таким образом доступны только родительские переменные и методы

        Parent p = new Child();
        System.out.println(p.name); // John - Parent class
        p.m1(); // This is m1() from Parent - Parent class
        // System.out.println(p.id); - переменная недоступна
        // p.m2(); - метод недоступен


    // Downcasting
        // Child меньший класс (дочерний)
        // Parent больший класс (родительский)
        // Приведение большего к меньшему - это downcasting

        // все методы и переменные из родительского класса доступны также в дочернем классе

        // Как и с переменными, при сужении необходимо явно указывать класс
        // Ниже осуществлена попытка привести родительский класс к дочернему
        Parent parent = new Parent();
        Child child = (Child)parent;

        // В данном случае, хоть IDE и не ругается, и вроде все в порядке
        // на первый взгляд, однако при выполнении программы будет выведена ошибка:
        // java.lang.ClassCastException

        // IDE, так же как и компилятор, не может определить на этапе компиляции, является ли объект
        // фактически экземпляром Child или Parent — это проверяется только во время выполнения программы.
        // Приведение типов в Java основано на доверии к программисту, что он знает, что делает, когда
        // явно приводит типы. Поэтому компилятор и IDE не выдают ошибок, хотя существует потенциальная проблема.

        System.out.println(child.name); // Parent
        child.m1(); // Parent
        System.out.println(child.id); // Child
        child.m2(); // Child
    }
}
