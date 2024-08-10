package day14_Inheritance;

public class PassingParamsToMainMethod {

    // порядок написания ключевых слов имеет значение, кое-что
    // изменить можно, но злоупотреблять этим не стоит:

    // public static void main - верно
    // static public void main - верно
    // public void static main - неверно
    // void main               - неверно


    // public - означает, что метод доступен из любого места проекта
    // static - метод общий между всеми классами проекта
    // void - метод ничего не возвращает
    // main - имя метода
    // String[] args - массив строк под названием args подан как параметр (название
    // может быть любое: args, arr, a, b - какое угодно

    static public void main(String[] arr){

    }
}
