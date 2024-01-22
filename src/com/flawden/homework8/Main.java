package com.flawden.homework8;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
    task1(1);
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
    private static void task1(int taskNum) {
        int[] intArray = new int[3];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i + 1;
        }
        double[] doubleArray = new double[]{1.57, 7.654, 9.986};
        Random random = new Random();
        int[] myOwnArray = new int[3];
        for (int i = 0; i < 3; i++) {
            myOwnArray[i] = random.nextInt(1, 10);
        }
        switch (taskNum) {
            case 2:
                arraysPrinter(intArray);
                arraysPrinter(doubleArray);
                arraysPrinter(myOwnArray);
                break;
            case 3:
                arraysPrinterReverse(intArray);
                arraysPrinterReverse(doubleArray);
                arraysPrinterReverse(myOwnArray);
        }
    }

    /*
    Задача 2
    Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
    В конце строки запятую ставить не надо.
     */
    private static void task2() {
        task1(2);
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
        task1(3);
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

    }

}
