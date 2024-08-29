package day18_Exceptions.UncheckedExceptions;

public class HandledExceptions {
    public static void main(String[] args) {

        // 1 - Код для отображения начала программы
        System.out.println("Program is started");  // Program is started


        // Пользователь пытается разделить на 0 и программа видит этот момент.
        // Срабатывает и корректно обрабатывается исключение java.lang.ArithmeticException: / by zero
        // Кастомное сообщение об ошибке выводится в консоль
        try {
            System.out.println(100 / 0);  // Please, don't make an arithmetic mistakes
        } catch (ArithmeticException e){
            System.out.println("Please, don't make an arithmetic mistakes");

        }

        // Пользователь пытается разделить на валидное число
        // Блок try-catch пропускается, ответ выводится в консоль
        try {
            System.out.println(100 / 20);  // 5
        } catch (ArithmeticException e) {
            System.out.println("Please, don't make an arithmetic mistakes");
        }

        // 2 - Код для отображения завершения программы
        System.out.println("Program is finished");  // Program is finished

        // Данный код выполнится до конца. В терминал будут выведены строки 1, 2, а также
        // кастомное сообщение об ошибке - Please, don't make an arithmetic mistakes.
        // Как видно, программа не прерывает выполнение.
    }
}
