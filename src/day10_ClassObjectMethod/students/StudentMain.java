package day10_ClassObjectMethod.students;

public class StudentMain {
    public static void main(String[] args) {
        // Есть возможность получить доступ к методу из другого
        // класса, находясь в main классе, без всякого импорта

        // Ниже происходит обращение к методам класса Student, при том,
        // что вызов происходит совсем в другом файле и в другом классе,
        // однако так как это main метод, никаких ограничений мы не имеем

        // Создание объекта
        Student stu1 = new Student();
        stu1.sid = 101;
        //stu1.sname = "smith";
        stu1.grade = 'A';
        stu1.printData(); // 101 Boris A

        // Создание объекта
        Student stu2 = new Student();
        stu2.sid = 1567;
        //stu2.sname = "smith";
        stu2.grade = 'B';
        stu2.printData(); // 1567 Boris B


    }
}
