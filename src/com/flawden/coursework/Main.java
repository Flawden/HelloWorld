package com.flawden.coursework;

import com.flawden.coursework.util.Tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static EmployeeBook employeeBook = new EmployeeBook();

    /*
    Курсовое задание. Книга сотрудников
    Описание задачи:
    Напишите программу, которая занимается учетом сотрудников и помогает кадрам и бухгалтерии автоматизировать процессы.
    С помощью вашей программы бухгалтерия и отдел кадров смогут узнавать следующую информацию:

    Получить список всех сотрудников;
    Посчитать сумму затрат на ЗП;
    Найти сотрудника с минимальной ЗП;
    Найти сотрудника с максимальной ЗП;
    Подсчитать среднее значение зарплат.
    Далее описаны пункты, которые нужно реализовать, чтобы сделать задание. Обратите внимание, что у задания три уровня сложности в зависимости от проработки вашей программы – необходимо сделать базовые пункты, задачи с повышенной сложностью и очень сложные – по желанию.

    Рекомендуем вам прочитать все условия и выполнять их постепенно. Уверены, у вас получится сделать задание полностью!
     */

    public static void main(String[] args) {
        employeesInitializer();
        basicDifficult();
        increasedDifficulty();
        veryDifficult();
    }

//    private static void employeesInitializer(Employee [] employees) {
//        employees[0] = new Employee("Олег", "Дмитриевич", "Малысев", 1, 30000);
//        employees[1] = new Employee("Сергей", "Владимирович", "Алишев", 2, 25000);
//        employees[2] = new Employee("Владимир", "Дмитриевич", "Габк", 2, 300000);
//        employees[3] = new Employee("Анна", "Степановна", "Гусева", 4, 1000);
//        employees[4] = new Employee("Елена", "Валерьевна", "Борс", 5, 30000);
//        employees[5] = new Employee("Тохтамыш", "Ханович", "Монгол", 3, 15000);
//        employees[6] = new Employee("Валерий", "Леонтьев", "Ясный", 3, 22000);
//        employees[7] = new Employee("Сидор", "Владимирович", "Пивоваров", 2, 130000);
//        employees[8] = new Employee("Олег", "Ярославович", "Соломенный", 1, 210000);
//        employees[9] = new Employee("Спаниель", "Дмитриевич", "Гав", 1, 130000);
//    }

    private static void employeesInitializer() {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Олег", "Дмитриевич", "Малысев", 1, 30000);
        employees[1] = new Employee("Сергей", "Владимирович", "Алишев", 2, 25000);
        employees[2] = new Employee("Владимир", "Дмитриевич", "Габк", 2, 300000);
        employees[3] = new Employee("Анна", "Степановна", "Гусева", 4, 1000);
        employees[4] = new Employee("Елена", "Валерьевна", "Борс", 5, 30000);
        employees[5] = new Employee("Тохтамыш", "Ханович", "Монгол", 3, 15000);
        employees[6] = new Employee("Валерий", "Леонтьев", "Ясный", 3, 22000);
        employees[7] = new Employee("Сидор", "Владимирович", "Пивоваров", 2, 130000);
        employees[8] = new Employee("Олег", "Ярославович", "Соломенный", 1, 210000);
        employees[9] = new Employee("Спаниель", "Дмитриевич", "Гав", 1, 130000);
        for (Employee employee: employees) {
            if (employeeBook.addEmployee(employee)) {
                System.out.println("Сотрудник добавлен");
            } else {
                System.out.println("Ошибка! Для сотрудника не осталось места.");
            }
        }
    }

    /*
    Базовая сложность
     - Создать класс Employee, который содержит информацию о ФИО, отделе и зарплате сотрудника.
     Отделы для простоты должны быть названы от 1 до 5.
     - Добавить статическую переменную-счетчик, которая будет отвечать за id.
     - Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик
     увеличивает свое значение.
     - Скрыть прямой доступ к полям класса Employee и добавить возможность получать значения
     полей (геттеры) и устанавливать значения полей отдела и зарплаты (сеттеры).
     -Реализовать в классе Employee контракты equals и hashCode.
     -По-умолчанию все поля должны передавать через конструктор (кроме id) и заполняться в
     нем (включая id, который нужно получить из счетчика).
     - Создать внутри класса Main метод main и поле типа Employee[10], которое будет выполнять
     роль "хранилища" для записей о сотрудниках.
     -Создать статические методы, которые будут взаимодействовать с массивом из пункта 6 и
     возвращать результат:
         - Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль
         значения всех полей (toString));
         - Посчитать сумму затрат на ЗП в месяц;
         - Найти сотрудника с минимальной ЗП;
         - Найти сотрудника с максимальной ЗП;
         - Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b);
         - Распечатать ФИО всех сотрудников (метод ничего).
     */
    private static void basicDifficult() {
        employeeBook.employeesPrinter();
        employeeBook.salarySum();
        employeeBook.minSalary();
        employeeBook.maxSalary();
        employeeBook.averageSalary();
        employeeBook.fullnamePrinter();
    }

    /*
    Повышенная сложность
    Создать дополнительные статические методы для решения следующих задач.
    - Проиндексировать зарплату (вызвать изменение зп у всех сотрудников на величину
    аргумента в %)
    - Получить в качестве параметра номер отдела (1-5) и найти (всего 6 методов):
    - Сотрудника с минимальной зп;
    - Сотрудника с максимальной зп;
    - Сумму затрат на зп по отделу;
    - Среднюю зп по отделу (учесть, что количество людей в отделе отличается
    от employees.length);
    - Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в
    качестве параметра;
    - Напечатать всех сотрудников отдела (все данные, кроме отдела).
    - Получить в качестве параметра число и вывести:
    - Всех сотрудников с зп меньше числа (распечатать id, фио и зп в консоль);
    - Всех сотрудников с зп больше (или равно) числа (распечатать id, фио и зп в консоль).
     */

    private static void increasedDifficulty() {
        employeeBook.salaryIncreaseInPercent(10);
        employeeBook.salaryIncreaseInPercent(20);
        employeeBook.salaryIncreaseInPercent(-10);
        employeeBook.salaryIncreaseInPercent(0);
        employeeBook.findEmployeesByDepartment(-1);
        employeeBook.findEmployeesByDepartment(0);
        employeeBook.findEmployeesByDepartment(-6);
        Employee[] employeesByDepartment = employeeBook.findEmployeesByDepartment(1);
        employeeBook.minSalary(1);
        employeeBook.maxSalary(1);
        employeeBook.salarySum(1);
        employeeBook.averageSalary(1);
        employeeBook.salaryIncreaseInPercent(10, 1);
        employeeBook.salaryIncreaseInPercent(20, 1);
        System.out.println();
        employeeBook.employeesPrinter(1);
        employeeBook.minSalary();
        employeeBook.maxSalary(2);
        employeeBook.salarySum(2);
        employeeBook.averageSalary(2);
        employeeBook.salaryIncreaseInPercent(10, 2);
        employeeBook.salaryIncreaseInPercent(20, 2);
        System.out.println();
        employeeBook.employeesPrinter(2);
    }

    /*
    Очень сложно
    Привести структуру проекта к ООП.
    - Создать класс EmployeeBook;
    - Перенести массив с сотрудниками в класс EmployeeBook, закрыть к нему доступ извне (сделать приватным);
    - Все статические методы по работе с массивом перенести в этот класс и сделать не статическими;
    - Добавить методы для управления внутренним массивом в EmployeeBook:
    - Добавить нового сотрудника. (метод должен найти свободную ячейку в массиве и положить нового сотрудника в нее. Поиск свободных ячеек происходит с начала массива. Если свободных мест для сотрудника нет, то метод должен вернуть false, если для сотрудника нашлось место, то метод должен вернуть true)
    - Удалить сотрудника (находим сотрудника по id, нуллим его ячейку в массиве);
    - Добавить метод для получения сотрудника по id
    - Инициализировать в методе main EmployeeBook и проверить корректность работы методов
     */

    private static void veryDifficult() {
        System.out.println("\n" + employeeBook.getEmployeeById(2));
        employeeBook.deleteEmployee(2);
        System.out.println(employeeBook.getEmployeeById(2));
    }
}
