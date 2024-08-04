package day12_Polymorphism_Encapsulation.Overloading.MainMethodOverloading;

public class OverloadingMainMethod {

    void main(int x){
        System.out.println(x);
    }

    void main(String s){
        System.out.println(s);
    }

    void main(String s1, String s2){
        System.out.println(s1 + s2);
    }

    public static void main(String[] args){

        OverloadingMainMethod ov = new OverloadingMainMethod();
        ov.main(100); // 100
        ov.main("John"); // John
        ov.main("Hello", "David"); // HelloDavid

    }
}
