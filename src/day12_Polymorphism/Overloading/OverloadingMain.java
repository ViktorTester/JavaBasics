package day12_Polymorphism.Overloading;

public class OverloadingMain {
    public static void main(String[] args) {

        Overloading ov = new Overloading();

        ov.sum(); // 1 метод
        ov.sum(1, 2); // 2 метод
        ov.sum(1, 15.16); // 3 метод
        ov.sum(99.47, 56); // 4 метод
        ov.sum(4, 6, 8); // 5 метод

    }
}
