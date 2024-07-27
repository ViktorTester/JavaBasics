package day10_ClassObjectMethod;

public class Employee {

// Класс содержит переменные
    // Эти переменные глобальны - они доступны в любом методе класса
    int eid;
    String name;
    String job;
    int salary;

// Класс содержит методы
    // При создании метода нужно указывать тип значений, возвращаемых методом
    // Данный метод не возвращает ничего, поэтому - void
    // Также в метод не передаются никакие параметры, поэтому - ()
    void display(){
        System.out.println(eid);
        System.out.println(name);
        System.out.println(job);
        System.out.println(salary);
    }

// Также в данном классе содержится второй метод:
    // Он ничего не возвращает, но принимает аргументы
    // Если в классе нет метода main, то не получится выполнить другие методы
    // этого класса, так как Java сперва всегда смотрит на наличие метода main
    public static void main(String[] args) {

// Создание объекта
        // Объект emp1 имеет доступ ко всем переменным класса Employee (4 переменных)
        // Объект emp1 имеет доступ ко всем методам класса Employee (1 метод)
        Employee emp1 = new Employee();

        // Объект emp1 назначает переменные из своего класса Employee
        emp1.eid = 101;
        emp1.name = "John";
        emp1.job = "Programmer";
        emp1.salary = 10000;

        // Объект emp1 обращается к методу из своего класса Employee
        emp1.display();
        // 101
        // John
        // Programmer
        // 10000

        System.out.println('\n');

// Создание объекта
        // Объект emp2 имеет доступ ко всем переменным класса Employee (4 переменных)
        // Объект emp2 имеет доступ ко всем методам класса Employee (1 метод)
        Employee emp2 = new Employee();

        // Объект emp2 назначает переменные из своего класса Employee
        emp2.eid = 234523;
        emp2.name = "Peter";
        emp2.job = "Manager";
        emp2.salary = 7000;

        // Объект emp2 обращается к методу из своего класса Employee
        emp2.display();
        // 234523
        // Peter
        // Manager
        // 7000

    }
}
