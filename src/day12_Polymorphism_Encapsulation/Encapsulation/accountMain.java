package day12_Polymorphism_Encapsulation.Encapsulation;

public class accountMain {

    public static void main(String[] args){

        Account acc = new Account();

        // Так мы получаем доступ без инкапсуляции
        // Просто обращается в переменной через объект.
//        acc.accnr = 1001;
//        acc.name = "John";
//        acc.amount = 1222;

        // Но при инкапсуляции нельзя напрямую обратиться
        // к переменной, но можно через метод

// Помещение значения в переменную метода (setter)
        acc.setAccnr(101);
// Вывод значения переменной в консоль с помощью метода (getter)
        System.out.println(acc.getAccnr()); // 101

        acc.setName("Bobby");
        System.out.println(acc.getName()); // Bobby

        acc.setAmount(15.17);
        System.out.println(acc.getAmount()); // 15.17

    }
}
