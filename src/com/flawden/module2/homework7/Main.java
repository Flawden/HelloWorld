package com.flawden.module2.homework7;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        StringListImpl stringList = new StringListImpl();
        for (int i = 0; i < 5; i++) {
            stringList.add(String.valueOf(i));
            System.out.println("size: " + stringList.size());
        }

        StringListImpl stringList2 = new StringListImpl();
        for (int i = 0; i < 5; i++) {
            stringList2.add(String.valueOf(i));
        }

        StringListImpl stringList3 = new StringListImpl();
        for (int i = 0; i < 5; i++) {
            stringList3.add(String.valueOf(i));
        }

        System.out.println("==========");
        System.out.println(stringList);
        System.out.println("= = = = = = =");
        stringList.add(5, "TEST");
        System.out.println(stringList + ", тестируем add");
        System.out.println("= = = = = = =");
        System.out.println("size: " + stringList.size() + ", тестируем size");
        System.out.println(stringList.remove("TEST") + ", тестируем remove");
        System.out.println(stringList);
        System.out.println(stringList.remove("3") + ", тестируем remove");
        System.out.println(stringList);
        System.out.println(stringList.contains("23") + ", тестируем contains");
        System.out.println(stringList.contains("4e213412") + ", тестируем contains 2");
        System.out.println(stringList.indexOf("23") + ", тестируем indexOf");
        System.out.println(stringList.indexOf("4") + ", тестируем indexOf");
        System.out.println(stringList.lastIndexOf("0") + ", тестируем lastIndexOf");
        System.out.println(stringList.remove(1) + ", тестируем remove by Index");
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
