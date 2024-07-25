package day9;

public class StringComparison {
    public static void main(String[] args) {

// Case 1
        // При создании строк таким способом, разницы между '==' и equals() нету
        String s1 = "Welcome";
        String s2 = "Welcome";

        System.out.println("Case 1");

        System.out.println(s1 == s2);  // true
        System.out.println(s1.equals(s2));  // true

        System.out.println("\n");


// Case 2
        // Однако при создании строк таким способом, разница уже видна
        String s3 = new String("Welcome");
        String s4 = new String("Welcome");

        System.out.println("Case 2");

        // == используется для сравнения объектов
        System.out.println(s3 == s4);  // false -
        // equals() используется для сравнения значений объектов
        System.out.println(s3.equals(s4));  // true

        System.out.println("\n");

        // Очевидно, что s3 и s4 - это разные типы объектов,
        // хранящие одинаковые значения. Оттуда и результат


// Case 3
        // При создании строк таким способом, разницы между '==' и equals() нету
        String s5 = "Welcome";
        String s6 = new String("Welcome");

        System.out.println("Case 3");

        // В данном случае, хоть s5 и не является объектом, однако s6 очень даже
        // является, поэтому результат их сравнения через == будет негативным.
        // Однако их значения по-прежнему одинаковы, поэтому метод equals() вернет true
        System.out.println(s5 == s6);  // false
        System.out.println(s5.equals(s6));  // true

        System.out.println("\n");


// Case 4
        System.out.println("Case 4");

        String s7 = "Welcome";
        String s8 = new String("Welcome");
        String s9 = s8;

        // Тут все как обычно
        System.out.println(s7 == s8);  // false
        System.out.println(s7.equals(s8));  // true

        // А вот тут уже другой результат. Так как переменные s9 и s8
        // обращаются к одному и тому же объекту. Фактически, эти переменные
        // и есть один объект. Значения у них, разумеется, одинаковые
        System.out.println(s8 == s9);  // true
        System.out.println(s8.equals(s9));  //true

        // s7 и s9 - это разные объекты, но с одинаковыми значениями
        System.out.println(s7 == s9); // false
        System.out.println(s7.equals(s9)); // true

        System.out.println("\n");

    }
}
