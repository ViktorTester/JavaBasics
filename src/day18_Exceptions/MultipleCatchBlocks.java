package day18_Exceptions;

public class MultipleCatchBlocks {
    public static void main(String[] args) {

        // 1 - Код для отображения начала программы
        System.out.println("Program is started");  // Program is started

        String s = null;

        try {
            System.out.println(s.length());
        } catch (ArithmeticException e) {
            System.out.println("Exception message 1: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Exception message 2: " + e.getMessage());
            // Exception message 2: Cannot invoke "String.length()" because "s" is null
        } catch (NumberFormatException e) {
            System.out.println("Exception message 3: " + e.getMessage());
        }

        // Не обязательно отлавливать и прописывать в коде каждое исключение отдельно,
        // можно воспользоваться классом Exception, который является родительским
        // классом всех исключений, соответственно все исключения получены из этого класса
        try {
            System.out.println(100 / 0);
        } catch (Exception e) {
            System.out.println("This is a super Exception: " + e.getMessage());
            // This is a super Exception: / by zero
        }


        // 2 - Код для отображения завершения программы
        System.out.println("Program is finished");  // Program is finished
    }
}
