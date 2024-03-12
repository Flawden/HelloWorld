package com.flawden.module2.homework3;

public class Car extends Transport implements HasWheels, HasEngine {

    @Override
    public void updateTyre() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Берем обычный домкрат.");
            System.out.println("Меняем покрышку.");
        }
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void service() {
        System.out.println("Начато обслуживание машины: " + getModelName());
        updateTyre();
        checkEngine();
        System.out.println();
    }
}
