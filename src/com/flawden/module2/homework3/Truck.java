package com.flawden.module2.homework3;

public class Truck extends Transport implements HasWheels, HasEngine {

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
        System.out.println("Материмся на автомеханическом");
        System.out.println("Осознаем, что тут работы на неделю");
        System.out.println("Работаем");
        System.out.println("Работаем");
        System.out.println("Работаем");
        System.out.println("Работаем");
        System.out.println("Собираем");
        System.out.println("Проверяем");
        System.out.println("Понимаем, что все сломалось");
        System.out.println("Разбираем");
        System.out.println("Работаем");
        System.out.println("Работаем");
        System.out.println("Работаем");
        System.out.println("Работаем");
        System.out.println("Работаем");
        System.out.println("Собираем");
        System.out.println("Ремонт окончен");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void updateTyre() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Берем здоровенный домкрат.  ");
            System.out.println("Меняем покрышку");
        }
    }

    @Override
    public void service() {
        System.out.println("Начато обслуживание грузовика: " + getModelName());
        updateTyre();
        checkEngine();
        checkTrailer();
        System.out.println();
    }
}
