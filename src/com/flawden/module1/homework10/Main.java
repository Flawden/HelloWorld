package com.flawden.module1.homework10;

public class Main {

    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName =  middleName + " " + firstName + " " + lastName;
        task1(fullName);
        System.out.println();
        task2(fullName);
        System.out.println();
        task3("Иванов Семён Семёнович");
    }

    /*
    Задача 1
    Представьте, что вы работаете в небольшой компании. Данные сотрудников хранятся в
    неструктурированном формате. Бухгалтерия попросила написать программу, в которой
    можно работать с Ф. И. О. сотрудников.
    Напишите четыре строки:
        С именем firstName — для хранения имени.
        С именем middleName — для хранения отчества.
        С именем lastName — для хранения фамилии.
        С именем fullName — для хранения Ф. И. О. сотрудника в формате «Фамилия Имя
        Отчество».
    Выведите в консоль фразу: «Ф. И. О. сотрудника — …».
    В качестве данных для задачи используйте Ivanov Ivan Ivanovich.
     */
    private static void task1(String fullName) {
        System.out.println(fullName);
    }

    /*
    Задача 2
    Для ежемесячного отчета и ведения документации бухгалтерии нужны Ф. И. О. сотрудников,
    полностью написанные заглавными буквами (верхним регистром).
    Напишите программу, которая изменит написание Ф. И. О. сотрудника с Ivanov Ivan
    Ivanovich на полностью заглавные буквы.
    В качестве строки с исходными данными используйте строку fullName.
    Результат программы выведите в консоль в формате: «Данные Ф. И. О. сотрудника для
    заполнения отчета — …».
     */
    private static void task2(String fullname) {
        System.out.println(fullname.toUpperCase());
    }

    /*
    Задача 3
    Система, в которой мы работаем, не принимает символ «ё». Напишите программу, которая заменяет символ «ё» на символ «е».
    В качестве исходных данных используйте строку fullName и данные в ней — «Иванов Семён Семёнович».
    Выведите результат программы в консоль в формате: «Данные Ф. И. О. сотрудника — ...».
     */
    private static void task3(String fullname) {
        System.out.println(fullname.replace('ё', 'е'));
    }

}
