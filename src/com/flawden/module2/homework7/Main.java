package com.flawden.module2.homework7;

public class Main {

    public static void main(String[] args) {
        StringListImpl stringList = new StringListImpl();

        System.out.println(stringList.add("padla"));
        System.out.println(stringList.strings.length);
        System.out.println(stringList.size());
        for (int i = 0; i < 30; i++) {
            System.out.println(stringList.add("padla"));
            System.out.println(stringList.strings.length);
            System.out.println(stringList.size());
        }
    }

}
