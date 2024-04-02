package com.flawden.module2.homework4;

import com.flawden.module2.homework4.exceptions.WrongPasswordException;

import javax.security.auth.login.LoginException;

public class MainWhenAllCorrect {

    public static void main(String[] args) {
        try {
            AuthMethod.authorization("Login", "Password", "Password");
        } catch (LoginException e) {
            System.out.println(e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Сделаем вид, что эту ошибку я обработал по другому");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Мы не знаем, что это такое. Если б мы знали что это такое - мы не знаем что это такое.");
        }
    }

}
