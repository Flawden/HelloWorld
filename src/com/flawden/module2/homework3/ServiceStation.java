package com.flawden.module2.homework3;

import java.util.ArrayList;
import java.util.List;

public class ServiceStation {

//    public void check(Car car) {
//        if (car != null) {
//            System.out.println("Обслуживаем " + car.getModelName());
//            for (int i = 0; i < car.getWheelsCount(); i++) {
//                car.updateTyre();
//            }
//            car.checkEngine();
//        }
//    }
//
//    public void check(Bicycle bicycle) {
//        if (bicycle != null) {
//            System.out.println("Обслуживаем " + bicycle.getModelName());
//            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
//                bicycle.updateTyre();
//            }
//        }
//    }
//
//    public void check(Truck truck) {
//        if (truck != null) {
//            System.out.println("Обслуживаем " + truck.getModelName());
//            for (int i = 0; i < truck.getWheelsCount(); i++) {
//                truck.updateTyre();
//            }
//            truck.checkEngine();
//            truck.checkTrailer();
//        }
//    }

    public void check(Transport transport) {
        transport.service();
    }

}
