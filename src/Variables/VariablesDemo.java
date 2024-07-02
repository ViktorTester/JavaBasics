package Variables;

import java.util.Arrays;

public class VariablesDemo {
    public static void main(String[] args) {

// При создании переменной сперва всегда задается:
// Ее тип данных, а в конце обязательон точка с запятой

        int dob = 1992; // создание числовой переменной
        double price = 12.25; // создание переменной с плавающей точкой
        String name = "Viktor"; // создание строковой переменной
        char grade = 'A'; // создание однобуквенной строковой переменной

// Можно задать переменную без значения
        String surname;
        int year;

// Зная тип данных переменной, позже ее можно переназначить
        dob = 2004;
        price = 15.15;
        name = "Tester";
        surname = "qa";
        grade = 'B';
        year = 1990;

// Можно задать сразу несколько переменных и позже их переназначить
// Так можно делать только если переменные принадлежат к одному типу данных
        int a, b, c;

        a = 1;
        b = 2;
        c = 3;

// Можно задать сразу несколько переменных и сразу же их назначить
// Так можно делать только если переменные принадлежат к одному типу данных
        double price1 = 13.66, price2 = 55.10, price3 = 18.19;


// Вывод значений переменных в терминал
        System.out.println("The value of dob is " + dob); // The value of dob is 2004
        System.out.println("I was born in " + year); // I was born in 1990
        System.out.println("This product price is " + price + " Dollars"); // This product price is 15.15 Dollars
        System.out.println(name); // Tester
        System.out.println(surname); // qa
        System.out.println(grade); // B

// Вывод нескольких значений переменных в терминал одной командой
        System.out.println(year + " " + name + " " + surname + " " + grade); // 1990 Tester qa B

        int[] arr = new int[100];
        arr[0] = 5;
        System.out.println(Arrays.toString(arr));
    }

}
