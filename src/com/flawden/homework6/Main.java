package com.flawden.homework6;

public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
        System.out.println();
    }

    /*
    Задача 1
    С помощью цикла for выведите в консоль все числа от 1 до 10.
     */
    private static void task1() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }

    /*
    Задача 2
    С помощью цикла for выведите в консоль все числа от 10 до 1.
     */
    private static void task2() {
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    /*
    Задача 3
    Выведите в консоль все четные числа от 0 до 17.
     */
    private static void task3() {
        for (int i = 0; i <= 17; i+=2) {
            System.out.print(i + " ");
        }
    }

    /*
    Задача 4
    Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.
     */
    private static void task4() {
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
    }

    /*
    Задача 5
    Напишите программу, которая выводит в консоль все високосные года,
    начиная с 1904 года до 2096. В консоль результат должен выводиться в формате:
    «… год является високосным».
     */
    private static void task5() {
        for (int year = 1904; year <=2096; year++) {
            if ((year % 4 == 0  &&  year % 100 != 0  ) || ( year % 400 == 0 )) {
                System.out.println(year + " год является високосным");
            }
        }
    }

    /*
    Задача 6
    Напишите программу, которая выводит в консоль последовательность чисел:
    7 14 21 28 35 42 49 56 63 70 77 84 91 98
     */
    private static void task6() {

    }

    /*
    Задача 7
    Напишите программу, которая выводит в консоль последовательность чисел:
    1 2 4 8 16 32 64 128 256 512
     */
    private static void task7() {

    }

    /*
    Задача 8
    Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете откладывать по 29 000 рублей «в банку».
    Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».
     */
    private static void task8() {

    }

    /*
    Задача 9
    Перепишите решение задачи выше при условии, что деньги вы откладывать будете не «в банку»,
    а в банк под проценты — 12% годовых. Выведите сумму накоплений за каждый месяц в консоль в
    формате: «Месяц …, сумма накоплений равна … рублей».
     */
    private static void task9() {

    }

    /*
    Задача 10
    Напишите программу, которая выводит в консоль таблицу умножения на 2:
    2*1=2
    2*2=4
    2*3=6
    2*4=8
    2*5=10
    2*6=12
    2*7=14
    2*8=16
    2*9=18
    2*10=20
     */
    private static void task10() {

    }
}
