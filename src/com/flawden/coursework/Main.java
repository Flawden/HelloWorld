package com.flawden.coursework;

import java.util.Arrays;

public class Main {

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
        Employee[] employees = new Employee[10];
        employeesInitializer(employees);
        basicDifficult(employees);
    }

    private static void employeesInitializer(Employee [] employees) {
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
    }

    /*
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
    private static void basicDifficult(Employee[] employees) {
        employeesPrinter(employees);
        salarySum(employees);
        minSalary(employees);
        maxSalary(employees);
        averageSalary(employees);
        fullnamePrinter(employees);
    }

    private static void employeesPrinter(Employee[] employees) {
        Arrays.stream(employees).forEach(System.out::print);
    }

    private static void salarySum(Employee[] employees) {
        double salarySum = 0;
        for (Employee employee: employees) {
            salarySum+=employee.getSalary();
        }
        System.out.println("Итоговые затраты на зарплату: " + salarySum + " рублей.");
    }

    private static void minSalary(Employee[] employees) {
        double minSalary = Double.MAX_VALUE;
        for (Employee employee: employees) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
            }
        }
        System.out.println("Минимальная зарплата: " + minSalary + " рублей.");
    }

    private static void maxSalary(Employee[] employees) {
        double maxSalary = 0;
        for (Employee employee: employees) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
            }
        }
        System.out.println("Максимальная зарплата: " + maxSalary + " рублей.");
    }

    private static void averageSalary(Employee[] employees) {
        double salarySum = 0;
        for (Employee employee: employees) {
            salarySum+=employee.getSalary();
        }
        System.out.println("Средняя зарплата сотрудников: " + (salarySum/employees.length) + " рублей.");
    }

    private static void fullnamePrinter(Employee[] employees) {
        Arrays.stream(employees).forEach(employee -> System.out.println(employee.getFirstname() + " " + employee.getPatronymic() + " " + employee.getLastname()));
    }
}
