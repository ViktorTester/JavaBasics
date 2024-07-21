package day8;

import java.net.StandardSocketOptions;

public class replace {
    public static void main(String[] args) {

// replace()
// заменяет один или несколько символов в строке

        String s = "welcome to selenium Java selenium Python selenium C++";

        // Замещение всех букв 'e' в предложении буквами 'X'
        // Так как происходит замена одного символа, то
        // поместить его нужно в одинарные кавычки

        System.out.println(s.replace('e', 'X'));
        // wXlcomX to sXlXnium Java sXlXnium Python sXlXnium C++


        // Замещение всех слов 'selenium' в предложении словом 'SELENIUM'
        // Так как замещается фактически строка на строку,
        // то и поместить ее нужно в двойные кавычки

        System.out.println(s.replace("selenium", "SELENIUM"));
        // welcome to SELENIUM Java SELENIUM Python SELENIUM C++
    }
}
