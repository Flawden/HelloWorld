package com.flawden.module2.homework2;

public class Ravenclaw extends HogwartsStudent {

    int mind;
    int wisdom;
    int wit;

    int creativity;

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public Ravenclaw(String name, String surname, int witchcraft, int transgressionDistance, int mind, int wisdom, int wit, int creativity) {
        super(name, surname, witchcraft, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw student:" + "\n" +
                "Name: " + name + "\n" +
                "Surname: " + surname + "\n" +
                "Mind: " + mind + "\n" +
                "Wisdom: " + wisdom + "\n" +
                "Wit: " + wit + "\n" +
                "Creativity: " + creativity + "\n" +
                "Witchcraft: " + witchcraft + "\n" +
                "The distance of transgression: " + transgressionDistance + "\n";
    }

    public static void compareStudentsByMind(Ravenclaw studentOne, Ravenclaw studentTwo) {
        System.out.println("The following students took part in the mind comparison:");
        System.out.println(studentOne.getFullName() + " with an indicator of mind: " + studentOne.getMind());
        System.out.println(studentTwo.getFullName() + " with an indicator of mind: " + studentTwo.getMind());
        System.out.print("Winner: ");
        if (studentOne.getMind() == studentTwo.getMind()) {
            System.out.println("Nobody. Students are equal");
        } else if (studentOne.getMind() > studentTwo.getMind()) {
            System.out.println(studentOne);
        } else {
            System.out.println(studentTwo);
        }
    }

        public static void compareStudentsByWisdom(Ravenclaw studentOne, Ravenclaw studentTwo) {
            System.out.println("The following students took part in the wisdom comparison:");
            System.out.println(studentOne.getFullName() + " with an indicator of wisdom: " + studentOne.getWisdom());
            System.out.println(studentTwo.getFullName() + " with an indicator of wisdom: " + studentTwo.getWisdom());
            System.out.print("Winner: ");
            if (studentOne.getWisdom() == studentTwo.getWisdom()) {
                System.out.println("Nobody. Students are equal");
            }
            else if (studentOne.getWisdom() > studentTwo.getWisdom()) {
                System.out.println(studentOne);
            } else {
                System.out.println(studentTwo);
            }
        }

    public static void compareStudentsByWit(Ravenclaw studentOne, Ravenclaw studentTwo) {
        System.out.println("The following students took part in the wit comparison:");
        System.out.println(studentOne.getFullName() + " with an indicator of wit: " + studentOne.getWit());
        System.out.println(studentTwo.getFullName() + " with an indicator of wit: " + studentTwo.getWit());
        System.out.print("Winner: ");
        if (studentOne.getWit() == studentTwo.getWit()) {
            System.out.println("Nobody. Students are equal");
        }
        else if (studentOne.getWit() > studentTwo.getWit()) {
            System.out.println(studentOne);
        } else {
            System.out.println(studentTwo);
        }
    }

    public static void compareStudentsByCreativity(Ravenclaw studentOne, Ravenclaw studentTwo) {
        System.out.println("The following students took part in the creativity comparison:");
        System.out.println(studentOne.getFullName() + " with an indicator of creativity: " + studentOne.getCreativity());
        System.out.println(studentTwo.getFullName() + " with an indicator of creativity: " + studentTwo.getCreativity());
        System.out.print("Winner: ");
        if (studentOne.getCreativity() == studentTwo.getCreativity()) {
            System.out.println("Nobody. Students are equal");
        }
        else if (studentOne.getCreativity() > studentTwo.getCreativity  ()) {
            System.out.println(studentOne);
        } else {
            System.out.println(studentTwo);
        }
    }
}

