package day12_Polymorphism_Encapsulation.Encapsulation;

public class Account {

    // Теперь переменные не доступны в другом классе
    // напрямую через объект класса
    private int accnr;
    private String name;
    private double amount;

// Создание метода (setter)
    // Метод помещает данные в переменную
    void setAccnr(int accnr) {
        // Необходимо обязательно указать ключевое слово this.
        // Оно указывает, что переменная является переменной класса.
        // В противном случае система не поймет, где переменная класса,
        // а где локальная переменная и вернет не то значение, которое
        // мы потом захотим передать в метод, а 0.
        this.accnr = accnr;
    }

// Создание метода (getter)
    // Метод возвращает переменную с данными
    int getAccnr(){
        return accnr;
    }

    /*
     И уже через эти методы можно получить доступ к переменным
     Нужно иметь в виду, что для доступа к одной переменной
     нужно создавать по 2 метода и если переменных не 3, а 23 -
     это может быть накладно. Поэтому в каждой IDE есть способы
     их автоматической генерации. Для IntelliJ IDEA - это:
     Code -> Generate -> Getters and Setters
    */

    // Сгенерированные getters и setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
