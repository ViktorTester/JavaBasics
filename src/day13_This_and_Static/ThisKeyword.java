package day13_This_and_Static;

public class ThisKeyword {

    // Переменные класса
    int x, y;

    // Создание конструктора
    public ThisKeyword(int x, int y) {
        // Необходимо обязательно указать ключевое слово this.
        // Оно указывает, что переменная является переменной класса.
        // В противном случае система не поймет, где переменная класса,
        // а где локальная переменная и вернет не то значение, которое
        // мы потом захотим передать в метод, а 0.

        // Либо другой вариант - не называть переменные и параметры
        // одинаково, тогда система все интерпретирует верно
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {

        // Создание объекта
        ThisKeyword th = new ThisKeyword(100, 200);
        th.display();
        // 100
        // 200

    }

}
