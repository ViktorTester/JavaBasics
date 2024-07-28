package day11.assign_variables;

public class Student {

    // Переменные класса - доступны во всем классе
    int sid;
    String sname;
    char grad;

    void printStudentData() {
        System.out.println(sid+" "+sname+" "+grad);
    }

    void setStudentData(int id, String name, char gr) {
        // Локальные переменные - доступны только в методе
        sid = id;
        sname = name;
        grad = gr;

    }

}
