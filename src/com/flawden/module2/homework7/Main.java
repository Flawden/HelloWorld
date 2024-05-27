package com.flawden.module2.homework7;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        StringListImpl stringList = new StringListImpl();
        for (int i = 0; i < 24; i++) {
            System.out.println(stringList.add(String.valueOf(i)));
            System.out.println(stringList.strings.length);
            System.out.println(stringList.size());
        }

        StringListImpl stringList2 = new StringListImpl();
        for (int i = 0; i < 24; i++) {
            System.out.println(stringList2.add(String.valueOf(i)));
            System.out.println(stringList2.strings.length);
            System.out.println(stringList2.size());
        }

        StringListImpl stringList3 = new StringListImpl();
        for (int i = 0; i < 24; i++) {
            System.out.println(stringList3.add(String.valueOf(i)));
            System.out.println(stringList3.strings.length);
            System.out.println(stringList3.size());
        }

        System.out.println("==========");
        System.out.println(stringList);
        System.out.println("= = = = = = =");
        stringList.add(5, "TEST");
        System.out.println(stringList);
        System.out.println("= = = = = = =");
        System.out.println(stringList.remove("TEST"));
        System.out.println(stringList);
        System.out.println(stringList.contains("23"));
        System.out.println(stringList.contains("4e213412"));
        System.out.println(stringList.indexOf("23"));
        System.out.println(stringList.lastIndexOf("0"));
        System.out.println(stringList.remove(1));
        System.out.println(stringList);

        System.out.println(stringList.equals(stringList2));
        System.out.println(stringList2.equals(stringList3));
        StringListImpl stringList4 = null;
        stringList.clear();
        System.out.println(stringList);
        System.out.println(stringList.toArray());
        System.out.println(stringList.equals(stringList4));
    }

}
