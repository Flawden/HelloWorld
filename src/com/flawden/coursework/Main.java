package com.flawden.coursework;

import com.flawden.coursework.util.Tester;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        increasedDifficulty(employees);
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

    private static void employeesPrinter(Employee[] employees, int department) {
        if (!Tester.isValidDepartment(department)) {
            return;
        }
        Employee[] employeesInDepartment = findEmployeesByDepartment(employees, department);
        System.out.println("В отделе номер " + department + " были найдены следующие сотрудники:");
        Arrays.stream(employeesInDepartment).forEach(employee -> System.out.println("Сотрудник:\n" +
                "id: " + employee.getId() + "\n" +
                "Имя: " + employee.getFirstname() + "\n" +
                "Фамилия: " + employee.getLastname() + "\n" +
                "Отчество: " + employee.getPatronymic() + "\n" +
                "Зароботная плата: " + employee.getSalary() + " рублей"));
    }

    private static void salarySum(Employee[] employees) {
        double salarySum = 0;
        for (Employee employee: employees) {
            salarySum+=employee.getSalary();
        }
        System.out.println("Итоговые затраты на зарплату: " + salarySum + " рублей.");
    }

    private static void salarySum(Employee[] employees, int department) {
        if (!Tester.isValidDepartment(department)) {
            return;
        }
        Employee[] employeesInDepartment = findEmployeesByDepartment(employees, department);
        double salarySum = 0;
        for (Employee employee: employeesInDepartment) {
            salarySum+=employee.getSalary();
        }
        System.out.println("Итоговые затраты на зарплату в отделе номер " + department + ": " + salarySum + " рублей.");
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

    private static void minSalary(Employee[] employees, int department) {
        if (!Tester.isValidDepartment(department)) {
            return;
        }
        Employee[] employeesInDepartment = findEmployeesByDepartment(employees, department);
        double minSalary = Double.MAX_VALUE;
        for (Employee employee: employeesInDepartment) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
            }
        }
        System.out.println("Минимальная зарплата в отделе номер " + department + ": " + minSalary + " рублей.");
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

    private static void maxSalary(Employee[] employees, int department) {
        if (!Tester.isValidDepartment(department)) {
            return;
        }
        Employee[] employeesInDepartment = findEmployeesByDepartment(employees, department);
        double maxSalary = 0;
        for (Employee employee: employeesInDepartment) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
            }
        }
        System.out.println("Максимальная зарплата в отделе номер " + department + ": " + maxSalary + " рублей.");
    }

    private static void averageSalary(Employee[] employees) {
        double salarySum = 0;
        for (Employee employee: employees) {
            salarySum+=employee.getSalary();
        }
        System.out.println("Средняя зарплата сотрудников: " + (salarySum/employees.length) + " рублей.");
    }

    private static void averageSalary(Employee[] employees, int department) {
        if (!Tester.isValidDepartment(department)) {
            return;
        }
        Employee[] employeesInDepartment = findEmployeesByDepartment(employees, department);
        double salarySum = 0;
        for (Employee employee: employeesInDepartment) {
            salarySum+=employee.getSalary();
        }
        System.out.println("Средняя зарплата сотрудников в отделе номер " + department + ": " + (salarySum/employeesInDepartment.length) + " рублей.");
    }

    private static void fullnamePrinter(Employee[] employees) {
        Arrays.stream(employees).forEach(employee -> System.out.println(employee.getFirstname() + " " + employee.getPatronymic() + " " + employee.getLastname()));
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

    private static void increasedDifficulty(Employee[] employees) {
        salaryIncreaseInPercent(employees, 10);
        salaryIncreaseInPercent(employees, 20);
        salaryIncreaseInPercent(employees, -10);
        salaryIncreaseInPercent(employees, 0);
        findEmployeesByDepartment(employees, -1);
        findEmployeesByDepartment(employees, 0);
        findEmployeesByDepartment(employees, -6);
        Employee[] employeesByDepartment = findEmployeesByDepartment(employees, 1);
        minSalary(employees, 1);
        maxSalary(employees, 1);
        salarySum(employees, 1);
        averageSalary(employees, 1);
        salaryIncreaseInPercent(employees, 10, 1);
        salaryIncreaseInPercent(employees, 20, 1);
        System.out.println();
        employeesPrinter(employees, 1);
        minSalary(employees, 2);
        maxSalary(employees, 2);
        salarySum(employees, 2);
        averageSalary(employees, 2);
        salaryIncreaseInPercent(employees, 10, 2);
        salaryIncreaseInPercent(employees, 20, 2);
        System.out.println();
        employeesPrinter(employees, 2);
    }

    private static void salaryIncreaseInPercent(Employee[] employees, int percent) {
        if (percent == 0) {
            System.out.println("Зарплата сотрудников не была изменена");
            return;
        }
        if (percent < 0) {
            System.out.println("Отдел охраны труда запрещает уменьшать сотрудникам размер зароботной платы, во избежание снижения уровня эффективности сотрудников");
            return;
        }
        for (Employee employee: employees) {
            System.out.println("Зарплата " + employee.getFirstname() + " " + employee.getPatronymic() + " " + employee.getLastname() + " равна " + employee.getSalary() + " до индексации.");
            employee.setSalary(employee.getSalary() / 100 * (100 + percent));
            System.out.println("Зарплата " + employee.getFirstname() + " " + employee.getPatronymic() + " " + employee.getLastname() + " равна " + employee.getSalary() + " после индексации.");
        }
    }

    private static void salaryIncreaseInPercent(Employee[] employees, int percent, int department) {
        if (!Tester.isValidDepartment(department)) {
            return;
        }
        if (percent == 0) {
            System.out.println("Зарплата сотрудников не была изменена");
            return;
        }
        if (percent < 0) {
            System.out.println("Отдел охраны труда запрещает уменьшать сотрудникам размер зароботной платы, во избежание снижения уровня эффективности сотрудников");
            return;
        }
        Employee[] employeesInDepartment = findEmployeesByDepartment(employees, department);
        System.out.println("Информация по индексации отдела номер " + department + ":");
        for (Employee employee: employeesInDepartment) {
            System.out.println("Зарплата " + employee.getFirstname() + " " + employee.getPatronymic() + " " + employee.getLastname() + " равна " + employee.getSalary() + " до индексации.");
            employee.setSalary(employee.getSalary() / 100 * (100 + percent));
            System.out.println("Зарплата " + employee.getFirstname() + " " + employee.getPatronymic() + " " + employee.getLastname() + " равна " + employee.getSalary() + " после индексации.");
        }
    }

    private static Employee[] findEmployeesByDepartment(Employee[] employees, int department) {
        if (!Tester.isValidDepartment(department)) {
            return new Employee[0];
        }
        List<Employee> employeesByDepartment = new ArrayList<>();
        for (Employee employee: employees) {
            if (employee.getDepartment() == department) {
                employeesByDepartment.add(employee);
            }
        }
        return employeesByDepartment.toArray(new Employee[0]);
    }

}
