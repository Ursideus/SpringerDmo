package com.ursideus.robitics;

import java.util.Random;

/**
 * Created by dovw on 11/16/15.
 */
public class RandomText {

    private static String[] texts = {
            "I'll be back",
            "Get out!",
            "I want your cloths, boots and motorcycle",
            null
    };

    public String getText() {
        Random random = new Random();
        return texts[random.nextInt(texts.length)];
    }
}
