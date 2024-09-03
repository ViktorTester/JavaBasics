package day19_Type_Casting;


public class ObjectCasting_3 {
    public static void main(String[] args) {

// Неверное сужение объектов
        Object test = new String("Welcome");
        StringBuffer sb = (StringBuffer) test;

        // Правило 1
        // Между (StringBuffer) и test есть отношения?
        // Да. test - переменная объекта. (StringBuffer) - дочка объекта

        // Правило 2
        // (StringBuffer) равен StringBuffer, либо является его дочкой?
        // Да. (StringBuffer) равен StringBuffer

        // Правило 3
        // String("Welcome"), помещенный в переменную test, является дочкой или равным (StringBuffer)?
        // Нет. Между String("Welcome") и (StringBuffer) нет никаких отношений и они не равны

        // Одно из правил неудовлетворено, результат - сужение выполнено некорректно


// Верное сужение объектов
        Object ostr = new String("Welcome");
        String sbf = (String) ostr;

        // Правило 1
        // Между (StringBuffer) и str есть отношения?
        // Да. ostr - переменная объекта. (String) - дочка объекта

        // Правило 2
        // (String) равен String, либо является его дочкой?
        // Да. (String) равен String

        // Правило 3
        // String("Welcome"), помещенный в переменную ostr, является дочкой или равным (String)?
        // Да. String("Welcome") и String равны

        // Все три правила удовлетворены, результат - сужение выполнено корректно

    }
}
