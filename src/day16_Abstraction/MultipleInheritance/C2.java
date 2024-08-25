package day16_Abstraction.MultipleInheritance;

// Этот класс может быть наследован другим классом даже несмотря на то,
// что тот, другой класс наследует также и интерфейсы
public class C2  {

    int z = 300;

    void m3(){
        System.out.println("This is variable from the parent class C2 " + z);
    }


}
