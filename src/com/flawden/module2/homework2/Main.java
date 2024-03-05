package com.flawden.module2.homework2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Gryffindor> gryffindors = gryffindorsInitializer();
        List<Slytherin> slytherins = slytherinsInitializer();
        List<Hufflepuff> hufflepuffs = hufflepuffsInitializer();
        List<Ravenclaw> ravenclaws = ravenclawsInitializer();
    }

    private static List<Gryffindor> gryffindorsInitializer() {
        List<Gryffindor> gryffindors = new ArrayList<>();
        return gryffindors;
    }

    private static List<Slytherin> slytherinsInitializer() {
        List<Slytherin> slytherins = new ArrayList<>();
        return slytherins;
    }

    private static List<Hufflepuff>  hufflepuffsInitializer() {
        List<Hufflepuff> hufflepuffs = new ArrayList<>();
        return hufflepuffs;
    }

    private static List<Ravenclaw> ravenclawsInitializer() {
        List<Ravenclaw> ravenclaws = new ArrayList<>();
        return ravenclaws;
    }

}
