package com.flawden.module2.homework3;

public class Car extends Transport implements HasWheels, HasEngine {

    @Override
    public void updateTyre() {
        if (this.getWheelsCount() > 0) {
            System.out.println("Берем обычный домкрат.");
            System.out.println("Меняем покрышку.");
        } else {
            System.out.println("Для замены покрышки у транспорта должно быть хотя бы одно колесо");
        }
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
