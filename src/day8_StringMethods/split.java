package day8_StringMethods;

import java.util.Arrays;

public class split {
    public static void main(String[] args) {

        // split()
        // разбивает строку на подстроки с помощью разделителя

        String s = "tester@test.com";
        String[] arr = s.split("@"); // разбитие строки с помощью разделителя "@"
        System.out.println(Arrays.toString(arr)); // [tester, test.com]


        String p = "welcome";
        // разбитие строки с помощью разделителя ""
        // если разделитель не указан явно, то будет разделен каждый символ
        String[] arr2 = p.split("");
        System.out.println(Arrays.toString(arr2)); // [w, e, l, c, o, m, e]


        String g = "Hello World I love Selenium and Java";
        String[] arr3 = g.split(" "); // разбитие строки с помощью разделителя " " (пробел)
        System.out.println(Arrays.toString(arr3)); // [Hello, World, I, love, Selenium, and, Java]

    }
}
