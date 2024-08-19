package day15_Final_and_Super.final_keyword;

class Test1 {
    final void m(){
        System.out.println("This is m() method from Test1");
    }
}

class Test2 extends Test1 {

    // Так делать нельзя - метод m() является финальным,
    // а значит переопределить его уже нельзя.

    //    void m(){
    //        System.out.println("This is m() method from Test1");
    //    }

    // Однако перегрузить его все еще можно!
        void m(int a){
            System.out.println("This is m() method from Test1 " + a);
        }

}

public class FinalMethod {
    public static void main(String[] args){

        // Оригинальный финальный метод можно вызвать без проблем
        Test2 t2 = new Test2();
        t2.m();  // This is m() method from Test1

        // Перегруженный метод вызывается несмотря
        // на то, что он является финальным
        t2.m(55);  // This is m() method from Test1 55

    }
}
