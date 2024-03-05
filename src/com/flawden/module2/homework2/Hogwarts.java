package com.flawden.module2.homework2;

import java.util.List;

public class Hogwarts {

    private List<Gryffindor> gryffindors;
    private List<Slytherin> slytherins;
    private List<Hufflepuff> hufflepuffs;
    private List<Ravenclaw> ravenclaws;

    public Hogwarts(List<Gryffindor> gryffindors, List<Slytherin> slytherins, List<Hufflepuff> hufflepuffs, List<Ravenclaw> ravenclaws) {
        this.gryffindors = gryffindors;
        this.slytherins = slytherins;
        this.hufflepuffs = hufflepuffs;
        this.ravenclaws = ravenclaws;
    }

    public List<Gryffindor> getGryffindors() {
        return gryffindors;
    }

    public void setGryffindors(List<Gryffindor> gryffindors) {
        this.gryffindors = gryffindors;
    }

    public List<Slytherin> getSlytherins() {
        return slytherins;
    }

    public void setSlytherins(List<Slytherin> slytherins) {
        this.slytherins = slytherins;
    }

    public List<Hufflepuff> getHufflepuffs() {
        return hufflepuffs;
    }

    public void setHufflepuffs(List<Hufflepuff> hufflepuffs) {
        this.hufflepuffs = hufflepuffs;
    }

    public List<Ravenclaw> getRavenclaws() {
        return ravenclaws;
    }

    public void setRavenclaws(List<Ravenclaw> ravenclaws) {
        this.ravenclaws = ravenclaws;
    }
}
