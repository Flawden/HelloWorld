package com.flawden.module2.homework3;

public class Truck extends Transport implements HasWheels, HasEngine {

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void updateTyre() {
        if (this.getWheelsCount() > 0) {
            System.out.println("Берем здоровенный домкрат.");
            System.out.println("Меняем покрышку");
        } else {
            System.out.println("Для замены покрышки у транспорта должно быть хотя бы одно колесо");
        }
    }
}
