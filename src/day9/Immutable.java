package day9;

public class Immutable {
    public static void main(String[] args) {

        // Immutable - неизменяемый

        String s = "Welcome";
        System.out.println(s); // Welcome
        s.concat("world");
        System.out.println(s); // Welcome

        // Результат один и тот же, так как нельзя изменить первоначальное значение строки.



        String result = s.concat(" new world");
        System.out.println(result); // Welcome new world

        s += " world";
        System.out.println(s); // Welcome world

        // Результат изменился, так как выводится не изначальная, а новая строка


        // Основное отличие между использованием метода concat и оператором += заключается в том,
        // что метод concat возвращает новую строку, не изменяя исходную строку, в то время как
        // оператор += создает новую строку и присваивает ее переменной s.


    }
}
