package com.flawden.module2.homework2;

public class Gryffindor extends HogwartsStudent {

    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String surname, int witchcraft, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, surname, witchcraft, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor student:" + "\n" +
                "Name: " + name + "\n" +
                "Surname: " + surname + "\n" +
                "Nobility: " + nobility + "\n" +
                "Honor: " + honor + "\n" +
                "Bravery: " + bravery + "\n" +
                "Witchcraft: " + witchcraft + "\n" +
                "The distance of transgression: " + transgressionDistance + "\n";
    }

    public static void compareStudentsByNobility(Gryffindor studentOne, Gryffindor studentTwo) {
        System.out.println("The following students took part in the nobility comparison:");
        System.out.println(studentOne.getFullName() + " with an indicator of nobility: " + studentOne.getNobility());
        System.out.println(studentTwo.getFullName() + " with an indicator of nobility: " + studentTwo.getNobility());
        System.out.print("Winner: ");
        if (studentOne.getNobility() == studentTwo.getNobility()) {
            System.out.println("Nobody. Students are equal");
        }
        else if (studentOne.getNobility() > studentTwo.getNobility()) {
            System.out.println(studentOne);
        } else {
            System.out.println(studentTwo);
        }
    }

    public static void compareStudentsByHonor(Gryffindor studentOne, Gryffindor studentTwo) {
        System.out.println("The following students took part in the honor comparison:");
        System.out.println(studentOne.getFullName() + " with an indicator of honor: " + studentOne.getHonor());
        System.out.println(studentTwo.getFullName() + " with an indicator of honor: " + studentTwo.getHonor());
        System.out.print("Winner: ");
        if (studentOne.getHonor() == studentTwo.getHonor()) {
            System.out.println("Nobody. Students are equal");
        }
        else if (studentOne.getHonor() > studentTwo.getHonor()) {
            System.out.println(studentOne);
        } else {
            System.out.println(studentTwo);
        }
    }

    public static void compareStudentsByBravery(Gryffindor studentOne, Gryffindor studentTwo) {
        System.out.println("The following students took part in the bravery comparison:");
        System.out.println(studentOne.getFullName() + " with an indicator of bravery: " + studentOne.getBravery());
        System.out.println(studentTwo.getFullName() + " with an indicator of bravery: " + studentTwo.getBravery());
        System.out.print("Winner: ");
        if (studentOne.getBravery() == studentTwo.getBravery()) {
            System.out.println("Nobody. Students are equal");
        }
        else if (studentOne.getBravery() > studentTwo.getBravery()) {
            System.out.println(studentOne);
        } else {
            System.out.println(studentTwo);
        }
    }
}
