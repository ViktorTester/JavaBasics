package day19_Type_Casting;

public class VariableCasting {
    public static void main(String[] args) {

// upcasting - автоматический процесс

        // переменная типа int без проблем преобразовалась в переменную типа long
        int intvalue1 = 100;
        long longvalue1 = intvalue1;
        System.out.println(longvalue1); // 100

        /// переменная типа float без проблем преобразовалась в переменную типа double
        float floatvalue1 = 10.5F;
        double doublevalue1 = floatvalue1;
        System.out.println(doublevalue1); // 10.5


// downcasting - ручной процесс
        long longvalue2 = 10000;
        int intvalue2 = (int)longvalue2;
        System.out.println(intvalue2); // 10000


        double doublevalue2 = 124.55;
        float floatvalue2 = (float)doublevalue2;
        System.out.println(floatvalue2); // 124.55

    }
}
