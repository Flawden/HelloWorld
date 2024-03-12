package com.flawden.module2.homework3;

public abstract class Transport {

    private String modelName;

    private int wheelsCount;

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
        if (wheelsCount <= 0) {
            System.out.println("Ошибка! Транспорт должен иметь хотя бы одно колесо");
            return;
        }
        this.wheelsCount = wheelsCount;
    }

    public abstract void service();

}

