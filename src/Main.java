public class Main {
    public static void main(String[] args) {
        lesson1();
        lesson2();
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

    private static void lesson2() {
        // Задача 2: Ниже дан список различных значений. Инициализируйте переменные, используйте изученные ранее типы переменных.

        /* Значения:
        27.12
        987 678 965 549
        2,786
        569
        -159
        27897
        67
         */

        float floatVariable = 27.12f;
        long longVariable = 987678965549L;
        float floatVariable2 = 2.786f;
        short shortVariable = 569; //Ну или int.
        short shortVariable2 = -159;
        short shortVariable3 = 27897;
        byte byteVariable = 67; // Полагаю это единственный случай. когда этот тип уместен.
    }

}