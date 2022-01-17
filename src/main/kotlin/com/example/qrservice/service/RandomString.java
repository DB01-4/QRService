package com.example.qrservice.service;

import java.util.Random;

public class RandomString {


    public static final String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static final String digits = "0123456789";

    private Random rand = new Random();


    public String GenerateNewKey() {
        String key = "";
        for (int i = 0; i < 5; i++) {
            int r = rand.nextInt(letters.length());
            key += letters.charAt(r);
        }

        for (int i = 0; i < 2; i++) {
            int r = rand.nextInt(digits.length());
            key += digits.charAt(r);
        }

        for (int i = 0; i < 2; i++) {
            int r = rand.nextInt(letters.length());
            key += letters.charAt(r);
        }
        return key;


    }
}