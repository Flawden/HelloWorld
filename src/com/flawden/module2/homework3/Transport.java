package com.flawden.module2.homework3;

public class Transport {

    protected String modelName;
    protected int wheelsCount;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    protected void updateTyre() {
        if (wheelsCount > 0) {
            System.out.println("Меняем покрышку");
        } else {
            System.out.println("Для замены покрышки у транспорта должно быть хотя бы одно колесо");
        }
    }
}
