package day10_ClassObjectMethod.students;

// Создание класса
public class Student {

    // Создание переменных
    int sid;
    // Если задать имя при создании, то его можно не задавать при вызове метода
    String sname = "Boris";
    char grade;

    // Создание метода
    void printData() {

        System.out.println(sid + " " + sname + " " + grade);
    }

}
