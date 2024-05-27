package com.flawden.module2.homework7;

public class Main {

    public static void main(String[] args) {
        StringListImpl stringList = new StringListImpl();
        for (int i = 0; i < 24; i++) {
            System.out.println(stringList.add(String.valueOf(i)));
            System.out.println(stringList.strings.length);
            System.out.println(stringList.size());
        }

        System.out.println("==========");
        System.out.println(stringList);
        System.out.println("= = = = = = =");
        stringList.add(5, "TEST");
        System.out.println(stringList);
        System.out.println("= = = = = = =");
        System.out.println(stringList.remove("TEST"));
        System.out.println(stringList);
        System.out.println(stringList.remove(1));
        System.out.println(stringList);
    }

}
