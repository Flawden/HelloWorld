package com.flawden.module2.homework4;

import com.flawden.module2.homework4.exceptions.WrongPasswordException;

import javax.security.auth.login.LoginException;

public class AuthMethod {

    public static void authorization(String login, String password, String confirmPassword) throws LoginException {
        if (login.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            return;
        }
        if (!login.matches("[a-zA-Z_]+") || login.length() > 20) {
            throw new LoginException("Ошибка! Логин хрень...Сказал бы я, если бы меня за это " +
                    "не уволили.\nА так - логин должен содержать только латинские буквы, " +
                    "символы нижнего подчеркивания и быть меньше 20 символов");
        }
        if (password != confirmPassword) {
            throw new WrongPasswordException("Ошибка! Отправленные пароли не совпадают.");
        }
    }

}
