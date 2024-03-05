package com.flawden.module1.coursework.util;

import com.flawden.module1.coursework.Employee;

public class Tester {

    public static boolean isValidDepartment(int department) {
        if (department < 0) {
            System.out.println("Ошибка! Номер департамента не может быть отрицательным");
            return false;
        }
        if (department > 5 || department == 0) {
            System.out.println("Ошибка! Номера департаментов начинаются с 1 и заканчиваются 5");
            return false;
        }
        else {
            return true;
        }

    }

}
