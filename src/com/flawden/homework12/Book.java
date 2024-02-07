package com.flawden.homework12;

public class Book {

    private String title;
    private Author author;
    private int age;

    public Book(String title, Author author, int age) {
        this.title = title;
        this.author = author;
        this.age = age;
    }

    public String getName() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
