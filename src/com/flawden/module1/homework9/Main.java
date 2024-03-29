package com.flawden.module1.homework9;

import java.util.Random;

public class Main {

    /*
    Вводная часть
    Представьте, что вы работаете в компании и помогаете коллегам разбираться с рабочими
    вопросами. К вам обращаются сотрудники из бухгалтерии.
    Каждый день месяца, включая выходные, компания тратит некую сумму. Суммы записываются
    в бухгалтерскую книгу по дням. В книге 30 записей разных чисел, которые варьируются от 100 000 до 200 000.
    Создайте модель бухгалтерской книги — массив из случайных чисел от 100 000 до 200 000.
    На основе этого массива решите задачи.
     */

    public static void main(String[] args) {
        Random random = new Random();
        double[] arrayOfExpenses = new double[30];
        System.out.println("Стартовый массив следующий:");
        for (int i = 0; i < arrayOfExpenses.length; i++) {
            arrayOfExpenses[i] = random.nextInt(100_000, 200_000);
            System.out.println("Транзакция №" + (i+1) + " равна " + arrayOfExpenses[i]);
        }
        System.out.println("Сумма трат за месяц составила " + task1(arrayOfExpenses) + " рублей.");
        System.out.println();
        task2(arrayOfExpenses);
        System.out.println();
        task3(arrayOfExpenses);
        System.out.println();
        task4();
    }

    /*
    Задача 1
    Бухгалтеры попросили посчитать сумму всех выплат за месяц.
    Напишите программу, которая решит эту задачу, и выведите в консоль результат в
    формате: «Сумма трат за месяц составила … рублей».
     */
    private static double task1(double[] arrayOfExpenses) {
        double total = 0;
        for (int i = 0; i < arrayOfExpenses.length; i++) {
            total+=arrayOfExpenses[i];
        }
        return total;
    }

    /*
    Задача 2
    Также бухгалтерия попросила найти минимальную и максимальную трату за день.
    Напишите программу, которая решит эту задачу, и выведите в консоль результат в
    формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат
    за день составила … рублей».
     */
    private static void task2(double[] arrayOfExpenses) {
        double min = arrayOfExpenses[0];
        double max = arrayOfExpenses[0];
        for (int i = 0; i < arrayOfExpenses.length; i++) {
            if(arrayOfExpenses[i] > max) {
                max = arrayOfExpenses[i];
            }
            if(arrayOfExpenses[i] < min) {
                min = arrayOfExpenses[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей.\n" +
                "Максимальная сумма трат за день составила " + max + " рублей");
    }

    /*
    Задача 3
    Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение
    30 дней.
    Напишите программу, которая посчитает среднее значение трат за месяц (то есть сумму
    всех трат за месяц поделить на количество дней), и выведите в консоль результат в
    формате: «Средняя сумма трат за месяц составила … рублей».
    Важно помнить: подсчет среднего значения может иметь остаток, то есть быть не целым,
    а дробным числом.
     */
    private static void task3(double[] arrayOfExpenses) {
        double average = task1(arrayOfExpenses) / 30;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
    }

    /*
    Задача 4
    В бухгалтерской книге появился баг. Что-то пошло не так: фамилии и имена сотрудников
    начали отображаться в обратную сторону. Т. е. вместо «Иванов Иван» мы имеем «навИ
    вонавИ». Данные с именами сотрудников хранятся в виде массива символов char[ ].
    Напишите код, который в случае такого бага будет выводить фамилии и имена сотрудников
    в корректном виде. В качестве данных для массива используйте:
        -char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
    В результате в консоль должно быть выведено: Ivanov Ivan.

    Важно: не используйте дополнительные массивы для решения этой задачи. Необходимо
    корректно пройти по массиву циклом и распечатать его элементы в правильном порядке.
     */
    private static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

}
