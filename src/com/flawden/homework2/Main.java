package com.flawden.homework2;

public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Значение dog = " + dog + ", значение cat = " + cat + ", а значение paper = " + paper + ".");
        dog+=4;
        cat+=4;
        paper+=4;
        System.out.println("Значение dog теперь = " + dog + ", значение cat = " + cat + ", а значение paper = " + paper + ".");
        dog-=3.5;
        cat-=1.6;
        paper-=7639;
        System.out.println("Значение dog теперь = " + dog + ", значение cat = " + cat + ", а значение paper = " + paper + ".");
        var friend = 19;
        System.out.println("Значение friend = " + friend + ".");
        friend+= 2;
        System.out.println("Значение friend теперь = " + friend + ".");
        friend/= 7;
        System.out.println("Значение friend теперь = " + friend + ".");
        var frog = 3.5;
        System.out.println("Значение frog = " + frog + ".");
        frog*=10;
        System.out.println("Значение frog теперь = " + frog + ".");
        frog/=3.5;
        System.out.println("Значение frog теперь = " + frog + ".");
        frog+=4;
        System.out.println("Значение frog теперь = " + frog + ".");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        System.out.println("Общая масса бойцов: " + (firstBoxerWeight + secondBoxerWeight) + ".");
        System.out.print("Разница между массами бойцов: ");
        if (firstBoxerWeight > secondBoxerWeight) {
            System.out.println(firstBoxerWeight - secondBoxerWeight + ".");
        } else if (secondBoxerWeight > firstBoxerWeight) {
            System.out.println(secondBoxerWeight - firstBoxerWeight + ".");
        } else {
            System.out.println("Их массы равны.");
        }
        System.out.println("Решение задачи №7 вторым способом.");
        System.out.print("Разница между массами бойцов: ");
        if (firstBoxerWeight > secondBoxerWeight) {
            System.out.println(firstBoxerWeight % secondBoxerWeight + ".");
        } else if (secondBoxerWeight > firstBoxerWeight) {
            System.out.println(secondBoxerWeight % firstBoxerWeight + ".");
        } else {
            System.out.println("Их массы равны.");
        }
        System.out.println("Если в компании каждый сотрудник посвещает работе 8 часов, " +
                "а всего было выполнено работы на 640 часов, то:");
        var allTheTime = 640;
        var timeForOneWorker = 8;
        var workersTotal = allTheTime / timeForOneWorker;
        System.out.println("Всего работников в компании — " + workersTotal + " человек");

        var additionalEmployees = 94;
        var workersAfterAdditional = additionalEmployees + workersTotal;
        System.out.println("Если в компании работает на " + additionalEmployees + " работников больше, то:");
        System.out.println("Время работы одного сотрудника все ещё " + timeForOneWorker + " часов. Новое число сотрудников " + workersAfterAdditional);
        var allTheTimeAnother = timeForOneWorker * workersAfterAdditional;
        System.out.println("Если в компании работает " + workersAfterAdditional + " человек, то всего " + allTheTimeAnother + " часов работы может быть поделено между сотрудниками");
    }
}