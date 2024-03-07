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
}
