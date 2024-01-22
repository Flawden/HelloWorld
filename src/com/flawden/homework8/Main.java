package com.flawden.homework8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    private static Random random = new Random();
    private static int[] intArray;
    private static double[] doubleArray;
    private static int[] myOwnArray;

    public static void main(String[] args) {
    task1();
    System.out.println();
    task2();
    System.out.println();
    task3();
    System.out.println();
    task4();
    }

    /*
    Задача 1
    Объявите три массива:
        -Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого
        слова new
        -Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив
        сразу заполните значениями.
        -Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите
        способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
     */
    private static void task1() {
        intArray = new int[3];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i + 1;
        }
        doubleArray = new double[]{1.57, 7.654, 9.986};
        myOwnArray = new int[3];
        for (int i = 0; i < 3; i++) {
            myOwnArray[i] = random.nextInt(1, 10);
        }
    }

    /*
    Задача 2
    Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
    В конце строки запятую ставить не надо.
     */
    private static void task2() {
        arraysPrinter(intArray);
        arraysPrinter(doubleArray);
        arraysPrinter(myOwnArray);
    }

    private static void arraysPrinter(int[] intArray) {
        String textToOutput = Arrays.toString(intArray);
        System.out.println(textToOutput.substring(1, textToOutput.length()-1));
    }

    private static void arraysPrinter(double[] doubleArray) {
        String textToOutput = Arrays.toString(doubleArray);
        System.out.println(textToOutput.substring(1, textToOutput.length()-1));
    }

    /*
    Задача 3
    Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через
    запятую. В конце строки запятую ставить не надо.
    Если в задаче 2 в консоль у вас вывелся результат:
        -1, 2, 3
        -1.57, 7.654, 9.986
        (Произвольные элементы третьего массива)

    то в этой задаче результат должен быть таким:
        -3, 2, 1
        -9.986, 7.654, 1.57
        (Произвольные элементы третьего массива в обратном порядке)
     */
    private static void task3() {
        arraysPrinterReverse(intArray);
        arraysPrinterReverse(doubleArray);
        arraysPrinterReverse(myOwnArray);
    }


    private static void arraysPrinterReverse(int[] intArray) {
        int[] intArrayReverse = new int[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            intArrayReverse[intArray.length-i-1] = intArray[i];
        }
        String textToOutput = Arrays.toString(intArrayReverse);
        System.out.println(textToOutput.substring(1, textToOutput.length()-1));
    }

    private static void arraysPrinterReverse(double[] doubleArray) {
        double[] doubleArrayReverse = new double[doubleArray.length];
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArrayReverse[doubleArray.length-i-1] = doubleArray[i];
        }
        String textToOutput = Arrays.toString(doubleArrayReverse);
        System.out.println(textToOutput.substring(1, textToOutput.length()-1));
    }
    /*
    Задача 4
    Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными
    (нужно прибавить 1).
    Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания
    используйте циклы.
    Распечатайте результат преобразования в консоль.
     */
    private static void task4() {
        int[] startArray = new int[20];
        for (int i = 0; i < 20; i++) {
            startArray[i] = random.nextInt(1,100);
        }
        System.out.println("Изначальный массив: " + Arrays.toString(startArray));
        List<String> onlyChangedValues = new ArrayList<>();
        int[] endArray = new int[20];
        for (int i = 0; i < 20; i++) {
            if (startArray[i] % 2 != 0) {
                onlyChangedValues.add("Число под номером: " + i + ", и значением: " + startArray[i]);
                endArray[i] = startArray[i] + 1;
            } else {
                endArray[i] = startArray[i];
            }
        }
        System.out.println("Пуф!");
        System.out.println("Конечный массив: " + Arrays.toString(endArray));
        System.out.println("Были изменены следующие числа");
        for (String s: onlyChangedValues) {
            System.out.println(s);
        }
    }

}
