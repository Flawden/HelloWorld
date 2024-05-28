package com.flawden.module2.homework7;

import java.util.Arrays;
import java.util.Objects;

public class StringListImpl implements StringList, java.io.Serializable {

    @java.io.Serial
    private static final long serialVersionUID = 1238219132;

    private static final int DEFAULT_CAPACITY = 0;
    private int size = 0;

    private transient String[] strings;

    public StringListImpl() {
        this.strings = new String[DEFAULT_CAPACITY];
    }

    private void grow() {
        if (strings.length == 0) {
            strings = new String[1];
            return;
        }
        String[] newStringArray = new String[strings.length + 1];
        System.out.println(strings.length);
        for (int i = 0; i <= newStringArray.length - 2; i++) {
            newStringArray[i] = strings[i];
        }
        strings = newStringArray;
    }

    private void reduce() {
        if (strings.length == 0) {
            throw new IllegalArgumentException("Массив и так нулевой, куда еще меньше?");
        }
        String[] newStringArray = new String[strings.length - 1];
        System.out.println(strings.length);
        for (int i = 0; i <= newStringArray.length - 1; i++) {
            newStringArray[i] = strings[i];
        }
        strings = newStringArray;
    }

    @Override
    public String add(String item) {
        grow();
        this.strings[size] = item;
        size++;
        return strings[size - 1];
    }

    @Override
    public String add(int index, String item) {
        if (index > size) {
            throw new IllegalArgumentException("В массиве отсутствует элемент с данным индексом.");
        }
        grow();
        for (int i = size - 1; i >= index; i--) {
            strings[i + 1] = strings[i];
        }
        strings[index] = item;
        size++;
        return strings[index];
    }

    @Override
    public String set(int index, String item) {
        if (index >= size) {
            throw new IllegalArgumentException("В массиве отсутствует элемент с данным индексом.");
        }
        strings[index] = item;
        return strings[index];
    }

    @Override
    public String remove(String item) {
        for (int i = 0; i < size; i++) {
            if (strings[i].equals(item)) {
                size--;
                for (int j = i; j < size; j++) {
                    strings[j] = strings[j + 1];
                }
                reduce();
                return item;
            }
        }
        throw new IllegalArgumentException("Элемент с указанным значением не найден.");
    }

    @Override
    public String remove(int index) {
        if (index > size) {
            throw new IllegalArgumentException("В массиве отсутствует элемент с данным индексом.");
        }
        size--;
        String item = strings[index];
        for (int i = index; i < size; i++) {
            strings[i] = strings[i + 1];
        }
        reduce();
        return item;
    }

    @Override
    public boolean contains(String item) {
        for (int i = 0; i < size; i++) {
            if (strings[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(String item) {
        for (int i = 0; i < size; i++) {
            if (strings[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(String item) {
        for (int i = size - 1; i >= 0; i--) {
            if (strings[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String get(int index) {
        if (index > size) {
            throw new IllegalArgumentException("В массиве отсутствует элемент с данным индексом.");
        }
        return strings[index];
    }

    @Override
    public boolean equals(StringList otherList) {
        if (otherList == null) {
            throw new NullPointerException("Ошибка! Вместо массива пришел какой-то Null. Мы такое не любим.");
        }
        if (otherList.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!otherList.get(i).equals(strings[i])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        if(size > 0) {
            return false;
        }
        return true;

    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            strings[i] = null;
        }
        size = 0;
    }

    @Override
    public String[] toArray() {
        String[] stringArray = new String[size];
        for (int i = 0; i < size; i++) {
            stringArray[i] = strings[i];
        }
        return stringArray;
    }

    @Override
    public String toString() {
        return "StringListImpl{" +
                "size=" + size +
                ", strings=" + Arrays.toString(strings) +
                '}';
    }
}
