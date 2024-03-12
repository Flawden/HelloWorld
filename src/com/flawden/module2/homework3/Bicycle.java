package com.flawden.module2.homework3;

public class Bicycle extends Transport implements HasWheels {

    @Override
    public void updateTyre() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Берем гаячный ключ.");
            System.out.println("Меняем покрышку.");
        }
    }

    @Override
    public void service() {
        System.out.println("Начато обслуживание велосипеда: " + getModelName());
        updateTyre();
        System.out.println();
    }
}
