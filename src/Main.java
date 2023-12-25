public class Main {
    public static void main(String[] args) {
        lesson1();
    }

    private static void lesson1() {
        // Задача 1: Объявите переменные типа int, byte, short, long, float, double.
        int intVariable = 2147483647;
        byte byteVariable = 127;
        short shortVariable = 32767;
        long longVariable = 9223372036854775807L;
        float floatVariable = 22.22222f;
        double doubleVariable = 22.2222222222222222;
        System.out.println("Значение переменной intVariable с типом int равно " + intVariable);
        System.out.println("Значение переменной byteVariable с типом byte равно " + byteVariable);
        System.out.println("Значение переменной shortVariable с типом short равно " + shortVariable);
        System.out.println("Значение переменной longVariable с типом long равно " + longVariable);
        System.out.println("Значение переменной floatVariable с типом float равно " + floatVariable);
        System.out.println("Значение переменной doubleVariable с типом double равно " + doubleVariable);
    }
}