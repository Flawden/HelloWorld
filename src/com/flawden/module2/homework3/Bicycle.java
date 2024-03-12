package com.flawden.module2.homework3;

public class Bicycle extends Transport implements HasWheels {

    @Override
    public void updateTyre() {
        if (this.getWheelsCount() > 0) {
            System.out.println("Берем гаячный ключ.");
            System.out.println("Меняем покрышку.");
        } else {
            System.out.println("Для замены покрышки у транспорта должно быть хотя бы одно колесо");
        }
    }
}
