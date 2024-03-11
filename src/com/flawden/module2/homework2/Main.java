package com.flawden.module2.homework2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        solutionTester();
    }

    private static List<Gryffindor> gryffindorsInitializer() {
        List<Gryffindor> gryffindors = new ArrayList<>();
        gryffindors.add(new Gryffindor("Harry", "Potter", 90, 40, 90, 95, 90));
        gryffindors.add(new Gryffindor("Hermione", "Granger", 75, 95, 70, 96, 94));
        gryffindors.add(new Gryffindor("Ron", "Weasley", 52, 20, 90, 99, 98));
        return gryffindors;
    }

    private static List<Slytherin> slytherinsInitializer() {
        List<Slytherin> slytherins = new ArrayList<>();
        slytherins.add(new Slytherin("Draco", "Malfoy", 56, 40, 90, 80, 100, 90, 100));
        slytherins.add(new Slytherin("Graham", "Montague", 70, 45, 40, 70, 56, 60, 54));
        slytherins.add(new Slytherin("Gregory", "Goyle", 82, 52, 25, 65, 20, 45, 59));
        return slytherins;
    }

    private static List<Hufflepuff>  hufflepuffsInitializer() {
        List<Hufflepuff> hufflepuffs = new ArrayList<>();
        hufflepuffs.add(new Hufflepuff("Zachariah", "Smith", 40, 50, 90, 82, 75));
        hufflepuffs.add(new Hufflepuff("Cedric", "Diggory", 90, 65, 90, 89, 79));
        hufflepuffs.add(new Hufflepuff("Justin", "Finch-Fletchley", 84, 43, 89, 67, 43));
        return hufflepuffs;
    }

    private static List<Ravenclaw> ravenclawsInitializer() {
        List<Ravenclaw> ravenclaws = new ArrayList<>();
        ravenclaws.add(new Ravenclaw("Zhou", "Chang", 65, 87, 90, 60, 76, 78));
        ravenclaws.add(new Ravenclaw("Padma", "Patil", 76, 78, 65, 76, 56, 82));
        ravenclaws.add(new Ravenclaw("Marcus", "Belby", 63, 85, 62, 59, 49, 64));
        return ravenclaws;
    }

    private static void solutionTester() {
        Hogwarts hogwarts = new Hogwarts(gryffindorsInitializer(), slytherinsInitializer(), hufflepuffsInitializer(), ravenclawsInitializer());
        //1-2. Демонстрация учеников и их свойств:
        System.out.println(hogwarts.getGryffindors().get(2));
        System.out.println(hogwarts.getRavenclaws().get(1));
        //3. Сравним учеников по разным параметрам
        Gryffindor.compareStudentsByAllPropertiesExceptForMagic(hogwarts.getGryffindors().get(2), hogwarts.getGryffindors().get(1));
        Ravenclaw.compareStudentsByAllPropertiesExceptForMagic(hogwarts.getRavenclaws().get(1), hogwarts.getRavenclaws().get(2));
        //4. Сравним учеников по силе магии и трансгрессии
        HogwartsStudent.compareStudentsByMagic(hogwarts.getGryffindors().get(2), hogwarts.getRavenclaws().get(1));
    }
}
