package day18_Exceptions.UncheckedExceptions;

public class FinallyBlock {
    public static void main(String[] args) {



// Кейс 1
        String s = null;
        // Сработало исключение и блок catch его обработал.
        // Результат - блок finally будет выполнен
        try {
            System.out.println(s.length());
        } catch (NullPointerException e){
            System.out.println("The 'catch' block-1 handled the exception");
            // The 'catch' block-1 handled the exception
        } finally {
            System.out.println("You have entered the 'finally-1' block");
            // You have entered the 'finally-1' block
        }


// Кейс 2
        String s1 = "test";
        // Исключение не сработало и блок catch был проигнорирован.
        // В результате был выполнен функционал из блока try, а
        // также был выполнен и блок finally
        try {
            System.out.println(s1.length());  // 4
        } catch (ArithmeticException e){
            System.out.println("The 'catch' block-2 handled the exception");
        } finally {
            System.out.println("You have entered the 'finally-2' block");
            // You have entered the 'finally-2' block
        }


//Кейс 3
        // Сработало исключение, но блок catch его не обработал.
        // Выполнение программы было прервано, но перед этим
        // был выполнен блок finally
        try {
            System.out.println(s.length());
        } catch (ArithmeticException e){
            System.out.println("The 'catch' block-3 handled the exception");
        } finally {
            System.out.println("You have entered the 'finally-3' block");
            // You have entered the 'finally-3' block
        }

    }

}
