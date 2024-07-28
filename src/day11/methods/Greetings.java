package day11.methods;

public class Greetings {

    // Создание различных методов


// No params, no return value
    void m1(){
        System.out.println("Hello World!");
    }

// No params, but returning a value
    String m2(){
        return "Hello, how are you?";
    }

// With params, no return value
    void m3(String name){
        System.out.println("Hello, " + name);
    }

// With params, and returning a value
    String m4(String name, String surname){
        return "Hello, dear " + name + " " + surname;
    }

}
