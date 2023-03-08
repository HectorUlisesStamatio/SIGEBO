package com.sicobo.sicobo.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    private static final String PASSWORD_PATTERN = "^(?=^.{12,}$)(?=.*\\d)(?=.*[!@#$%^&*]+)(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$";

    private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

    public boolean isValid(final String password) {
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
