package day17.pack1;

public class AccessModifiers {

    public int publicField = 100;

    protected int protectedField = 200;

    int defaultField = 300; // default по умолчанию

    private int privateField = 400;

    public void publicMethod() {
        System.out.println("Public method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    void defaultMethod() {
        System.out.println("Default method");
    }

    private void privateMethod() {
        System.out.println("Private method");
    }

    public static void main(String[] args) {

        AccessModifiers am = new AccessModifiers();

        // Доступно во всем проекте, напрямую, без ограничений
        System.out.println(am.publicField);  // 100
        am.publicMethod();  // Public method

        // Доступно в любом классе пакета pack1, а также за его пределами, но только через наследование
        System.out.println(am.protectedField);  // 200
        am.protectedMethod();  // Protected method

        // Доступно в любом классе пакета pack1
        System.out.println(am.defaultField);  // 300
        am.defaultMethod();  // Default method

        // Доступно только в main классе этого файла
        System.out.println(am.privateField);  // 400
        am.privateMethod();  // Private method
    }
}