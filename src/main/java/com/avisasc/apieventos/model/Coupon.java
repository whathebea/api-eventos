package com.avisasc.apieventos.model;

import lombok.*;

import java.util.Random;



public class Coupon {
    private String code;

    public String generateCouponCode(Evento evento) {
        String eventName = evento.getName().toUpperCase().replace(" ", "-");
        String year = String.valueOf(evento.getDate().getYear());
        String randomString = generateRandomString();

        return code = eventName + "-" + year + "-" + randomString;
    }

    private String generateRandomString() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(8);

        for (int i = 0; i < 8; i++) {
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            sb.append(randomChar);
        }

        return sb.toString();
    }

}
