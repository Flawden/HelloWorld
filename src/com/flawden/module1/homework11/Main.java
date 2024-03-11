package com.flawden.module1.homework11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        task1();
        System.out.println();
        try {
            task2();
        } catch (IOException e) {
            System.out.println("Все пропало");
        }
        System.out.println();
        try {
            task3();
        } catch (IOException e) {
            System.out.println("Все пропало");
        }
    }

    /*
    Задача 1
    Реализуйте метод, который получает в качестве параметра год, проверяет, является ли
    он високосным, и выводит результат в консоль.

    Эту проверку вы уже реализовывали в задании по условным операторам.

    ===================
    Текст прошлого задания:
    Напишите программу, которая определяет, является ли год високосным или нет.
    Назовите year переменную года, в которую можно подставить значение интересующего нас
    года. Например, 2021.
    Программа должна определять, високосный год или нет, и выводить соответствующее
    сообщение: « …. год является високосным» или «... год не является високосным».
    Небольшая справка: високосным является каждый четвертый год, но не является каждый
    сотый. Также високосным является каждый четырехсотый год.
    ===================

    Теперь проверку оберните в метод и используйте год, который приходит в виде параметра.
    Результат программы выведите в консоль. Если год високосный, то напечатайте сообщение:
    «...  год — високосный год». Если год невисокосный, то: «... год — невисокосный год».
     */
    private static void task1() {
        System.out.println(com.flawden.homework5.Main.task3(100));
        System.out.println(com.flawden.homework5.Main.task3(200));
        System.out.println(com.flawden.homework5.Main.task3(300));
        System.out.println(com.flawden.homework5.Main.task3(2024));
        System.out.println(com.flawden.homework5.Main.task3(2032));
        System.out.println(com.flawden.homework5.Main.task3(1984));
        System.out.println(com.flawden.homework5.Main.task3(2022));
        System.out.println(com.flawden.homework5.Main.task3(1918));
        System.out.println(com.flawden.homework5.Main.task3(2033));
    }

    /*
    Задача 2
    Вспомните задание 2 из урока «Условные операторы», где вы предлагали пользователю
    облегченную версию приложения.

    ===================
    Текст прошлого задания:
    У банка появилось мобильное приложение. Когда пользователь заходит на сайт с телефона,
    ему предлагается скачать приложение с учетом операционной системы и года выпуска
    телефона.
    Ваша задача — написать программу, которая выдает соответствующее сообщение клиенту при
    наличии двух условий.
        -Если год выпуска ранее 2015 года, то к сообщению об установке нужно добавить
        информацию об облегченной версии:
        -Для iOS оно будет звучать так: «Установите облегченную версию приложения для
        iOS по ссылке».
        -Для Android: «Установите облегченную версию приложения для Android по ссылке».
        -Для пользователей телефонов 2015 года выпуска и позже нужно вывести обычное
        предложение об установке приложения.
        -Для года создания телефона используйте переменную clientDeviceYear, в которой
        необходимо указать 2015 год.
    Важно: вложенность больше двух этажей не допускается (условный оператор внутри условного
    оператора).
    ===================

    Напишите метод, куда подаются два параметра: тип операционной системы (0 — iOS,
    1 — Android ) и год выпуска устройства.
    Если устройство старше текущего года, предложите ему установить облегченную версию.
    Текущий год можно получить таким способом:
    int currentYear = LocalDate.now().getYear();
    Или самим задать значение вручную — ввести в переменную числовое значение.
    В результате программа должна выводить в консоль сообщение, какую версию приложения
    (обычную или облегченную) и для какой ОС (Android или iOS) установить пользователю.
     */
    private static void task2() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean isIncorrect = true;
        while (isIncorrect) {
            try {
                System.out.println("Введите год вашего устройства:");
                int yearOfPhone = Integer.parseInt(bufferedReader.readLine());
                if (yearOfPhone < 1876) {
                    System.out.println("Путешественник во времени найден! Ловите его!");
                    return;
                }
                System.out.println("Введите номер вашей операционной системы из списка:\n" +
                        "0 - IOS\n" +
                        "1 - Android");
                int OSType = Integer.parseInt(bufferedReader.readLine());
                isIncorrect = false;
                versionDetector(OSType, yearOfPhone);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! На вход ожидалсь число. Давай по новой.");
            }
        }
    }

    private static void versionDetector(int osType, int yearOfPhone) {
        if (osType != 0 && osType != 1) {
            System.out.println("Ваш тип операционной системы не поддерживается");
            return;
        }
        int currentYear = LocalDate.now().getYear();
        if (currentYear == yearOfPhone) {
            newVersionLinker(osType);
        } else if (currentYear < yearOfPhone) {
            System.out.println("Ваш телефон из будущего");
        } else {
            oldVersionLinker(osType);
        }
    }

    private static void oldVersionLinker(int osType) {
        if (osType == 1) {
            System.out.println("Ваше Android устройство устарело. Ваша ссылка на " +
                    "облегченную версию: http://Облегченная-андроид-версия.да");
        } else if (osType == 0) {
            System.out.println("Ваше IOS устройство устарело. Ваша ссылка на " +
                    "облегченную версию: http://Облегченная-IOS-версия.нет");
        }
    }

    private static void newVersionLinker(int osType) {
        if (osType == 1) {
            System.out.println("Ваша ссылка на приложение Android приложение: " +
                    "http://Облегченная-андроид-версия.да");
        } else if (osType == 0) {
            System.out.println("Ваша ссылка на IOS приложение: " +
                    "http://Облегченная-IOS-версия.нет");
        }
    }

    /*
    Задача 3
    Возвращаемся к задаче на расчет дней доставки банковской карты.

    ===================
    В банке для клиентов организовывается доставка карт на дом. Чтобы известить клиента
    о том, когда будет доставлена его карта, нужно знать расстояние от офиса до адреса
    доставки.
    Правила доставки такие:
        -Доставка в пределах 20 км занимает сутки.
        -Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
        -Доставка в пределах от 60 км до 100 км добавляет еще одни сутки.
        -Свыше 100 км доставки нет.
    То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
    Напишите программу, которая выдает сообщение в консоль:
    «Потребуется дней: ... » + срок доставки.
    Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.
    ===================

    Ваша задача — доработать код, а именно написать метод, который на вход принимает
    дистанцию и возвращает итоговое количество дней доставки.
     */
    private static void task3() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите дистанцию до места доставки:");

        boolean isIncorrect = true;
        while (isIncorrect) {
            try {
                int distance = Integer.parseInt(bufferedReader.readLine());
                com.flawden.homework5.Main.task4(distance);
                isIncorrect = false;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! На вход ожидалсь число. Давай по новой.");
            }
        }
    }

}
