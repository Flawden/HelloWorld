package com.flawden.module2.homework8;

import com.flawden.module2.homework7.StringList;

import java.util.Arrays;

public class IntegerListImpl implements IntegerList, java.io.Serializable {

    @java.io.Serial
    private static final long serialVersionUID = 1238219132;

    private static final int DEFAULT_CAPACITY = 0;
    private int size = 0;

    private transient Integer[] ints;

    public IntegerListImpl() {
        ints = new Integer[DEFAULT_CAPACITY];
    }

    private void grow() {
        if (ints.length == 0) {
            ints = new Integer[1];
            return;
        }
        Integer[] newIntegerArray = new Integer[ints.length + 1];
        System.out.println(ints.length);
        for (int i = 0; i <= newIntegerArray.length - 2; i++) {
            newIntegerArray[i] = ints[i];
        }
        ints = newIntegerArray;
    }

    private void reduce() {
        if (ints.length == 0) {
            throw new IllegalArgumentException("Массив и так нулевой, куда еще меньше?");
        }
        Integer[] newIntegerArray = new Integer[ints.length - 1];
        System.out.println(ints.length);
        for (int i = 0; i <= newIntegerArray.length - 1; i++) {
            newIntegerArray[i] = ints[i];
        }
        ints = newIntegerArray;
    }


    @Override
    public Integer add(Integer item) {
        grow();
        this.ints[size] = item;
        size++;
        return ints[size - 1];
    }

    @Override
    public Integer add(int index, Integer item) {
        if (index > size) {
            throw new IllegalArgumentException("В массиве отсутствует элемент с данным индексом.");
        }
        grow();
        for (int i = size - 1; i >= index; i--) {
            ints[i + 1] = ints[i];
        }
        ints[index] = item;
        size++;
        return ints[index];
    }

    @Override
    public Integer set(int index, Integer item) {
        if (index >= size) {
            throw new IllegalArgumentException("В массиве отсутствует элемент с данным индексом.");
        }
        ints[index] = item;
        return ints[index];
    }

    @Override
    public Integer remove(int index) {
        if (index > size) {
            throw new IllegalArgumentException("В массиве отсутствует элемент с данным индексом.");
        }
        size--;
        Integer item = ints[index];
        for (int i = index; i < size; i++) {
            ints[i] = ints[i + 1];
        }
        reduce();
        return item;
    }

    @Override
    public boolean contains(Integer item) {
        for (int i = 0; i < size; i++) {
            if (ints[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(Integer item) {
        for (int i = 0; i < size; i++) {
            if (ints[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Integer item) {
        for (int i = size - 1; i >= 0; i--) {
            if (ints[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Integer get(int index) {
        if (index > size) {
            throw new IllegalArgumentException("В массиве отсутствует элемент с данным индексом.");
        }
        return ints[index];
    }

    @Override
    public boolean equals(IntegerList otherList) {
        if (otherList == null) {
            throw new NullPointerException("Ошибка! Вместо массива пришел какой-то Null. Мы такое не любим.");
        }
        if (otherList.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!otherList.get(i).equals(ints[i])) {
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
            ints[i] = null;
        }
        size = 0;
    }

    @Override
    public Integer[] toArray() {
        Integer[] intArray = new Integer[size];
        for (int i = 0; i < size; i++) {
            intArray[i] = ints[i];
        }
        return intArray;
    }

    @Override
    public String toString() {
        return "StringListImpl{" +
                "size=" + size +
                ", strings=" + Arrays.toString(ints) +
                '}';
    }
}
