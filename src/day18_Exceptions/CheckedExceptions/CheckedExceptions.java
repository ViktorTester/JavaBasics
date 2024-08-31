package day18_Exceptions.CheckedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException {


        // 1 - Блок try-catch

        System.out.println("started 1");  // started 1
        System.out.println("in progress 2");  // in progress 2

        try {
            Thread.sleep(5000); // Останавливает выполнение программы на 5 секунд
        } catch (InterruptedException e) {
            // Исключение InterruptedException вступит в дело если во время 5-ти
            // секундной задержки (а это тоже процесс), вмешается другой процесс

        }

        // 2 - Ключевое слово throws
        FileInputStream file = new FileInputStream("C:\\text.txt");
        // Если файл не будет найден, то сработает исключение на уровне метода и
        // выполнение кода будет прервано. Но без сигнатуры throws FileNotFoundException
        // код вообще не будет запущен, так как IDE подчеркивает его красным и
        // не дает его компилировать


        System.out.println("finished 3");  // finished 3
        System.out.println("exited 4");  // exited 4
    }
}
