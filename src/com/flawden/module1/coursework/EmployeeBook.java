package com.flawden.module1.coursework;

import com.flawden.module1.coursework.util.Tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeBook {

    private Employee[] employees = new Employee[10];

    public Employee[] getEmployees() {
        return employees;
    }

    protected boolean addEmployee(Employee employee) {
        for (int counter = 0; counter < employees.length; counter++) {
            if (employees[counter] == null) {
                employees[counter] = employee;
                return true;
            }
        }
        return false;
    }

    protected void deleteEmployee(int id) {
        employees[id] = null;
    }

    protected Employee getEmployeeById(int id) {
        return employees[id];
    }

    protected void employeesPrinter() {
        Arrays.stream(employees).forEach(System.out::print);
    }

    protected void employeesPrinter(int department) {
        if (!Tester.isValidDepartment(department)) {
            return;
        }
        Employee[] employeesInDepartment = findEmployeesByDepartment(department);
        System.out.println("В отделе номер " + department + " были найдены следующие сотрудники:");
        Arrays.stream(employeesInDepartment).forEach(employee -> System.out.println("Сотрудник:\n" +
                "id: " + employee.getId() + "\n" +
                "Имя: " + employee.getFirstname() + "\n" +
                "Фамилия: " + employee.getLastname() + "\n" +
                "Отчество: " + employee.getPatronymic() + "\n" +
                "Зароботная плата: " + employee.getSalary() + " рублей"));
    }

    protected void salarySum() {
        double salarySum = 0;
        for (Employee employee : employees) {
            salarySum += employee.getSalary();
        }
        System.out.println("Итоговые затраты на зарплату: " + salarySum + " рублей.");
    }

    protected void salarySum(int department) {
        if (!Tester.isValidDepartment(department)) {
            return;
        }
        Employee[] employeesInDepartment = findEmployeesByDepartment(department);
        double salarySum = 0;
        for (Employee employee : employeesInDepartment) {
            salarySum += employee.getSalary();
        }
        System.out.println("Итоговые затраты на зарплату в отделе номер " + department + ": " + salarySum + " рублей.");
    }

    protected void minSalary() {
        double minSalary = Double.MAX_VALUE;
        for (Employee employee : employees) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
            }
        }
        System.out.println("Минимальная зарплата: " + minSalary + " рублей.");
    }

    protected void minSalary(int department) {
        if (!Tester.isValidDepartment(department)) {
            return;
        }
        Employee[] employeesInDepartment = findEmployeesByDepartment(department);
        double minSalary = Double.MAX_VALUE;
        for (Employee employee : employeesInDepartment) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
            }
        }
        System.out.println("Минимальная зарплата в отделе номер " + department + ": " + minSalary + " рублей.");
    }

    protected void maxSalary() {
        double maxSalary = 0;
        for (Employee employee : employees) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
            }
        }
        System.out.println("Максимальная зарплата: " + maxSalary + " рублей.");
    }

    protected void maxSalary(int department) {
        if (!Tester.isValidDepartment(department)) {
            return;
        }
        Employee[] employeesInDepartment = findEmployeesByDepartment(department);
        double maxSalary = 0;
        for (Employee employee : employeesInDepartment) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
            }
        }
        System.out.println("Максимальная зарплата в отделе номер " + department + ": " + maxSalary + " рублей.");
    }

    protected void averageSalary() {
        double salarySum = 0;
        for (Employee employee : employees) {
            salarySum += employee.getSalary();
        }
        System.out.println("Средняя зарплата сотрудников: " + (salarySum / employees.length) + " рублей.");
    }

    protected void averageSalary(int department) {
        if (!Tester.isValidDepartment(department)) {
            return;
        }
        Employee[] employeesInDepartment = findEmployeesByDepartment(department);
        double salarySum = 0;
        for (Employee employee : employeesInDepartment) {
            salarySum += employee.getSalary();
        }
        System.out.println("Средняя зарплата сотрудников в отделе номер " + department + ": " + (salarySum / employeesInDepartment.length) + " рублей.");
    }

    protected void fullnamePrinter() {
        Arrays.stream(employees).forEach(employee -> System.out.println(employee.getFirstname() + " " + employee.getPatronymic() + " " + employee.getLastname()));
    }

    protected void salaryIncreaseInPercent(int percent) {
        if (percent == 0) {
            System.out.println("Зарплата сотрудников не была изменена");
            return;
        }
        if (percent < 0) {
            System.out.println("Отдел охраны труда запрещает уменьшать сотрудникам размер зароботной платы, во избежание снижения уровня эффективности сотрудников");
            return;
        }
        for (Employee employee : employees) {
            System.out.println("Зарплата " + employee.getFirstname() + " " + employee.getPatronymic() + " " + employee.getLastname() + " равна " + employee.getSalary() + " до индексации.");
            employee.setSalary(employee.getSalary() / 100 * (100 + percent));
            System.out.println("Зарплата " + employee.getFirstname() + " " + employee.getPatronymic() + " " + employee.getLastname() + " равна " + employee.getSalary() + " после индексации.");
        }
    }

    protected void salaryIncreaseInPercent(int percent, int department) {
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
        Employee[] employeesInDepartment = findEmployeesByDepartment(department);
        System.out.println("Информация по индексации отдела номер " + department + ":");
        for (Employee employee : employeesInDepartment) {
            System.out.println("Зарплата " + employee.getFirstname() + " " + employee.getPatronymic() + " " + employee.getLastname() + " равна " + employee.getSalary() + " до индексации.");
            employee.setSalary(employee.getSalary() / 100 * (100 + percent));
            System.out.println("Зарплата " + employee.getFirstname() + " " + employee.getPatronymic() + " " + employee.getLastname() + " равна " + employee.getSalary() + " после индексации.");
        }
    }

    protected Employee[] findEmployeesByDepartment(int department) {
        if (!Tester.isValidDepartment(department)) {
            return new Employee[0];
        }
        List<Employee> employeesByDepartment = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                employeesByDepartment.add(employee);
            }
        }
        return employeesByDepartment.toArray(new Employee[0]);
    }
}
