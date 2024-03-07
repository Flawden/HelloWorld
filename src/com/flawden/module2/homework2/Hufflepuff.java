package com.flawden.module2.homework2;

public class Hufflepuff extends HogwartsStudent {

    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, String surname, int witchcraft, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(name, surname, witchcraft, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public String toString() {
        return "Hufflepuff student: " + "\n" +
                "Name: " + name + "\n" +
                "Surname: " + surname + "\n" +
                "Hardworking: " + hardworking + "\n" +
                "Loyal: " + loyal + "\n" +
                "Honest: " + honest + "\n" +
                "Witchcraft: " + witchcraft + "\n" +
                "The distance of transgression: " + transgressionDistance + "\n";
    }

    public static void compareStudentsByHardworking(Hufflepuff studentOne, Hufflepuff studentTwo) {
        System.out.println("The following students took part in the hardworking comparison:");
        System.out.println(studentOne.getFullName() + " with an indicator of hardworking: " + studentOne.getHardworking());
        System.out.println(studentTwo.getFullName() + " with an indicator of hardworking: " + studentTwo.getHardworking());
        System.out.print("Winner: ");
        if (studentOne.getHardworking() == studentTwo.getHardworking()) {
            System.out.println("Nobody. Students are equal");
        }
        else if (studentOne.getHardworking() > studentTwo.getHardworking()) {
            System.out.println(studentOne);
        } else {
            System.out.println(studentTwo);
        }
    }

    public static void compareStudentsByLoyal(Hufflepuff studentOne, Hufflepuff studentTwo) {
        System.out.println("The following students took part in the loyal comparison:");
        System.out.println(studentOne.getFullName() + " with an indicator of loyal: " + studentOne.getLoyal());
        System.out.println(studentTwo.getFullName() + " with an indicator of loyal: " + studentTwo.getLoyal());
        System.out.print("Winner: ");
        if (studentOne.getLoyal() == studentTwo.getLoyal()) {
            System.out.println("Nobody. Students are equal");
        }
        else if (studentOne.getLoyal() > studentTwo.getLoyal()) {
            System.out.println(studentOne);
        } else {
            System.out.println(studentTwo);
        }
    }

    public static void compareStudentsByHonest(Hufflepuff studentOne, Hufflepuff studentTwo) {
        System.out.println("The following students took part in the honest comparison:");
        System.out.println(studentOne.getFullName() + " with an indicator of honest: " + studentOne.getHonest());
        System.out.println(studentTwo.getFullName() + " with an indicator of honest: " + studentTwo.getHonest());
        System.out.print("Winner: ");
        if (studentOne.getHonest() == studentTwo.getHonest()) {
            System.out.println("Nobody. Students are equal");
        }
        else if (studentOne.getHonest() > studentTwo.getHonest()) {
            System.out.println(studentOne);
        } else {
            System.out.println(studentTwo);
        }
    }

    public static void compareStudentsByAllPropertiesExceptForMagic(Hufflepuff studentOne, Hufflepuff studentTwo) {
        System.out.println("The following students took part in the comparison:");
        System.out.println(studentOne);
        System.out.println("And:");
        System.out.println(studentTwo);
        int theSumOfThePropertiesOfTheFirst = studentOne.getHardworking() + studentOne.getHonest() + studentOne.getLoyal();
        int theSumOfThePropertiesOfTheSecond = studentTwo.getHardworking() + studentTwo.getHonest() + studentTwo.getLoyal();
        System.out.println("Winner: ");
        if (theSumOfThePropertiesOfTheFirst == theSumOfThePropertiesOfTheSecond) {
            System.out.println("Nobody. Students are equal");
        }
        else if (theSumOfThePropertiesOfTheFirst > theSumOfThePropertiesOfTheSecond) {
            System.out.println(studentOne.getFullName());
        } else {
            System.out.println(studentTwo.getFullName());
        }
    }

    public static void compareStudentsByAllProperties(Hufflepuff studentOne, Hufflepuff studentTwo) {
        System.out.println("The following students took part in the comparison:");
        System.out.println(studentOne);
        System.out.println("And:");
        System.out.println(studentTwo);
        int theSumOfThePropertiesOfTheFirst = studentOne.getHardworking() + studentOne.getHonest() + studentOne.getLoyal() +  studentOne.getWitchcraft() + studentOne.getTransgressionDistance();
        int theSumOfThePropertiesOfTheSecond = studentTwo.getHardworking() + studentTwo.getHonest() + studentTwo.getLoyal() +  studentTwo.getWitchcraft() + studentTwo.getTransgressionDistance();
        System.out.println("Winner: ");
        if (theSumOfThePropertiesOfTheFirst == theSumOfThePropertiesOfTheSecond) {
            System.out.println("Nobody. Students are equal");
        }
        else if (theSumOfThePropertiesOfTheFirst > theSumOfThePropertiesOfTheSecond) {
            System.out.println(studentOne.getFullName());
        } else {
            System.out.println(studentTwo.getFullName());
        }
    }
}
