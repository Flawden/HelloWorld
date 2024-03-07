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
}
