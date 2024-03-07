package com.flawden.module2.homework2;

public abstract class HogwartsStudent {

    public HogwartsStudent(String name, String surname, int witchcraft, int transgressionDistance) {
        this.name = name;
        this.surname = surname;
        this.witchcraft = witchcraft;
        this.transgressionDistance = transgressionDistance;
    }

    protected String name;
    protected String surname;
    protected int witchcraft;
    protected int transgressionDistance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    @Override
    public String toString() {
        return "Hogwarts student:" + "\n" +
                "Name: " + name + "\n" +
                "Surname: " + surname + "\n" +
                "Witchcraft: " + witchcraft + "\n" +
                "The distance of transgression: " + transgressionDistance + "\n";
    }

    public static void compareStudentsByWitchcraft(HogwartsStudent studentOne, HogwartsStudent studentTwo) {
        System.out.println("The following students took part in the witchcraft comparison:");
        System.out.println(studentOne.getFullName() + " with an indicator of witchcraft: " + studentOne.getWitchcraft());
        System.out.println(studentTwo.getFullName() + " with an indicator of witchcraft: " + studentTwo.getWitchcraft());
        System.out.print("Winner: ");
        if (studentOne.getWitchcraft() == studentTwo.getWitchcraft()) {
            System.out.println("Nobody. Students are equal");
        }
        else if (studentOne.getWitchcraft() > studentTwo.getWitchcraft()) {
            System.out.println(studentOne);
        } else {
            System.out.println(studentTwo);
        }
    }

    public static void compareStudentsByTransgressionDistance(HogwartsStudent studentOne, HogwartsStudent studentTwo) {
        System.out.println("The following students took part in the distance of transgression comparison:");
        System.out.println(studentOne.getFullName() + " with an indicator of the distance of transgression: " + studentOne.getTransgressionDistance());
        System.out.println(studentTwo.getFullName() + " with an indicator of the distance of transgression: " + studentTwo.getTransgressionDistance());
        System.out.print("Winner: ");
        if (studentOne.getTransgressionDistance() == studentTwo.getTransgressionDistance()) {
            System.out.println("Nobody. Students are equal");
        }
        else if (studentOne.getTransgressionDistance() > studentTwo.getTransgressionDistance()) {
            System.out.println(studentOne);
        } else {
            System.out.println(studentTwo);
        }
    }
}
