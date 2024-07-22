package day5_Arrays;

public class MultipleDataTypeArray {

    public static void main(String[] args) {

        // Все точно так же как и при инициализации обычного списка,
        // однако тип данных в данном случае будет объект
        Object[] allTypeOfData = {12, 15.5, true, "some words", 'A'};

        // При выводе переменная тоже является объектом
        for (Object i : allTypeOfData) {
            System.out.print(i + " ");
        }
    }
}
