package com.mesaj.app.util;

import java.util.Random;

public class RandomNumberGenerator {

    public static String get() {
        String firstNumber = randomNumber(311111111, 399999999);
        String secondNumber = randomNumber(1, 9);
        return String.format("%s%s", firstNumber, secondNumber);
    }

    public static String randomNumber(int min, int max) {
        Random r = new Random();
        return String.valueOf(r.nextInt((max - min) + 1) + min);
    }

}
