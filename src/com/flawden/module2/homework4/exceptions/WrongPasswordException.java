package com.flawden.module2.homework4.exceptions;

public class WrongPasswordException extends RuntimeException {

    public WrongPasswordException() {super();}
    public WrongPasswordException(String message) {
        super(message);
    }

}
