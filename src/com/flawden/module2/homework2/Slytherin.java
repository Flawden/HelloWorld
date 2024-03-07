package com.flawden.module2.homework2;

public class Slytherin extends HogwartsStudent {

    int trick;
    int determination;
    int ambition;
    int resourcefulness;
    int thirstForPower;

    public Slytherin(String name, String surname, int witchcraft, int transgressionDistance, int trick, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, surname, witchcraft, transgressionDistance);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    @Override
    public String toString() {
        return "Slytherin student: " + "\n" +
                "Name: " + name + "\n" +
                "Surname: " + surname + "\n" +
                "Trick: " + trick + "\n" +
                "Determination: " + determination + "\n" +
                "Ambition: " + ambition + "\n" +
                "Resourcefulness: " + resourcefulness + "\n" +
                "Thirst for power: " + thirstForPower + "\n" +
                "Witchcraft: " + witchcraft + "\n" +
                "The distance of transgression: " + transgressionDistance + "\n";
    }

    public static void compareStudentsByTrick(Slytherin studentOne, Slytherin studentTwo) {
        System.out.println("The following students took part in the trick comparison:");
        System.out.println(studentOne.getFullName() + " With an indicator of trick: " + studentOne.getTrick());
        System.out.println(studentTwo.getFullName() + " With an indicator of trick: " + studentTwo.getTrick());
        System.out.print("Winner: ");
        if (studentOne.getTrick() == studentTwo.getTrick()) {
            System.out.println("Nobody. Students are equal");
        }
        else if (studentOne.getTrick() > studentTwo.getTrick()) {
            System.out.println(studentOne);
        } else {
            System.out.println(studentTwo);
        }
    }

    public static void compareStudentsByDetermination(Slytherin studentOne, Slytherin studentTwo) {
        System.out.println("The following students took part in the determination comparison:");
        System.out.println(studentOne.getFullName() + " With an indicator of determination: " + studentOne.getDetermination());
        System.out.println(studentTwo.getFullName() + " With an indicator of determination: " + studentTwo.getDetermination());
        System.out.print("Winner: ");
        if (studentOne.getDetermination() == studentTwo.getDetermination()) {
            System.out.println("Nobody. Students are equal");
        }
        else if (studentOne.getDetermination() > studentTwo.getDetermination()) {
            System.out.println(studentOne);
        } else {
            System.out.println(studentTwo);
        }
    }

    public static void compareStudentsByAmbition(Slytherin studentOne, Slytherin studentTwo) {
        System.out.println("The following students took part in the ambition comparison:");
        System.out.println(studentOne.getFullName() + " With an indicator of ambition: " + studentOne.getAmbition());
        System.out.println(studentTwo.getFullName() + " With an indicator of ambition: " + studentTwo.getAmbition());
        System.out.print("Winner: ");
        if (studentOne.getAmbition() == studentTwo.getAmbition()) {
            System.out.println("Nobody. Students are equal");
        }
        else if (studentOne.getAmbition() > studentTwo.getAmbition()) {
            System.out.println(studentOne);
        } else {
            System.out.println(studentTwo);
        }
    }

    public static void compareStudentsByResourcefulness(Slytherin studentOne, Slytherin studentTwo) {
        System.out.println("The following students took part in the resourcefulness comparison:");
        System.out.println(studentOne.getFullName() + " With an indicator of resourcefulness: " + studentOne.getResourcefulness());
        System.out.println(studentTwo.getFullName() + " With an indicator of resourcefulness: " + studentTwo.getResourcefulness());
        System.out.print("Winner: ");
        if (studentOne.getResourcefulness() == studentTwo.getResourcefulness()) {
            System.out.println("Nobody. Students are equal");
        }
        else if (studentOne.getResourcefulness() > studentTwo.getResourcefulness()) {
            System.out.println(studentOne);
        } else {
            System.out.println(studentTwo);
        }
    }

    public static void compareStudentsByThirstForPower(Slytherin studentOne, Slytherin studentTwo) {
        System.out.println("The following students took part in the thirst for power comparison:");
        System.out.println(studentOne.getFullName() + " With an indicator of thirst for power: " + studentOne.getThirstForPower());
        System.out.println(studentTwo.getFullName() + " With an indicator of thirst for power: " + studentTwo.getThirstForPower());
        System.out.print("Winner: ");
        if (studentOne.getThirstForPower() == studentTwo.getThirstForPower()) {
            System.out.println("Nobody. Students are equal");
        }
        else if (studentOne.getThirstForPower() > studentTwo.getThirstForPower()) {
            System.out.println(studentOne);
        } else {
            System.out.println(studentTwo);
        }
    }

}
