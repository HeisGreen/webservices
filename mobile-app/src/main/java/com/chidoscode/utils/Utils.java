package com.chidoscode.utils;

import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.Random;

@Component
public class Utils {
    private final Random random = new SecureRandom();
    private final String alphabets = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public String generateUserId(int length){
        return generateRandomString(length);
    }

    private String generateRandomString(int length){
        StringBuilder returnValue = new StringBuilder(length);

        for (int i = 0; i < length; i++){
            returnValue.append(alphabets.charAt(random.nextInt(alphabets.length())));
        }
        return new String(returnValue);
    }
}
