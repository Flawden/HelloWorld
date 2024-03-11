package com.flawden.module2.homework3;

import java.util.List;

public class ServiceStation {

    public void checkWheels(List<Transport> transports) {
        if (transports.isEmpty()) {
            System.out.println("Ну и где ваш транспорт? Пригоняй сюда хоть что-нибудь!");
            return;
        }
        for (Transport transport: transports) {
            if (transport.wheelsCount <= 0) {
                System.out.println("У вашего транспорта нет колес. Как вы вообще это сюда прикатили?");
                return;
            } else {
                for (int i = 0; i < transport.wheelsCount; i++) {
                    System.out.println("Обслуживаем: " + transport.modelName);
                    transport.updateTyre();
                }
            }
        }
    }

    public void check(Car car) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.modelName);
            for (int i = 0; i < car.wheelsCount; i++) {
                car.updateTyre();
            }
            car.checkEngine();
        }
    }

    public void check(Bicycle bicycle) {
        if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.modelName);
            for (int i = 0; i < bicycle.wheelsCount; i++) {
                bicycle.updateTyre();
            }
        }
    }

    public void check(Truck truck) {
        if (truck != null) {
            System.out.println("Обслуживаем " + truck.modelName);
            for (int i = 0; i < truck.wheelsCount; i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        }
    }

}
