package day11.methods;

public class GreetingsMain {
    public static void main(String[] args) {

        // Создание объекта
        Greetings gr = new Greetings();

        // вызов метода
        gr.m1(); // Hello World!
// ----------------------------------------------------
        // если метод что-то возвращает, то это значение
        // нужно поместить в переменную такого же типа
        String s = gr.m2();
        System.out.println(s); // Hello, how are you?

        // Либо вывести в консоль напрямую:
        System.out.println(gr.m2()); // Hello, how are you?
// ----------------------------------------------------
        // вызов метода
        gr.m3("Viktor"); // Hello, Viktor
// ----------------------------------------------------
        String s2 = gr.m4("Viktor", "Tester");
        System.out.println(s2); // Hello, dear Viktor Tester

    }
}
