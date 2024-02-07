package com.flawden.homework12;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return age == book.age && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, age);
    }

    @Override
    public String toString() {
        return "Название книги: " + title + ".\n" +
                "Автор = " + author.getName() + " " + author.getSurname() + ".\n" +
                "Год издания: " + age;
    }
}
